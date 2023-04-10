window.addEventListener('load', function () {
    /* ---------------------- obtenemos variables globales ---------------------- */
   
    const form = document.forms[0];
    const nombre = document.querySelector('#inputNombre');
    const apellido = document.querySelector('#inputApellido');
    const email = document.querySelector('#inputEmail');
    const password = document.querySelector('#inputPassword');
    const password2 = document.querySelector('#inputPasswordRepetida');
    
    const url = 'https://todo-api.ctd.academy/v1'; 
    

    /* -------------------------------------------------------------------------- */
    /*            FUNCIÓN 1: Escuchamos el submit y preparamos el envío           */
    /* -------------------------------------------------------------------------- */
    form.addEventListener('submit', function (event) {

        event.preventDefault();

        const payload = {
            firstname: nombre.value,
            lastName: apellido.value,
            email: email.value,
            password: password.value,
            password2: password2.value
        };

        const settings = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(payload),
            headers: {
                'Content-Type': 'application/json'
            },
        };

        realizarRegister(settings);

        form.reset(); // limpiamos el formulario
    });

    /* -------------------------------------------------------------------------- */
    /*                    FUNCIÓN 2: Realizar el signup [POST]                    */
    /* -------------------------------------------------------------------------- */
    function realizarRegister(settings) {
        console.log('enviando la consulta a la API');
        
        fetch(`${url}/users/register`, settings)
            .then(response => { //recibe la respuesta del servidor                            
                console.log(response);
                if (response.ok != true) {
                    alert('Usuario o contraseña incorrectos');
                }
                return response.json();                
            })
            .then(data => {
                console.log("promesa resuelta");                
                console.log(data);
                if (data.token) {
                    localStorage.setItem('token', data.token);   //guardo el JWT en el localStorage, este aun refrescando al pagina se mantiene, en cambio el sessionStorage se borra al refrescar la pagina
                    window.location.href = 'index.html';
                }
            })
            .catch(error => {
                console.log('error');
                console.log(error);
            });
        





    };


});