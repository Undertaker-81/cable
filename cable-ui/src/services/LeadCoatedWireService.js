import axios from "axios";

const LEAD_COATED_BASE_URL_API = "http://localhost:8080/leadCoated/";

class LeadCoatedWireService {
    getInsulatedWireByLeadCoated(leadCoatedId){
        return axios.get(LEAD_COATED_BASE_URL_API + leadCoatedId + "/insulated")
    }
}
export default new LeadCoatedWireService();