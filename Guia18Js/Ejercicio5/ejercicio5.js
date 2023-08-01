let num1 = parseInt(prompt("Ingrese numero A"));
let num2 = parseInt(prompt("Ingrese numero B"));
var flag = true;
do {
    let option = prompt("Ingrese la opcion \ns=sumar \nr=restar \nm=multiplicar \nd=dividir \ne=salir").toLowerCase();
    switch (option) {
        case "s":
            let suma = num1 + num2;
            alert(`el resultado es ${suma}`);
            break;
        case "r":
            let resta = num1 - num2;
            alert(`el resultado es ${resta}`);
            break;
        case "m":
            let multiplicar = num1 * num2;
            alert(`el resultado es ${multiplicar}`);
            break;
        case "d":
            if (num2 != 0) {
                let dividir = num1 / num2;
                alert(`el resultado es ${dividir}`);
            } else {
                alert("La division por cero no esta definida");
            }
            break;
        case "e":
            flag = false;
            break;
        default:
            alert("La opcion ingresada no existe, intentelo nuevamente");
            break;
    }
} while (flag)