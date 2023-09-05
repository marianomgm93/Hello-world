
function calcular(event){
    event.preventDefault();
    const formData=new FormData(event.target);
    const num=formData.get("numero");
    alert(parseFloat(num*Math.PI));
    }
document.getElementById("formulario").addEventListener("submit", calcular);
