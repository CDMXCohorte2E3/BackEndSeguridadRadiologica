//Validación del formulario
let form = document.getElementById('needs-validation');

let valid = 0;
function validateForm(e){//validateForm
    //No ejecutes
    e.preventDefault();
    let inputProduct = document.getElementById('product');
    let inputMarca = document.getElementById('marca');
    let inputPrice = document.getElementById('precio');
    let inputModel = document.getElementById('model');
    let inputDescription = document.getElementById('description');
    let inputImage = document.getElementById('image');

    function validateName(nombre){//validateName
      
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9. ]+$/)  
      let esValido = expReg.test(nombre);
      if(esValido == true){//if nombre
          inputProduct.classList.remove('is-invalid')
          inputProduct.classList.add('is-valid')
          return valid ++;
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
          return valid ++;
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
          return valid ++;
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
          return valid ++;
        }else{
          inputModel.classList.add('is-invalid')          
      }//if Model
    }//validateModel
    
    validateModel(inputModel.value)
    
    function validateDescription(description){//validateDescription
      //let expReg= /^[A-Z]+$/;
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9.| ]+$/)
      let esValido5 = expReg.test(description);      
      if(esValido5 == true){//if Description
          inputDescription.classList.remove('is-invalid')
          inputDescription.classList.add('is-valid')          
          return valid ++;
        }else{
          inputDescription.classList.add('is-invalid')          
      }//if Description
    }//validateDescription

    validateDescription(inputDescription.value)

    if (valid==5){      
      nuevoProducto();
      window.location.reload()
    }
    return valid = 0;
}//validateForm

//Eventos

form.addEventListener('submit',validateForm)

// Función para agregar un producto nuevo...

function nuevoProducto(evento){
  
  let inputProduct = document.getElementById('product').value;
  let inputMarca = document.getElementById('marca').value;
  let inputPrice = document.getElementById('precio').value;
  let inputModel = document.getElementById('model').value;
  let inputDescription = document.getElementById('description').value;
  let inputImage = document.getElementById('image').value;

  let traerLocalStorage = JSON.parse(window.localStorage.getItem("productosLocalS")) // Me traigo la base de datos

  // Aquí se "hace JSON" los valores que puso el admin en añadir producto
  const caracteristicasProducto = {
    "imagen": inputImage,
    "titulo" : inputProduct, 
    "marca": inputMarca,
    "precio": inputPrice,
    "modelo" : inputModel,
    "descripcion" : inputDescription,
    "id" : traerLocalStorage.length + 1,
    "status" : "1"
  }
  
  traerLocalStorage.push(caracteristicasProducto) // Como la base es un array, le hago push  
  window.localStorage.setItem("productosLocalS",JSON.stringify(traerLocalStorage)) // Reenvío la información a la base de datos
  window.location.reload()
}