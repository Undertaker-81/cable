import React, {Component} from 'react';

class HeaderComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {

        }
    }
    render() {
        return (
            <div>
                <header>
                    <div className="navbar  navbar-light bg-blue-200 " >
                        <div className="container">
                            <a className="navbar-brand m-1">Учет кабеля</a>
                        </div>
                    </div>

                </header>
            </div>
        );
    }
}

export default HeaderComponent;