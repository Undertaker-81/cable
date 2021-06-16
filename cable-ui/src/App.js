import './App.css';
import  { BrowserRouter, Route} from "react-router-dom";
import {  Switch, Router } from 'react-router';
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";
import Armored from "./pages/armored";
import Home from "./pages/home";


function App() {
  return (
   <div>
         <BrowserRouter>
             <HeaderComponent />
                <Switch>
                    <Route path="/" component={Home}/>

                    <Route path="/armored" component={Armored}/>

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
