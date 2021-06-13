import React, {Component} from 'react';
import ArmoredCableService from "../services/ArmoredCableService";
import BraidedWireService from "../services/BraidedWireService";
import LeadCoatedWireService from "../services/LeadCoatedWireService";
import InsulatedWireService from "../services/InsulatedWireService";
import TinnedWireService from "../services/TinnedWireService";
import SuperTreeview from 'react-super-treeview';
import "./style.css";



let ArmoredDto = require('../model/ArmoredDto.js')
let BraidedWireDto = require('../model/BraidedWireDto.js')
let LeadCoatedDto = require('../model/LeadCoatedDto')
let InsulatedDto = require('../model/InsulatedDto')
let TinnedDto = require('../model/TinnedDto')
let WireDto = require('../model/WireDto')

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
                armoreds.push(new ArmoredDto(cable.trackId, cable.trackId + " - " + cable.cableName
                    + ", длинна: " + cable.cableLength + ", сечение: " + cable.cableCrossSection, [], false, false, true))
            })
            this.setState({armoredCable : armoreds});
        });
    }
    clickItem(key, level){
        let armoreds = this.state.armoredCable;

        if (level===0) {
            let braideds = [];
            ArmoredCableService.getBraidedWireByArmored(key).then((response) => {

                response.data.map(cable => {
                    braideds.push(new BraidedWireDto(cable.trackId, cable.trackId + " - "+ cable.name
                        + ", длинна: " + cable.length , [], false, false, false))
                })
            });
            //  console.log(braideds)

            let count = armoreds.findIndex(cable => cable.id === key)
            armoreds[count].children = braideds
            armoreds[count].isExpanded = true
            armoreds[count].isChildrenLoading = false

            //https://github.com/azizali/react-super-treeview
        }
        if (level===1){
            let leadCoatedWires = [];
        /*   const findItemNested = (arr, itemId, nestingKey) => (
                arr.reduce((a, item) => {
                    if (a) return a;
                    if (item.id === itemId) return item;
                    if (item[nestingKey]) return findItemNested(item[nestingKey], itemId, nestingKey)
                }, null)
            );
            const res = findItemNested(armoreds, key, "children");*/
            BraidedWireService.getLeadCoatedWireByBraided(key).then((response) => {

                    const cable = response.data
                    leadCoatedWires.push(new LeadCoatedDto(cable.trackId, cable.trackId + " - "+ cable.name
                        + ", длинна: " + cable.length , [], false, false, false))
              //  console.log(leadCoatedWires)
            });

           armoreds.forEach(function (armored){
                armored.children.forEach(function (braided){
                   if (braided.id === key){
                       braided.children = leadCoatedWires;
                       braided.isExpanded = true;
                       braided.isChildrenLoading = false;
                   }
                })
            });

        }
        if (level === 2){
            let insulateds =[];
            LeadCoatedWireService.getInsulatedWireByLeadCoated(key).then((response) => {
                const cable = response.data
                insulateds.push(new InsulatedDto(cable.trackId, cable.trackId + " - "+ cable.name
                    + ", длинна: " + cable.length , [], false, false, false))
            })
            armoreds.forEach(function (armored){
                armored.children.forEach(function (braided){
                    braided.children.forEach(function (leadCoated){
                        if (leadCoated.id === key){
                            leadCoated.children = insulateds;
                            leadCoated.isExpanded = true;
                            leadCoated.isChildrenLoading = false;
                        }
                    })

                })
            });
        }
        if (level === 3){
            let tinneds = []
            InsulatedWireService.getTinnedWireByInsulated(key).then((response) => {
               response.data.map(cable => {
                   tinneds.push(new TinnedDto(cable.trackId, cable.trackId + " - "+ cable.name
                       + ", длинна: " + cable.length , [], false, false, false))
               })
            })
            armoreds.forEach(function (armored){
                armored.children.forEach(function (braided){
                    braided.children.forEach(function (leadCoated){
                        leadCoated.children.forEach(function (insulated) {
                            if (insulated.id === key){
                                insulated.children = tinneds;
                                insulated.isExpanded = true;
                                insulated.isChildrenLoading = false;
                            }
                        })

                    })

                })
            });
        }
        if (level === 4) {
            let wire =[]
            TinnedWireService.getWireByTinned(key).then((response) => {
                response.data.map(cable => {
                    wire.push(new WireDto(cable.nameWire, false))
                })
            })
            armoreds.forEach(function (armored){
                armored.children.forEach(function (braided){
                    braided.children.forEach(function (leadCoated){
                        leadCoated.children.forEach(function (insulated) {
                            insulated.children.forEach(function (tinned) {
                                if (tinned.id === key){
                                    tinned.children = wire;
                                    tinned.isExpanded = true;
                                    tinned.isChildrenLoading = false;
                                }
                            })

                        })

                    })

                })
            });
        }
      //  console.log(armoreds)
        return armoreds
    };

    render() {
        return (
            <div className="container">
                <div className="row">
                    <div className="col-md-12 text-lg-left">
                        <SuperTreeview
                            data={ this.state.armoredCable }
                            onUpdateCb={(updatedData = this.state.armoredCable)=>{
                                this.setState({armoredCable: updatedData})
                            }}
                            isCheckable={()=>false}
                            isDeletable={()=>false}
                            isExpandable={(node, depth)=>{ return depth < 5; }}
                            onExpandToggleCb={(node, depth)=>{

                                if(node.isExpanded === true){
                                    // This will show the loading sign

                                    node.isChildrenLoading = true;
                                    const updatedData =  this.clickItem(node.id, depth);
                                    setTimeout(()=>{
                                        // node.isChildrenLoading = false;
                                        // Update state
                                        this.setState({armoredCable: updatedData})
                                      //  console.log(node.id)

                                    }, 500);
                                }
                            }}

                        />
                    </div>

                </div>
            </div>

        );
    }
}

export default TreeArmoredCable;