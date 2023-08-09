/*
19. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
de 20.
*/
let arregloA=[];
let arregloB=[];

function compareNumbers(a, b) {
    return a - b;
  }
for (let i = 0; i < 50; i++) {
    arregloA[i]=parseInt(Math.random()*100);
}
alert(`Arreglo A=[${arregloA}]`);
arregloA=arregloA.sort(compareNumbers);
alert(`Arreglo A=[${arregloA}]`);
arregloB=arregloA.slice(0,10);
for (let i = 0; i < 10; i++) {
    arregloB.push(0.5);
}
alert(`Arreglo B=[${arregloB}]`);