// Esto añade al local storage las key-values
if( window.localStorage.getItem("productosLocalS") == null ){
    let prueba = [
      {
        "imagen": "./img/products/img-product_1.jpg",
        "titulo": "Mandil emplomado económico",
        "marca": "Marca Slim Royal",
        "modelo": "E6995",
        "precio": "$2904.90",
        "descripcion" : "0.5mm de plomo|66x95 cm|Con bolsillo|Acabado textil",
        "id": "1",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_2.jpg",
        "titulo": "Mandil emplomado estándar",
        "marca": "Marca Slim Royal",
        "modelo": "S6995",
        "precio": "$3646.65",
        "descripcion" : "0.5mm de plomo|66x95 cm|Con bolsillo|Acabado plástico",
        "id": "2",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_3.jpg",
        "titulo": "Faldón emplomado",
        "marca": "Marca Slim Royale",
        "modelo": "SQUARE",
        "precio": "$1443.25",
        "descripcion" : "0.5mm de plomo,40x40 cm|Tipo falda",
        "id": "3",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_4.jpg",
        "titulo": "Lentes emplomados",
        "marca": "Marca Slim Royale",
        "modelo": "SS-53",
        "precio": "$2873.71",
        "descripcion" : "0.55mm de plomo|Con estuche",
        "id": "4",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_5.jpg",
        "titulo": "Lentes emplomados",
        "marca": "Marca Slim Royale",
        "modelo": "S-53",
        "precio": "$3403.08",
        "descripcion" : "0.5mm de plomo|Con estuche",
        "id": "5",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_6.jpg",
        "titulo": "Googles emplomados",
        "marca": "Marca Slim Royale",
        "modelo": "GOOGLE-HO",
        "precio": "$6344.55",
        "descripcion" : "0.5mm de plomo|Con bolsa de tela",
        "id": "6",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_7.jpg",
        "titulo": "Guantes emplomados",
        "marca": "Marca Slim Royale",
        "modelo": "100 M/L",
        "precio": "$2911.80",
        "descripcion" : "0.5mm de plomo|350mm de largo|Tamaño mediano o grande",
        "id": "7",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_8.jpg",
        "titulo": "Guantes emplomados",
        "marca": "Marca Shielding",
        "modelo": "XR47",
        "precio": "$2637.53",
        "descripcion" : "RADIAXON|Equivalente a 0.5mm|de plomo|Tamaño mediano o grande",
        "id": "8",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_9.jpg",
        "titulo": "Collarín emplomado",
        "marca": "Marca Slim Royale",
        "modelo": "STANDAR-O5",
        "precio": "$767.96",
        "descripcion" : "0.5mm de plomo",
        "id": "9",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_10.jpg",
        "titulo": "Collarín emplomado de lujo",
        "marca": "Marca Slim Royale",
        "modelo": "DELUX-O5",
        "precio": "$1045.49",
        "descripcion" : "0.5mm de plomo",
        "id": "10",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_11.jpg",
        "titulo": "Protectores de gónadas",
        "marca": "Marca Slim Royale",
        "modelo": "S806A",
        "precio": "$1618.35",
        "descripcion" : "0.5mm de plomo,Juego de 3 piezas:|Grande mediano y chico",
        "id": "11",
        "status":"1"
      },
      {
        "imagen": "./img/products/img-product_12.jpg",
        "titulo": "Protectores de gónadas",
        "marca": "Marca Slim Royale",
        "modelo": "S806 M/L",
        "precio": "$635.24",
        "descripcion" : "0.5mm de plomo|Una pieza|Tamaño mediano o grande",
        "id": "12",
        "status":"1"
      }
    ]
    window.localStorage.setItem('productosLocalS',JSON.stringify(prueba))
  } // fin de añadir a local storage 