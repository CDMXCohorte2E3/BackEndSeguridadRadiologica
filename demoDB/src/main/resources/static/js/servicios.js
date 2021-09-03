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
                        <button onclick="myFunction(${servicio.id})" class="btn btn-light" id="myBtn_${servicio.id}">Ver más</button>
                        <br><br>
                        <a href="./contacto.html"><button class="btn btn-info">COTIZAR</button></a>
                    </div>
        	 </div> <!--card-body--> 
        </div><!--card--> 
    </div>
	<hr>`

		plantilla += card;
	}) // Fin del forEach
	ancla.innerHTML = plantilla;
} //Fin del anadirProducto
anadirServicio(almacenLocal);



function myFunction(id) {
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
}// myFunction