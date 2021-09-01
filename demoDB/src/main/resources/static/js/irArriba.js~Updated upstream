//Traer el botón
let mybutton = document.getElementById("irArriba");

// Cuando el usuario hace scroll 20px desde la cima del documento, muestra el botón
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}

// Cuando el usuario hace click en el botón, se hace auto-scroll a la cima del documento
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}