/*
Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
muestre el siguiente array [6, 9, 12, 15, 18].
*/
/*
arregloA=[[3], [6], [9], [12], [15]];
alert(`arreglo A inicial:\n[${arregloA}]`)
arregloA.push(arregloA[0][0]+arregloA[arregloA.length-1][0]);
arregloB=arregloA.slice(1,arregloA.length);
alert(`arreglo A final:\n[${arregloB}]`);
*/
arregloA=[[3], [6], [9], [12], [15]];
alert(`arreglo inicial:\n[${arregloA}]`);
arregloB=[];
for (let i = 0; i < arregloA.length; i++) {
    arregloB.push(arregloA[i][0]+3);

}
alert(`arreglo final:\n[${arregloB}]`);