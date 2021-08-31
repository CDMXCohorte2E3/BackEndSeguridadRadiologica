//Validación del formulario
let form = document.getElementById('needs-validation');

let valid = 0;
function validateForm(e){//validateForm
    //No ejecutes
    e.preventDefault();
    let inputEmail = document.getElementById('emailIniciar');
    let inputContraseña = document.getElementById('passwordIniciar');


    function validateEmail(email){//validateEmail
      let expReg = new RegExp(/^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$/);
      let esValido = expReg.test(email);      
      if(esValido == true ){//if email 
        inputEmail.classList.remove('is-invalid')
        inputEmail.classList.add('is-valid')        
        return valid++;
      }else{
        inputEmail.classList.add('is-invalid')        
      }//if email
    }//validateEmail

    validateEmail(inputEmail.value)

    function validatePassword(password){//validatePassword
      let expReg = new RegExp(/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[/$@*#!%?&._-]).{6,12}$/);
      let esValido = expReg.test(password);      
      if(esValido == true ){//if email 
        inputContraseña.classList.remove('is-invalid')
        inputContraseña.classList.add('is-valid')        
        return valid++;
      }else{
        inputContraseña.classList.add('is-invalid')        
      }//if Password
    }//validatePassword

    validatePassword(inputContraseña.value)

    if (valid==2){
      iniciarSesion();
    }
    return valid = 0;
}//validateForm

//Eventos

form.addEventListener('submit',validateForm)


function Toast(){
  const Toast = Swal.mixin({
    toast: true,
    position: 'top-end',
    showConfirmButton: false,
    timer: 3000,
    timerProgressBar: true,
    didOpen: (toast) => {
      toast.addEventListener('mouseenter', Swal.stopTimer)
      toast.addEventListener('mouseleave', Swal.resumeTimer)
    } 
  });
  window.location.href = "./panelEdicionAdmin.html";

Toast.fire({
  icon: 'success',
  title: 'Inicio de sesión exitoso'
});

}//function Toast

// Inicio de sesión



function iniciarSesion(){
  
  const boton = document.getElementById('botonEnviar');
  const msgError = `
  <button type="submit" class="btn btn-info">Enviar</button>
  <small id="password" class="form-text text-danger">Contraseña o correo incorrectos</small>
  `;
  const msgYes = `
  <button type="submit" class="btn btn-info">Enviar</button>
  `
  
  let almacenLocal = JSON.parse(window.localStorage.getItem("listaRegistro"))
  
    let inputEmail2 = document.getElementById('emailIniciar');
    let inputContraseña2 = document.getElementById('passwordIniciar');

    let cont = 0;

  for( i = 0 ; i < almacenLocal.length ; i++){
    if( almacenLocal[i].email == inputEmail2.value ){
        
        cont++;
        //Toast();
        if( almacenLocal[i].password == inputContraseña2.value ){ 
          Toast();
          boton.innerHTML = msgYes;
          cont++;
          break
        } else {
          
          boton.innerHTML = msgError;
        } // if para comparar las contraseñas

    }else{
      
      boton.innerHTML = msgError;
    }//if

  }//for

  if(cont == 2){
    location.href ="panelEdicionAdmin.html";
    }

}//Iniciar sesión




