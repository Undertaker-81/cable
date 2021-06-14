import './App.css';
import ListArmeredCable from "./components/ListArmeredCable";
import TreeArmoredCable from "./components/TreeArmoredCable";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";
import {NavSidebar} from "./components/sidebar/NavSidebar";
import Armored from "./pages/armored";


function App() {
  return (
   <div>
         <BrowserRouter>
             <HeaderComponent />
                <Switch>
                    <Route path="/">
                        <Armored />
                    </Route>
                </Switch>
             <FooterComponent />
         </BrowserRouter>
     </div>




  /*  <div className="App">
      <header className="container">
        <TreeArmoredCable/>
      </header>
    </div>

   */
  );
}

export default App;
