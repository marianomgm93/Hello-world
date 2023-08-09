/*Escribir una función que reciba un String y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript”*/
let frase=prompt("Ingrese la frase");
frase="hola"
console.log(frase);
const fraseArr=frase.split(' ');
console.log(fraseArr);
var palabraMasLarga=fraseArr[0];
for (let i = 1; i < fraseArr.length; i++) {
    if(palabraMasLarga.length<fraseArr[i].length){
        palabraMasLarga=fraseArr[i];
    }
}
alert(`La palabra mas larga es ${palabraMasLarga}`);
