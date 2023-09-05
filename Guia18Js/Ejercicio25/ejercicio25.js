document.getElementById("form1").addEventListener("submit",function(event){
    event.preventDefault();
    const formData=new FormData(event.target);
    const nombre=formData.get("nombre");
    const apellido=formData.get("apellido");

    alert(`Bienvenido ${nombre} ${apellido} disfrute su estadia`);
});
