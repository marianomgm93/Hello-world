export const API_RM={
    URL:"https://rickandmortyapi.com/api",
    CHARACTERS:function(){
        return `${this.URL}/character`
    },
    CHARACTERS_BYID:function(id){
        return `${this.URL}/character/${id}`
    }
}