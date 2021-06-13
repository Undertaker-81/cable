import axios from "axios";

const TINNED_BASE_URL_API = "http://localhost:8080/tinned/";

class TinnedWireService {
    getWireByTinned(tinnedId){
        return axios.get(TINNED_BASE_URL_API + tinnedId + "/wire")
    }
}
export default new TinnedWireService();