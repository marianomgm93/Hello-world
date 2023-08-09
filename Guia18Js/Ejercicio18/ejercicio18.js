/*
A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
dos elementos numéricos
*/

var valores = [true, 5, false, "hola", "adios", 2];
let palabraMasLarga="";
let boolean1=null;
let boolean2=null;
let a=null;
let b=null;
const calcular=(num1,num2)=>`num1=${num1}\nnum2=${num2}\nSuma=${num1+num2}\nResta=${num1-num2}\nProducto=${num1*num2}\nDivision=${num1/num2}\nResto=${num1%num2}`;
for (let index = 0; index < valores.length; index++) {
    if(typeof valores[index]=='string'){
        if (palabraMasLarga.length<valores[index].length) {
            palabraMasLarga=valores[index];
        }
    }else if(typeof valores[index]=='boolean'){
        if(boolean1!==null){
            boolean2=valores[index];
          }else{
            boolean1=valores[index];
          }

    }else if(typeof valores[index]==='number'){
      if(a!==null){
        b=valores[index];
      }else{
        a=valores[index];
      }
    }
}
alert(`La palabra mas larga es = ${palabraMasLarga}`);
alert(`Comparando boolean1!==boolean2? ${boolean1!==boolean2}\nComparando boolean1===boolean2? ${boolean1===boolean2}`);
alert(calcular(a,b));
