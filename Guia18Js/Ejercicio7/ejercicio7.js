var lim=parseInt(prompt("Ingrese un valor limite"));
var total=0;
do{
let num=parseInt(prompt("ingrese un numero para sumar"));
total+=num;

}while(total<lim);
alert(`Limite alcanzado total=${total} `);