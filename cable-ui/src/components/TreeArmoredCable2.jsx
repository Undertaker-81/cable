import React, {Component} from 'react';
import ArmoredCableService from "../services/ArmoredCableService";
import BraidedWireService from "../services/BraidedWireService";
import SuperTreeview from 'react-super-treeview';


let ArmoredDto2 = require('../model/new/ArmoredDto2.js')
let BraidedWireDto2 = require('../model/new/BraidedWireDto2.js')

class TreeArmoredCable2 extends Component {
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

                armoreds.push(new ArmoredDto2(cable.trackId, cable.trackId + " - " + cable.cableName
                    + " длинна: " + cable.cableLength, [], false, false, false))
            })
            this.setState({armoredCable : armoreds});
        });
    }
    clickItem(key, level){
        let armoreds = this.state.armoredCable;
        if (level===0) {
            let braideds = [];

            BraidedWireService.getBraidedWireByArmored(key).then((response) => {

                response.data.map(cable => {
                    braideds.push(new BraidedWireDto2(cable.trackId, cable.trackId + " - "+ cable.name
                        + " длинна: " + cable.length, [], false, false))
                })
            });
            //  console.log(braideds)

            let count = armoreds.findIndex(cable => cable.id === key)
            armoreds[count].children = braideds
            armoreds[count].isExpanded = true

            this.setState({armoredCable : armoreds})
            console.log(armoreds)

            //https://github.com/azizali/react-super-treeview
        }
        return armoreds
    };

    render() {
        return (
            <div className="row">
                <div className="col-xs-12 col-lg-8 col-md-8">
                    <div className="panel panel-default">
                        <div className="panel-body">
                            <SuperTreeview
                                data={ this.state.armoredCable }
                                onUpdateCb={(updatedData)=>{
                                    this.setState({armoredCable: updatedData})
                                }}
                                isCheckable={()=>false}
                                isDeletable={()=>false}
                               isExpandable={(node, depth)=>{ return true; }}
                                onExpandToggleCb={(node, depth)=>{

                                    if(node.isExpanded === true){
                                        // This will show the loading sign
                                        node.isChildrenLoading = true;

                                        setTimeout(()=>{
                                            const updatedData = this.clickItem(node.id, depth);
                                       // Update state
                                            this.setState({armoredCable: updatedData})

                                        }, 1700);
                                    }
                                }}
                            />

                        </div>
                    </div>
                </div>

            </div>
        );
    }
}

export default TreeArmoredCable2;