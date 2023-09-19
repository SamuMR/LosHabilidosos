// Cambiar el texto de un elemento HTML
const miElemento = document.getElementById('mi-elemento');
miElemento.innerText = 'Nuevo texto';

// Agregar un evento clic a un botón
const miBoton = document.getElementById('mi-boton');
miBoton.addEventListener('click', function() {
  alert('¡Has hecho clic en el botón!');
});

// Validación de un formulario
const form = document.getElementById('mi-formulario');
const emailInput = document.getElementById('email');

form.addEventListener('submit', function(event) {
  if (!isValidEmail(emailInput.value)) {
    alert('Por favor, ingresa una dirección de correo electrónico válida.');
    event.preventDefault();
  }
});

function isValidEmail(email) {
  return email.includes('@');
}

// Nuevo código para el formulario de diario
const guardarEntradaBtn = document.getElementById('guardar-entrada');
const entradaDiario = document.getElementById('entrada-diario');

guardarEntradaBtn.addEventListener('click', function(event) {
  event.preventDefault();

  if (entradaDiario.value.trim() === '') {
    alert('Por favor, escribe algo en tu diario antes de guardar.');
  } else {
    alert('Gracias, recibí tu diario.');
    // Puedes agregar aquí el código para enviar los datos del diario o realizar otras acciones necesarias.
    entradaDiario.value = '';
  }
});
