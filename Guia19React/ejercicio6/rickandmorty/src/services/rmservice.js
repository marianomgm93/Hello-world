import { API_RM } from "../constants/api.constants";

 class rmservice{
    async getAllCharacters(){
        const response=await fetch(API_RM.CHARACTERS());
        return response.json();
    }
    async getCharactersById(id){
        const response=await fetch(API_RM.CHARACTERS_BYID(id));
        return response.json();
    }
}
export default new rmservice();