import axios from "axios";

const INSULATED_BASE_URL_API = "http://localhost:8080/insulated/";

class InsulatedWireService {
    getTinnedWireByInsulated(insulatedId){
        return axios.get(INSULATED_BASE_URL_API + insulatedId + "/tinned")
    }
}
export default new InsulatedWireService();