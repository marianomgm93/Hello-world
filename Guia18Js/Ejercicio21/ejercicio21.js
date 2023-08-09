/*Escribir un programa para obtener un array de las propiedades de un objeto Persona.
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.*/
class Persona{
    constructor(nombre,edad,sexo,peso,altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
}

const persona1=new Persona('anto',29,'mujer',65,1.69);
let personaArr=new Array();
for (const key in persona1) {
    personaArr.push(persona1[key]);
}
alert(personaArr);
