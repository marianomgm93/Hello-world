let array1=[];
let array2=[];

for (let index = 0; index < 5; index++) {
    array1[index]=parseInt(Math.random()*10);
    array2[index]=parseInt(Math.random()*10);
}
alert(`Array1=[${array1}] \nArray2=[${array2}]`);