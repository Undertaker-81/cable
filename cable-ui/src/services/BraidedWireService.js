import axios from "axios";

const BRAIDED_BASE_URL_API = "http://localhost:8080/";

class BraidedWireService {
    getBraidedWireByArmored(armoredID){
        return axios.get(BRAIDED_BASE_URL_API + "braided/" + armoredID)
    }
}