import React, {Component} from 'react';
import {DashboardLayout} from "../components/sidebar/Layout";
import TreeArmoredCable from "../components/TreeArmoredCable";

class Armored extends Component {
    render() {
        return (
            <>
               <DashboardLayout>

                   <TreeArmoredCable />

               </DashboardLayout>
            </>
        );
    }
}

export default Armored;