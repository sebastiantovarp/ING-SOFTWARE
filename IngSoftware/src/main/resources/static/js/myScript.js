//Aqui se contienen todas las funciones que enlazan front y back. Ajax, trae la data y JS la muestra de forma bonita usando los archivos de CSS

$('Document').ready(function() {

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

function validateUserName(userName) {
  // Validar que el campo no esté vacío
  if (userName.trim() === '') {
    alert('Ingrese un correo');
    return false;
  }

  // Validar que el campo sea un correo electrónico válido
  if (!/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/.test(userName)) {
    alert('Por favor ingrese un correo electrónico válido');
    return false;
  }

  // Si se llega hasta aquí, el campo es válido
  return true;
}


function validatePassword(password) {
  // Validar que el campo no esté vacío
  if (password.trim() === '') {
    alert('El campo Contraseña no puede estar vacío');
    return false;
  }

  // Validar que el campo tenga al menos 8 caracteres
  if (password.length < 8) {
    alert('La contraseña debe tener al menos 8 caracteres');
    return false;
  }

  // Si se llega hasta aquí, el campo es válido
  return true;
}



function registerPersona(){

   if(validateUserName(#userName) && validatePassword(#password)){
         let persona={
                userName:$("#userName").val(),//DEBE ser el nombre del atributo de la entidad
                password:$("#password").val()  //DEBE ser el nombre del atributo de la entidad

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
                }
            });

}


function registerTarea(){

         let persona={
                userName:$("#userName").val(),//DEBE ser el nombre del atributo de la entidad
                password:$("#password").val()  //DEBE ser el nombre del atributo de la entidad

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