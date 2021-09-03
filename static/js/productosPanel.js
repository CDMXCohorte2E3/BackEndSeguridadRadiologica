

// Cambio a uso del local storage para trabajar con el JSON

fetch('http://localhost:8080/api/productos/')
  .then(response => {
  return response.json()
    })
  .then(data => {
    
    almacenLocal = data
    window.localStorage.setItem("productosLocalS", JSON.stringify(almacenLocal))
    anadirProductoPanel(almacenLocal);
    listaElementos(almacenLocal);
    habilitarDeshabilitar(almacenLocal);

  })

let almacenLocal = JSON.parse(window.localStorage.getItem("productosLocalS")) // Extraje la información que almacené en local storage

function anadirProductoPanel(productosPanel){

    const ancla = document.getElementById("productosPanel");
    let plantilla = "";
    
    productosPanel.forEach(function(producto){

      let card = `
      <div class="col-xs-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 div-centered" style="margin-top:100px;">
      <div class="card"> 
      <img src="${producto.image}" class="card-img-top" alt="..."> 
          <div class="card-body"> 
              <h4 class="card-title text-center">${producto.title}</h4> 
              <h6 class="card-subtitle mb-2 text-muted text-center">${producto.brand}</h6> 
              <h6 class="card-subtitle mb-2 text-muted text-center">${producto.model}</h6> 
              <h6 class="card-subtitle text-muted text-center">${producto.price}</h6> 
              <p class="card-text"> 
                  <ul style="list-style-position: inside;" id="lista-desor_${producto.id}"> 
                  </ul> 
              </p> 
              <div class="button text-center">      

              <!-- Inicio del modal -->
              <button type="button" class="btn btn-info" data-toggle="modal" data-target="#modalEditarProducto${producto.id}"> Editar
              </button>

                <div class="deshabilitar" id="botonHabilita${producto.id}" style="margin-top: 5px;">
                    <button type="button" id="habilita${producto.id}" class="btn btn-secondary btn-sm"> Deshabilitar
                    </button>  
                </div>
                
              <div class="modal fade" id="modalEditarProducto${producto.id}" tabindex="-1" aria-labelledby="modal-Panel-Edicion" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h5 class="modal-title" id="modal-Panel-Edicion"> Edición de ${producto.title} </h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                  </div>
                  <div class="modal-body">
                  <div class="adminForm">
                  <h4>Panel de edición</h4>

                  <!-- Inicia el form -->                
                  <form action="#" id="act-needs-validation${producto.id}" style="margin-bottom: 20px;" method="POST" novalidate>
                      <!--Formulario de edición-->
                      <div class="form-group">
                          <label for="validationCustom01">Nuevo nombre del producto: </label>
                          <input value="${producto.title}" type="text" name="product" class="form-control" id="actualizarNombre${producto.id}" maxlength="31"
                              required>
                          <div class="invalid-feedback">
                              <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                              Nombre válido es requerido
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="validationCustom01">Marca:</label>
                          <input value="${producto.brand}" type="text" name="marca" class="form-control" id="actualizarMarca${producto.id}" maxlength="31"
                              required>
                          <div class="invalid-feedback">
                              <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                              Marca válida es requerida
                          </div>
                      </div>

                      <div class="form-group">

                                <label for="validationCustom01">Precio: </label>
                                <input value="${producto.price}" type="text" name="precio" class="form-control" id="actualizarPrecio${producto.id}" maxlength="31"
                                    required>

                                <div class="invalid-feedback">
                                    <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                                    Precio válido es requerido
                                </div>
                      </div>


                      <div class="form-group">
                          <label for="validationCustom01">Modelo: </label>
                          <input value="${producto.model}" type="text" name="model" class="form-control" id="actualizarModelo${producto.id}" maxlength="31"
                              required>
                          <div class="invalid-feedback">
                              <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                              Modelo válido es requerido
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="image">Selecciona una imagen (.jpeg,.jpg,.png)</label>
                          <input type="file" class="form-control-file" name="image" id="image" accept=".jpeg,.jpg,.png">
                          <!-- <input value="${producto.image}" type="file" class="form-control-file" name="image" id="image" accept=".jpeg,.jpg,.png" onchange="ValidarTamaño(this);"> -->
                      </div>
                      <div class="form-group">
                          <label for="validationCustom01">Descripción: </label>
                          <textarea class="form-control" name="description" id="actualizarDescripcion${producto.id}" rows="3"
                              maxlength="280" placeholder="Detalle 1 | Detalle 2 | Detalle 3 | Detalle 4">${producto.description}</textarea>
                      </div>
                  </form>
                  <!--Fin de formulario de edición-->


              </div>
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal"> Cancelar </button>
                    <button id="submit_${producto.id}" type="submit" class="btn btn-info"> Guardar cambios </button>
                  </div>
                </div>
              </div>
            </div>
              </div>   
          </div> <!--card-body--> 
      </div><!--card--> 
      </div>`

        plantilla += card;

    }) // Fin del forEach

    ancla.innerHTML = plantilla;

    //Para cada producto trae el botón de submit de cada producto y ejecuta la función validateFormS con el click
    productosPanel.forEach(function(producto){
      let tempform = document.getElementById("submit_" + producto.id);
      tempform.addEventListener('click',validateFormS);

    });

} //Fin del anadirProducto


//Función de validación para cada producto

function validateFormS(e){
  
  e.preventDefault();
  let numProductos = e.target.id.split("_")[1]; //trae el id del producto

  validateForm2(numProductos); //Llama la función de validación del formulario para cada producto 

}



function listaElementos(json){
  let descr,spl,myDiv;
  for( i = 0 ; i < json.length ; i++ ){
    let descr = json[i].description;
    let spl = descr.split("|"); 
    let myDiv = document.getElementById("lista-desor_" + json[i].id);
  
  for (let j = 0; j < 4; j++) { 
    if (j < spl.length){         
      myDiv.innerHTML +="<li>"+ spl[j] + "</li>";     
    } else {         
      myDiv.innerHTML +="<br/>"
    }// else       
  }//for j
}// for i
}// fin de  listaElementos


// Función para editar productos desde el panel de admin

//Habilita-Deshabilita

function habilitarDeshabilitar(json){
  
  for( i = 0 ; i < json.length ; i++ ){
    let buton = document.getElementById("botonHabilita"+json[i].id);
    let status = json[i].status;
  
    const btnHabilita=`
      <button type="button" id="habilita${json[i].id}" class="btn btn-info btn-sm"> Habilitar
      </button>
    `;
    const btnDeshabilita=`
      <button type="button" id="habilita${json[i].id}" class="btn btn-secondary btn-sm"> Deshabilitar
      </button>
    `;

    if(status == true){
      buton.innerHTML = btnDeshabilita;
      let butonDeshabilita = document.getElementById("habilita"+json[i].id);
      let identi=json[i].id;
      butonDeshabilita.addEventListener("click", deshabilita);

      function deshabilita(e){
        e.preventDefault();
        //let numProductos = e.target.id.split("_")[1]; //trae el id del producto
        console.log(identi)
        
        let statusLS = JSON.parse(window.localStorage.getItem("productosLocalS"))
        console.log(statusLS[identi-1].status)
        statusLS[identi-1].status = false;
      
        window.localStorage.setItem("productosLocalS",JSON.stringify(statusLS)) // Reenvío la información a la base de datos
         window.location.reload()
         
      }//deshabilita

    }else if(status == false){
      buton.innerHTML = btnHabilita;
      let butonhabilita = document.getElementById("habilita"+json[i].id);
      //console.log(json[i].id)
      let identi=json[i].id;
      butonhabilita.addEventListener("click", habilita);

      function habilita(e){
        e.preventDefault();
        //let numProductos = e.target.id.split("_")[1]; //trae el id del producto
        console.log(identi)
        
        let statusLS = JSON.parse(window.localStorage.getItem("productosLocalS"))
        console.log(statusLS[identi-1].status)
        statusLS[identi-1].status = true;
      
        window.localStorage.setItem("productosLocalS",JSON.stringify(statusLS)) // Reenvío la información a la base de datos
         window.location.reload()
         
      }//deshabilita
    }//if

  }//for
 
}//habilitarDeshabilitar







//Validación del formulario
let form2 = document.getElementById('act-needs-validation');


let valid2 = 0;
function validateForm2(n){//validateForm
    
    let inputProduct = document.getElementById(`actualizarNombre${n}`);
    let inputMarca = document.getElementById(`actualizarMarca${n}`);
    let inputPrice = document.getElementById(`actualizarPrecio${n}`);
    let inputModel = document.getElementById(`actualizarModelo${n}`);
    let inputDescription = document.getElementById(`actualizarDescripcion${n}`);
    let inputImage = document.getElementById('image');

    function validateName(nombre){//validateName
      
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9. ]+$/)  
      let esValido = expReg.test(nombre);
      if(esValido == true){//if nombre
          inputProduct.classList.remove('is-invalid')
          inputProduct.classList.add('is-valid')
          return valid2 ++;
        }else{
          inputProduct.classList.add('is-invalid')
      }//if nombre
    }//validateName
    
    validateName(inputProduct.value)
    
    function validateMarca(marca){//validateMarca
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9. ]+$/)
      let esValido2 = expReg.test(marca);      
      if(esValido2 == true){//if Marca
          inputMarca.classList.remove('is-invalid')
          inputMarca.classList.add('is-valid')          
          return valid2 ++;
        }else{
          inputMarca.classList.add('is-invalid')          
      }//if Marca
    }//validateMarca
    
    validateMarca(inputMarca.value)

    function validatePrice(price){//validateModel
      //let expReg= /^[A-Z]+$/;
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9.$ ]+$/)
      let esValido3 = expReg.test(price);      
      if(esValido3 == true){//if Price
          inputPrice.classList.remove('is-invalid')
          inputPrice.classList.add('is-valid')          
          return valid2 ++;
        }else{
          inputPrice.classList.add('is-invalid')          
      }//if Price
    }//validatePrice
    validatePrice(inputPrice.value)

    function validateModel(model){//validateModel
      //let expReg= /^[A-Z]+$/;
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9. ]+$/)
      let esValido4 = expReg.test(model);      
      if(esValido4 == true){//if Model
          inputModel.classList.remove('is-invalid')
          inputModel.classList.add('is-valid')          
          return valid2 ++;
        }else{
          inputModel.classList.add('is-invalid')          
      }//if Model
    }//validateModel
    
    validateModel(inputModel.value)
    
    function validateDescription(description){//validateDescription
      //let expReg= /^[A-Z]+$/;
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9.,| ]+$/)
      let esValido5 = expReg.test(description);      
      if(esValido5 == true){//if Description
          inputDescription.classList.remove('is-invalid')
          inputDescription.classList.add('is-valid')          
          return valid2 ++;
        }else{
          inputDescription.classList.add('is-invalid')          
      }//if Description
    }//validateDescription

    validateDescription(inputDescription.value)

    if (valid2==5){      
      guardarCambios(n);
      window.location.reload()
    }
    return valid2 = 0;
}//validateForm2



function guardarCambios(id){
  
  let variableLS = JSON.parse(window.localStorage.getItem("productosLocalS"))

  variableLS[id - 1].titulo = document.getElementById("actualizarNombre" + id).value;
  variableLS[id - 1].marca =  document.getElementById("actualizarMarca" + id).value;
  variableLS[id - 1].precio =  document.getElementById("actualizarPrecio" + id).value;
  variableLS[id - 1].modelo = document.getElementById("actualizarModelo" + id).value;
  variableLS[id - 1].descripcion = document.getElementById("actualizarDescripcion" + id).value
  variableLS[id - 1].status = "1";


  window.localStorage.setItem("productosLocalS",JSON.stringify(variableLS)) // Reenvío la información a la base de datos
  window.location.reload()

}  
// Aquí termina el bloque de funciones para editar los productos 