let frase=prompt("Ingrese una frase");
let frase1="";
for(let i=0; i<frase.length;i++){
    if(i==0){
        frase1+=frase[i];
    }else{
        frase1+=" "+frase[i];
    }
}
alert(frase1);