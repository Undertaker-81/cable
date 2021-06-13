import axios from "axios";

const BRAIDED_BASE_URL_API = "http://localhost:8080/braided/";

class BraidedWireService {
    getLeadCoatedWireByBraided(braidedId){
        return axios.get(BRAIDED_BASE_URL_API  + braidedId + "/leadCoated")
    }
}
export default new BraidedWireService();