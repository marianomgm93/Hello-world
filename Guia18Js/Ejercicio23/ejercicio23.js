function resaltar() {
    let mensaje=document.getElementById("parrafo");
    let separado=mensaje.innerText.split(" ");
    for (let i = 0; i < separado.length; i++) {
        if(separado[i].length>7){
            separado[i]='<span class="resaltado">'+separado[i]+'</span>';
        }        
    }
    mensaje.innerHTML=separado.join(" ");
}