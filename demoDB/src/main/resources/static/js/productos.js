//let almacenLocal2 = JSON.parse(window.localStorage.getItem("productosLocalS")) // Extraje la información que almacené en local storage

let almacenLocal2;
if(window.localStorage.getItem("productosLocalS")==null){
fetch('http://localhost:8080/api/productos/')
  .then(response => {
  return response.json()
    })
  .then(data => {
    
    almacenLocal2 = data
    window.localStorage.setItem("productosLocalS", JSON.stringify(almacenLocal2))
    anadirProducto(almacenLocal2)
    listaElementos(almacenLocal2)

  })
} else if(window.localStorage.getItem("productosLocalS")!=null){
  almacenLocal2 = JSON.parse(window.localStorage.getItem("productosLocalS"));
  anadirProducto(almacenLocal2);
  listaElementos(almacenLocal2);

}//else if 

function anadirProducto(productos){
  
    const ancla = document.getElementById("productos");
    let plantilla2 = "";
    
    productos.forEach(function(producto2){

      if(producto2.status==1){
        
        let card = `
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 div-centered" style="margin-top:100px;">
        <div class="card"> 

        <img src="${producto2.image}" class="card-img-top" alt="..."> 

            <div class="card-body"> 
                <h4 class="card-title text-center">${producto2.title}</h4> 
                <h6 class="card-subtitle mb-2 text-muted text-center">${producto2.brand}</h6> 
                <h6 class="card-subtitle mb-2 text-muted text-center">${producto2.model}</h6> 
                <h6 class="card-subtitle text-muted text-center">${producto2.price}</h6> 
                <p class="card-text"> 
                    <ul style="list-style-position: inside;" id="lista-desor_${producto2.id}"> 

                    </ul> 
                </p> 
                <div class="button text-center">      

                  <button class="btn btn-info btn-add-car" onclick="anadirCarrito(${producto2.id});">Comprar</button>   

                </div>   
            </div> <!--card-body--> 
        </div><!--card--> 
        </div>`


        plantilla2 += card;
        }else if(producto2.status==0){
          

        }//else if
        
      
        

    }) // Fin del forEach
    ancla.innerHTML = plantilla2;

} //Fin del anadirProducto
//anadirProducto(almacenLocal2);


// Función boton pop up
/*
const botonClase = document.getElementsByClassName("btn-add-car");

for(i=0 ; i < 12 ; i++){
  
  botonClase[i].addEventListener('click', function(e){
    e.preventDefault();
    
      new Swal({
        icon: 'success',
        title: 'AGREGADO AL CARRITO',
        showConfirmButton: false,
        timer: 1500,
        position: 'center',
      })
  })//addEventListener 
} // fin del for
*/
function listaElementos(json){
  let descr,spl,myDiv;
  
  for( i = 0 ; i < json.length ; i++ ){
    if(almacenLocal2[i].status==1){
      let descr = json[i].description;
      let spl = descr.split("|"); 
      let myDiv = document.getElementById("lista-desor_" + json[i].id);

      for (let j = 0; j < 4; j++) { 
        if (j < spl.length){         
          myDiv.innerHTML +="<li>"+ spl[j] + "</li>";     
        } else {         
         myDiv.innerHTML +="<br/>"
       }// if      
      }//for j
    }//if status
  }// for i
}// fin de  listaElementos



// función para añadir compras al carrito 
function  anadirCarrito(arg_id){
  new Swal({
    icon: 'success',
    title: 'AGREGADO AL CARRITO',
    showConfirmButton: false,
    timer: 1500,
    position: 'center',
  }) 

  // empujarTmp es la variable a pushear en el JSON para los productos agregados
  let empujarTmp = {
    "identificador" : arg_id
  }
  
  // Si la base local está vacía, la creo y le añado empujarTmp
  if( window.localStorage.getItem("identificadoresLocalS") == null ){
    
    let jsonTmp = [];
    jsonTmp.push(empujarTmp);
    window.localStorage.setItem("identificadoresLocalS",JSON.stringify(jsonTmp));
    
  // Si la base local no está vacía entonces me traigo la base y pusheo empujarTmp  
  }else if ( window.localStorage.getItem("identificadoresLocalS") != null ){

    let localSNotNull = JSON.parse(window.localStorage.getItem("identificadoresLocalS"));
    localSNotNull.push(empujarTmp); 
    window.localStorage.setItem("identificadoresLocalS", JSON.stringify(localSNotNull));  
        

  }

}
