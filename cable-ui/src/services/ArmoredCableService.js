import axios from "axios";

const ARMORED_BASE_URL_API = "http://localhost:8080/armored/";
class ArmoredCableService {
    getAllArmoredCable(){
        return axios.get(ARMORED_BASE_URL_API + "all");
    }
    getBraidedWireByArmored(armoredID){
        return axios.get(ARMORED_BASE_URL_API + armoredID + "/braided" )
    }
}
export default new ArmoredCableService()