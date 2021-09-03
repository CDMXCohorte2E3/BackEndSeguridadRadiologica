if (window.localStorage.getItem("subtotales") != null) {
    window.localStorage.removeItem("subtotales")
}

function hacerPedido() {    
    new swal({
        icon: 'success',
        title: "ORDEN CREADA",
        text: 'Tu orden ha sido creada, en breve te contactaremos',
        position: 'center',
    }).then(okay => {
        if (okay) {
            window.location.href = "./historialPedidos.html";
        }
    });

    // Esto generará la orden de compra

    // let longitudCompras = document.getElementsByClassName("cuentaDeFilas").length;
    let productos = JSON.parse(window.localStorage.getItem("productosLocalS"));
    let total = 0;
    let subTotales = [];


    //Recorre la lista de productos y si hay productos agregados al carrio, obtiene los precios y calcula
    //subtotales y total:
    for( i = 0 ; i <= productos.length ; i++){
        if( document.getElementById(`fila_${i}`) != null){
            let cantidadF = document.getElementById(`cantidadFinal${i}`).value;
            let cadenaPrecio = productos[i-1].price;
            cadenaPrecio = cadenaPrecio.substring(1);
            let precio = parseFloat(cadenaPrecio);
            let subTotal = cantidadF * precio;
            let precioSub = {"identificador": i, "subtotal": subTotal};
            subTotales.push(precioSub)
            total += subTotal;
            
        }
    }

    //Agregan subtotales y total a localStorage:
    window.localStorage.setItem("subtotales",JSON.stringify(subTotales));
    window.localStorage.setItem("total",JSON.stringify(total));

    window.localStorage.removeItem("identificadoresLocalS");
    
    // Limpiar el localStorage al hacer el pedido, para que se borre la base de datos 

}// hacerPedido

//Funcion para eliminar row

function eliminarCompra(arg_id) {
    
    let td = event.target.parentNode; 
    let tr = td.parentNode; // fila a ser removida
    tr.parentNode.removeChild(tr);

    let eliminar = JSON.parse(window.localStorage.getItem("identificadoresLocalS"));

    let i = 0;
    while( i < eliminar.length){

        if(eliminar[i].identificador == arg_id){

            eliminar.splice(i,1);

        } else{

            i++;

        } // fin del if-else
    } // fin del while

    window.localStorage.setItem("identificadoresLocalS",JSON.stringify(eliminar));
    window.location.reload();

}//eliminarCompra

// Esta función me añade los productos al carrito. Estos productos lo agregué desde productos.html al hacer click en "comprar"
if (window.localStorage.getItem("identificadoresLocalS") != null) {
    function cargarCompras() {

        let tablaCompras = document.getElementById("tablaCompras");
        let compraIndividual = "";

        let listaCompras = JSON.parse(window.localStorage.getItem("identificadoresLocalS"));
        let listaProductos = JSON.parse(window.localStorage.getItem("productosLocalS"));
        let listaCantidades = [];

        listaCompras.forEach(elemento => {
            if (isNaN(listaCantidades[elemento.identificador])) {

                listaCantidades[elemento.identificador] = 0;

            }
            listaCantidades[elemento.identificador] += 1;

        })


        listaCompras.forEach(function (compra) {
            if (compraIndividual.indexOf(`eliminarCompra(${compra.identificador})`) == -1) {
                let fila = `
               <tr id="fila_${compra.identificador}">

                <td scope="row" class="productoCarrito col-6"> ${listaProductos[compra.identificador -1].title} </td>
                <td class="col-3"><input type="number" id="cantidadFinal${compra.identificador}" style="width: 60%" value="${listaCantidades[compra.identificador]}"></td>

                <td style="text-align: center; class="col-3">

                    <button type="button" class="btn btn-outline-danger" value="Delete Row" onclick="eliminarCompra(${compra.identificador})">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                            class="bi bi-trash" viewBox="0 0 16 16">
                            <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 
                                .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 
                                .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z">
                            </path>
                            <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1
                                0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 
                                1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z">
                            </path>
                        </svg>
                        Eliminar
                    </button>
                </td> <br>
                </tr>
                `
                compraIndividual += fila;
            }
        }) // Fin de forEach

        tablaCompras.innerHTML = compraIndividual;

    }
    cargarCompras();
}
