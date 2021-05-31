import axios from "axios";

const ARMORED_BASE_URL_API = "http://localhost:8080/";
class ArmoredCableService {
    getAllArmoredCable(){
        return axios.get(ARMORED_BASE_URL_API + "all");
    }
}
export default new ArmoredCableService()