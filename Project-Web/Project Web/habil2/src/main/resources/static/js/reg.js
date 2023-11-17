function validarFormulario() {
    // Realiza tus validaciones aquí, por ejemplo, verifica si el correo es válido
    var correo = document.getElementById('correo').value;
    if (!esCorreoValido(correo)) {
      alert('Correo no válido');
      return false; // Detiene el envío del formulario
    }
  
    // Agrega más validaciones según sea necesario
  
    // Si todas las validaciones son exitosas, muestra el popup
    mostrarPopup();
  
    return false; // Detiene el envío del formulario
  }
  
  function esCorreoValido(correo) {
    // Aquí puedes implementar una lógica más avanzada para validar el correo
    // Por ahora, solo verifica si contiene "@" y "."
    return correo.includes('@') && correo.includes('.');
  }
  
  function mostrarPopup() {
    document.getElementById('successPopup').style.display = 'block';
  }
  