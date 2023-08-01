let max = null;
let min = null;
let total = 0;
let contador = 0;
let num;
do {
    num = parseInt(prompt("Ingrese un numero"))
    if (num>0 && num<99999) {
        if (contador == 0) {
            max = num;
            min = num;
        }
        else if (max < num) {
            max = num;
        } else if (num < min) {
            min = num;
        }
        total += num;
        contador++;
    }

} while (num != 0)
let avg = total / contador;
alert(`max=${max} min=${min} promedio=${avg} total=${total} cantidad de numeros ingresados=${contador}`);