import React, {Component} from 'react';
import ArmoredCableService from "../services/ArmoredCableService";

class ListArmoredCable extends Component {
    constructor(props) {
        super(props);
        this.state = {
            armoredCable : []
        }
    }
    componentDidMount() {
        ArmoredCableService.getAllArmoredCable().then((res) =>{
            this.setState({armoredCable : res.data});
            });
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Cable</h2>
                <div className="row">
                    <table className="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th>name</th>
                                <th>nomenclatureId</th>
                                <th>cableCrossSection</th>
                                <th>cableLength</th>
                                <th>date</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.armoredCable.map(
                                    cable =>
                                        <tr key={cable.trackId}>
                                            <td>{cable.cableName}</td>
                                            <td>{cable.nomenclatureId}</td>
                                            <td>{cable.cableCrossSection}</td>
                                            <td>{cable.cableLength}</td>
                                            <td>{cable.dateArmored}</td>

                                        </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListArmoredCable;