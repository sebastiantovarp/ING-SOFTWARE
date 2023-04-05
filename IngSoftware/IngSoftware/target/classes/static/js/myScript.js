//Aqui se contienen todas las funciones que enlazan front y back. Ajax, trae la data y JS la muestra de forma bonita usando los archivos de CSS

$('Document').ready(function() {
    registerPersona();
});

//Metodos para traer todos los datos:
function getPersona(){
    $.ajax({
      url: 'api/persona',
      TYPE: 'GET',
      dataType: 'json',
      contentType: 'application/json; charset=utf-8',
      success: function(data) {
        // Procesar los datos
        console.log(data);
      },
      error: function(xhr, textStatus, errorThrown) {
      //Gestionar errores:
        console.log('Error al cargar el archivo JSON');
        console.log(textStatus+' '+errorThrown);
      }
    });
}

function getCalendario(){
    $.ajax({
      url: 'api/calendario',
      TYPE: 'GET',
      dataType: 'json',
      contentType: 'application/json; charset=utf-8',
      success: function(data) {
        // Procesar los datos
        console.log(data);
      },
      error: function(xhr, textStatus, errorThrown) {
      //Gestionar errores:
        console.log('Error al cargar el archivo JSON');
        console.log(textStatus+' '+errorThrown);
      }
    });
}

function getTarea(){
    $.ajax({
      url: 'api/tarea',
      TYPE: 'GET',
      dataType: 'json',
      contentType: 'application/json; charset=utf-8',
      success: function(data) {
        // Procesar los datos
        console.log(data);
      },
      error: function(xhr, textStatus, errorThrown) {
      //Gestionar errores:
        console.log('Error al cargar el archivo JSON');
        console.log(textStatus+' '+errorThrown);
      }
    });
}


function registerPersona(){

    let persona={
        name:$("#userName").val(),
        password:$("#password").val()

    }
    let dataToSend=JSON.stringify(persona); //Transformar en String a let persona.
    $.ajax({
        url: 'api/persona/save', //Especificamos la url
        type:'POST', //Colocamos el tipo de peticion como en PostMan
        data: dataToSend, //Aquí esta la data a enviar
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        success: function(data) {
            // Aquí procesamos los datos obtenidos
           console.log(data);
           getPersona();

            $("#userName").val("");
            $("#password").val("");

        },
        error: function(jqXHR, textStatus, errorThrown) {
            // Aquí manejamos cualquier error que pueda haber ocurrido
            console.log(textStatus + ': ' + errorThrown);
        }
    });

}