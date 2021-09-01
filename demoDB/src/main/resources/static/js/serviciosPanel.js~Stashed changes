// Esto añade al local storage las key-values
if( window.localStorage.getItem("serviciosLocalS") == null ){
	let datosJson = [
	{
		"imagen": "./img/services/img-service1.jpg",
		"titulo": "Curso Básico de Protección Radiológica Nivel Personal Ocupacionalmente Expuesto (POE)",
		"parrafo1": "Curso dirigido a técnicos radiólogos, médicos radiólogos, enfermeras, cirujanos dentistas, médicos de diferentes especialidades y cualquier personal ocupacionalmente expuesto (POE) que haga uso de algún equipo de rayos X para diagnóstico médico.",
		"parrafo2": "Este curso está diseñado para que el alumno comprenda fácilmente y de forma didáctica qué son las radiaciones ionizantes y cuáles son los principios de protección radiológica que puede aplicar en su lugar de trabajo.",
		"parrafo3": "El contenido del curso se basa en lo estipulado en las Normas Oficiales Mexicanas NOM-229-SSA1-2002 y NOM-031-NUCL-2011.",
		"parrafoBlack": "Duración del curso: 40 horas.",
		"id": "1"
	},
	{
		"imagen": "./img/services/img-service2.jpg",
		"titulo": "Curso de Actualización en Protección Radiológica para Personal Ocupacionalmente Expuesto (POE)",
		"parrafo1": "Curso dirigido al personal ocupacionalmente expuesto (POE) que labora en establecimientos de diagnóstico médico con rayos X y cuenta con un Curso Básico de Protección Radiológica Nivel POE. ",
		"parrafo2": "RadioMed le ofrece un Curso de Actualización personalizado, de acuerdo al tipo de establecimiento médico que lo solicita, con el fin de reforzar en el alumno los conocimientos prácticos de protección radiológica que le serán útiles en sus actividades laborales diarias.",
		"parrafo3": "El Curso de Actualización se imparte de forma anual de acuerdo a lo establecido en las Normas Oficiales Mexicanas NOM-229-SSA1-200 y NOM-031-NUCL-2011.",
		"parrafoBlack": "Duración del curso: 8 a 16 horas.",
		"id": "2"
	},
	{
		"imagen": "./img/services/img-service3.jpg",
		"titulo": "La dosimetría personal más moderna y precisa del mercado a un precio accesible.",
		"parrafo1": "Tecnología alemana BeOSL, ampliamente conocida y utilizada en países como Italia, Japón, Suiza, Bélgica, EUA y muchos más. ",
		"parrafo2": "Nuestro servicio está avalado por la Comisión Nacional de Seguridad Nuclear y Salvaguardias (CNSNS) mediante el Programa Permanente de Supervisión de Servicios de Dosimetría (PPSSD). ",
		"parrafo3": " ",
		"parrafoBlack": "¡Pregunte por nuestros descuentos y proporcione dosimetría de calidad a todo su personal! ",
		"id": "3"
	},
	{
		"imagen": "./img/services/img-service4.jpg",
		"titulo": "Gestoría ante la COFEPRIS",
		"parrafo1": "Lo apoyamos en la obtención de su Licencia Sanitaria y Permiso del Responsable de la Operación y el funcionamiento. Nuestro servicio está garantizado. ",
		"parrafo2": " ",
		"parrafo3": " ",
		"parrafoBlack": "Le proporcionamos Manuales de Protección Radiológica y Garantía de Calidad personalizados, de acuerdo a las necesidades de su establecimiento, todo con base en lo requerido por la Norma Oficial Mexicana NOM-229-SSA1-2002.",
		"id": "4"
	},
	{
		"imagen": "./img/services/img-service5.jpg",
		"titulo": "Memoria Analítica",
		"parrafo1": "Cálculo de blindajes para su sala de rayos X.",
		"parrafo2": "Evite gastos innecesarios, le indicamos la forma más efectiva de blindar su sala cumpliendo con la norma mexicana y cuidando su presupuesto.",
		"parrafo3": "Adecuamos completamente su sala de rayos X, pregunte por nuestro servicio de blindaje de salas, manejamos plomo y barita.",
		"parrafoBlack": "Le proporcionamos un certificado con validez oficial ante la COFEPRIS.",
		"id": "5"
	},
	{
		"imagen": "./img/services/img-service6.jpg",
		"titulo": "Levantamiento de niveles",
		"parrafo1": "Verificación de los blindajes de su sala de rayos X.",
		"parrafo2": "Las puebas se realizan con detector de radiación tipo cámara de ionización como lo establece la Norma Oficial Mexicana NOM-229-SSA1-2002.",
		"parrafo3": " ",
		"parrafoBlack": "Le proporcionamos un certificado con validez oficial ante la COFEPRIS.",
		"id": "6"
	},
	{
		"imagen": "./img/services/img-service7.jpg",
		"titulo": "Control de Calidad para Equipos de Diagnóstico Médico con Rayos X ",
		"parrafo1": "Somos Asesores Especializados en Seguridad Radiológica avalados por la COFEPRIS. Lo ayudamos a cumplir con el Programa de Garantía de Calidad solicitado por la Norma Oficial Mexicana NOM-229-SSA1-2002.",
		"parrafo2": "Realizamos pruebas de control de calidad a sus equipos de rayos X convencionales, tomógrafos, mastógrafos, rayos X dentales, fluoroscopía, etc.",
		"parrafo3": "Utilizamos equipos y sensores de última generación para asegurar la protección del POE y de sus pacientes.  ",
		"parrafoBlack": "Nuestros certificados de pruebas de control de calidad tienen validez oficial ante la COFEPRIS.",
		"id": "7"
	},
	{
		"imagen": "./img/services/img-service8.jpg",
		"titulo": "Auditoría interna en protección radiológica",
		"parrafo1": "Visitamos su establecimiento para evaluar las condiciones generales de protección radiológica en su sala de rayos X, con base en los requerimientos de la Norma Oficial Mexicana NOM-229-SSA1-2002.",
		"parrafo2": "Se realiza una revisión a su expediente de seguridad radiológica y se entrega un dictamen con la evaluación de su sala, indicando los puntos que deben atenderse para cumplir con lo establecido por la COFEPRIS.",
		"parrafo3": " ",
		"parrafoBlack": "Incluye una plática orientativa sobre el Programa de Garantía de Calidad establecido en la Norma Oficial Mexicana NOM-229-SSA1-2002.",
		"id": "8"
	},

	{
		"imagen": "./img/services/img-service9.jpg",
		"titulo": "Señalamientos de protección radiológica",
		"parrafo1": "Le proporcionamos los señalamientos de protección radiológica necesarios para su establecimiento de diagnóstico médico.",
		"parrafo2": " ",
		"parrafo3": " ",
		"parrafoBlack": "Nuestros señalamientos cumplen con los estándares exigidos por la Norma Oficial Mexicana NOM-229-SSA1-2002.",
		"id": "9"
	},
	]
	window.localStorage.setItem('serviciosLocalS',JSON.stringify(datosJson))
} // fin de añadir a local storage 
  
// Cambio a uso del local storage para trabajar con el JSON
  
let almacenLocal = JSON.parse(window.localStorage.getItem("serviciosLocalS")) // Extraje la información que almacené en local storage




function anadirServicio(servicios) {

	const ancla = document.getElementById("servicios");
	let plantilla = "";

	servicios.forEach(function (servicio) {

		let card = `
        <div class="card mb-3 div-centered" style="max-width: 100%;">
        <div class="row g-0">
            <div class="col-lg-6 col-12">
				<img src="${servicio.imagen}" class="img-fluid rounded-start">
			</div>

			<div class="col-lg-6 col-12"> 
            	<div class="card-body"> 
					<h5 class="card-title">${servicio.titulo}</h5> 
              	  <p class="card-text">${servicio.parrafo1}</p> 
					<div id="etc_${servicio.id}"></div>
					<div id="more_${servicio.id}" class="more">
					<p class="card-text">${servicio.parrafo2}</p> 
					<p class="card-text">${servicio.parrafo3}</p>
					<p class="card-text container-services-text-blackbox">${servicio.parrafoBlack}</p> 
					</div>
					</p>
                <div class="text-center">
                        <button onclick="desplegarServicios(${servicio.id})" class="btn btn-light" id="myBtn_${servicio.id}">Ver más</button>
                        
						<!-- Inicia Modal de edición -->

						<button type="button" class="btn btn-info" data-toggle="modal" data-target="#modalEditarServicio${servicio.id}">
						Editar servicio
						</button>

						<!-- Modal -->
						<div class="modal fade" id="modalEditarServicio${servicio.id}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">Edición de ${servicio.titulo}</h5>
								<button type="button" class="close" data-dismiss="modal" aria-label="Close">
								<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body">
							
							<!-- Inicia el form -->

							<h4>Panel de edición</h4>


							<form id="act-needs-validation${servicio.id}" style="margin-bottom: 20px;" method="POST" novalidate>
                            <!--Formulario de edición-->
                            <div class="form-group">

                                <label for="validationCustom01">Nombre del servicio: </label>
                                <input value="${servicio.titulo}" type="text" name="nombre" class="form-control" id="editarTitulo${servicio.id}" maxlength="300"
                                    required>
                                <div class="invalid-feedback">
                                    <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                                    Nombre válido es requerido
                                </div>
                            </div>

                            <div class="form-group">

                                <label for="validationCustom01">Párrafo de presentación</label>
                                <textarea  type="text" name="parrafo" class="form-control" id="editarParrafo1${servicio.id}" maxlength="300"
                                    required rows="2"
                                    placeholder="Este párrafo es obligatorio, siempre será visible"> ${servicio.parrafo1} </textarea>
                                <div class="invalid-feedback">
                                    <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                                    Este párrafo es requerido
                                </div>
                            </div>


                            <div class="form-group">

                                <label for="validationCustom01">Párrafo 2: </label>
                                <textarea  type="text" name="parrafo2" class="form-control" id="editarParrafo2${servicio.id}" maxlength="300"
                                    required rows="2" placeholder="Párrafo opcional">${servicio.parrafo2}</textarea>
                                <div class="invalid-feedback">
                                    <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                                    Nombre válido es requerido
                                </div>
                            </div>


                            <div class="form-group">

                                <label for="validationCustom01">Párrafo 3: </label>
                                <textarea  type="text" name="parrafo3" class="form-control" id="editarParrafo3${servicio.id}" maxlength="300"
                                    required rows="2" placeholder="Párrafo opcional">${servicio.parrafo3}</textarea>
                                <div class="invalid-feedback">
                                    <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                                    Nombre válido es requerido
                                </div>
                            </div>


                            <div class="form-group">

                                <label for="validationCustom01">Párrafo Resaltado: </label>
                                <textarea  type="text" name="parrafoRes" class="form-control" id="editarParrafoBlack${servicio.id}" maxlength="300"
                                    required rows="2" placeholder="Información resaltada">${servicio.parrafoBlack}</textarea>
                                <div class="invalid-feedback">
                                    <!--div de leyenda para validación, controla la leyenda con el invalid/valid-->
                                    Nombre válido es requerido
                                </div>
                            </div>


                            <div class="form-group">
                                <label for="image">Selecciona una imagen (.jpeg,.jpg,.png)</label>
                                <input type="file" class="form-control-file" name="image" id="editarImage${servicio.id}"
                                    accept=".jpeg,.jpg,.png">
                            </div>

							<!--
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                                <label class="form-check-label" for="defaultCheck1">
                                    Visible en el catálogo
                                </label>
                            </div> -->

                        </form> <!--Formulario de edición-->

							<!-- Finaliza el form -->

							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
								<button id="submit_${servicio.id}" type="submit" class="btn btn-primary">Guardar cambios</button>
							</div>
							</div>
						</div>
						</div>

						<!-- Termina modal de edición -->
                        
                    </div>
        	 </div> <!--card-body--> 
        </div><!--card--> 
    </div>
	<hr>`

		plantilla += card;
	}) // Fin del forEach
	ancla.innerHTML = plantilla;

	servicios.forEach(function(producto){

		let tmpVariable = document.getElementById("submit_" + producto.id)
		tmpVariable.addEventListener('click',validateFormAux);

	})

} //Fin del anadirProducto

function validateFormAux(e){

	e.preventDefault();
	let num = e.target.id.split("_")[1];
	validateFormServicios(num);

}

anadirServicio(almacenLocal);



function desplegarServicios(id) {
	//función del botón ver mas o ver menos
	let etc = document.getElementById("etc_" + id);
	let moreText = document.getElementById("more_" + id);
	let btnText = document.getElementById("myBtn_" + id);

	if (etc.style.display === "none") {
		etc.style.display = "inline";
		btnText.innerHTML = "Ver más";
		moreText.style.display = "none";
	} else {
		etc.style.display = "none";
		btnText.innerHTML = "Ver menos";
		moreText.style.display = "inline";
	} //else
}// Fin de desplegarServicios


// Inician las funciones para editar los servicios 

let formEdicionServicios = document.getElementById('needs-validation');

let validEdicionServicios = 0;
function validateFormServicios(n){//validateForm
    
    let inputNombre = document.getElementById('editarTitulo' + n);
    let inputParrafo = document.getElementById('editarParrafo1' + n);
    let inputParrafo2 = document.getElementById('editarParrafo2' + n);
    let inputParrafo3 = document.getElementById('editarParrafo3' + n);
    let inputParrafoRes = document.getElementById('editarParrafoBlack' + n);
    
    function validateName(nombre){//validateName
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9.,()¡!¿? ]+$/)  
      let esValido = expReg.test(nombre);      
      if(esValido == true){//if nombre
          inputNombre.classList.remove('is-invalid')
          inputNombre.classList.add('is-valid')          
          return validEdicionServicios ++;
        }else{
          inputNombre.classList.add('is-invalid')          
      }//if nombre
    }//validateName
    
    validateName(inputNombre.value)
    
    function validateParrafo(parrafo){//validateParrafo
      //let expReg= /^[A-Z]+$/;
      let expReg = new RegExp(/^[-a-zA-Z-á-ú-0-9.,()¡!¿? ]+$/)
      let esValido2 = expReg.test(parrafo);      
      if(esValido2 == true){//if Marca
          inputParrafo.classList.remove('is-invalid')
          inputParrafo.classList.add('is-valid')          
          return validEdicionServicios ++;
        }else{
          inputParrafo.classList.add('is-invalid')          
      }//if Marca
    }//validateParrafo
    
    validateParrafo(inputParrafo.value)

    if(inputParrafo2.value.length != 0 || inputParrafo2.value.length == 0){//if opcional Parrafo2
      inputParrafo2.classList.remove('is-invalid')
      inputParrafo2.classList.add('is-valid') 
      validEdicionServicios++;
    }else{
      inputParrafo2.classList.add('is-valid')
      validEdicionServicios++;
    }//if opcional Parrafo2

    if(inputParrafo3.value.length != 0 || inputParrafo3.value.length == 0){//if opcional Parrafo3
      inputParrafo3.classList.remove('is-invalid')
      inputParrafo3.classList.add('is-valid') 
      validEdicionServicios++;
    }else{
      inputParrafo3.classList.add('is-valid')
      validEdicionServicios++;
    }//if opcional Parrafo3

    if(inputParrafoRes.value.length != 0 || inputParrafoRes.value.length == 0){//if opcional ParrafoRes
      inputParrafoRes.classList.remove('is-invalid')
      inputParrafoRes.classList.add('is-valid') 
      validEdicionServicios++;
    }else{
      inputParrafoRes.classList.add('is-valid')
      validEdicionServicios++;
    }//if opcional ParrafoRes
    
    if (validEdicionServicios==5){      
      editarServicios(n);
      window.location.reload();
    }
    return validEdicionServicios = 0;
}//validateForm

function editarServicios(id){

	let variableLS =  JSON.parse(window.localStorage.getItem("serviciosLocalS"));

	variableLS[id - 1].titulo = document.getElementById("editarTitulo" + id).value;
	variableLS[id - 1].parrafo1 = document.getElementById("editarParrafo1" + id).value;
	variableLS[id - 1].parrafo2 = document.getElementById("editarParrafo2" + id).value;
	variableLS[id - 1].parrafo3 = document.getElementById("editarParrafo3" + id).value;
	variableLS[id - 1].parrafoBlack = document.getElementById("editarParrafoBlack" + id).value;

	window.localStorage.setItem("serviciosLocalS",JSON.stringify(variableLS));
	
}