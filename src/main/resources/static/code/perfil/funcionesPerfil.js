let idClient = localStorage.getItem("idClient");

obtenerCliente()

function obtenerCliente(){
    $.ajax({
        url:"/api/Client/"+idClient,
        type:"GET",
        datatype:"JSON",
        success:function(respuesta){
            document.getElementById("nombre").innerHTML=respuesta.name;
        },
        error:function(xhr, respuesta){
            alert("Error de peticion")
        }
    });
}

function abrirEquipo(idEquipo){
    /*let fila = '<div class="filaCaramelos" id="fila'+cont+'"></div>';
    $("#caramelos").append(fila);
    for(i = 0; i<5;i++){
        let url = 'src="'+obtenerCaramelo()+'"';
        let tarjeta = `
        <div class="cardbox">
            <div class="card">
                <div class="cardbody">
                    <img class="cardImgage"`+url+`alt="Jugador">
                </div>
                <div class="back">
                    <h2 id="nombre">`+nombre+`</h2>
                    <p id="Posicion">`+posicion+`</p>
                    <p id="Numero Ficha">`+id+`</p>
                    <p id="Fecha Nacimiento">`+fecha+`</p>
                </div>
            </div>
        </div>`
         $("#fila"+cont).append(tarjeta);
    }*/
