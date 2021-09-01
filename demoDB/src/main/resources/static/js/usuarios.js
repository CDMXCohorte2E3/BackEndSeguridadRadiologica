// Esto añade al local storage las key-values
if( window.localStorage.getItem("listaRegistro") == null ){
    let usuarios = [
      {
        "name": "Bueno",
        "lastName": "Rivero",
        "phone": "5578692514",
        "email": "chars@gmail.com",
        "password" : "Equipo1."
      },
      {
        "name": "Bravo",
        "lastName": "Gomez",
        "phone": "5578692514",
        "email": "abravo@gmail.com",
        "password" : "Equipo2."
      },
      {
        "name": "Grimaldo",
        "lastName": "Peralta",
        "phone": "5578692514",
        "email": "vosko@gmail.com",
        "password" : "Equipo3."
      },
      {
        "name": "RadioMed",
        "lastName": "Contacto",
        "phone": "5578692514",
        "email": "radiomed.contacto@gmail.com",
        "password" : "RadioMed_01"
      },
      {
        "name": "RadioMed",
        "lastName": "Asesores",
        "phone": "5578692514",
        "email": "radiomed.asesores@gmail.com",
        "password" : "RadioMed_01"
      }
    ]
    window.localStorage.setItem('listaRegistro',JSON.stringify(usuarios))
  } // fin de añadir a local storage 
  
  // Cambio a uso del local storage para trabajar con el JSON
  