import React, {Component} from 'react';
import ArmoredCableService from "../services/ArmoredCableService";
import BraidedWireService from "../services/BraidedWireService";
import TreeMenu from 'react-simple-tree-menu';

let ArmoredDto = require('../model/ArmoredDto.js')
let BraidedWireDto = require('../model/BraidedWireDto.js')


class TreeArmoredCable extends Component {
    constructor(props) {
        super(props);
        this.state = {
            armoredCable : []
        }

    }
    componentDidMount() {

        ArmoredCableService.getAllArmoredCable().then((res) =>{
            let armoreds = [];
            res.data.map(cable => {
              //  let braideds = [];
              /*  BraidedWireService.getBraidedWireByArmored(cable.trackId).then((response) => {

                    response.data.map(cable => {
                        braideds.push(new BraidedWireDto(cable.trackId, cable.trackId + " - "+ cable.name
                            + " длинна: " + cable.length, [], false, 1))
                    })
                });

               */
                armoreds.push(new ArmoredDto(cable.trackId, cable.trackId + " - " + cable.cableName
                + " длинна: " + cable.cableLength, [], false, true))
            })
            this.setState({armoredCable : armoreds});
        });
    }
    clickItem(key, level){
        if (level===0){
            let braideds = [];
            let armoreds = this.state.armoredCable;
            BraidedWireService.getBraidedWireByArmored(key).then((response) => {

                response.data.map(cable => {
                    braideds.push(new BraidedWireDto(cable.trackId, cable.trackId + " - "+ cable.name
                        + " длинна: " + cable.length, [], false, 1))
                })
            });
          //  console.log(braideds)

            let count = armoreds.findIndex(cable => cable.key === key)
            armoreds[count].nodes = braideds
            armoreds[count].isOpen = true

        this.setState({armoredCable : armoreds})
           console.log(armoreds)
            //https://github.com/iannbing/react-simple-tree-menu/blob/master/stories/index.stories.js
            //https://devexpress.github.io/devextreme-reactive/react/grid/docs/guides/tree-data/

        }
    };

    render() {
        return (
            <div>
                <TreeMenu data={this.state.armoredCable}
                 onClickItem={({ key, level, ...props }) => {
                              this.clickItem(key, level)}}
                hasSearch={false}
                />
            </div>
        );
    }
}

export default TreeArmoredCable;