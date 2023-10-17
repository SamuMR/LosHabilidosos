document.addEventListener('DOMContentLoaded', function() {
    // Obtener referencias a los elementos de entrada y el botón
    const semana1Input = document.getElementById('semana1');
    const semana2Input = document.getElementById('semana2');
    const semana3Input = document.getElementById('semana3');
    const semana4Input = document.getElementById('semana4');
    const calcularPuntosBtn = document.getElementById('calcular-puntos');
  
    // Agregar un evento clic al botón
    calcularPuntosBtn.addEventListener('click', function() {
      // Obtener los valores ingresados en las semanas
      const puntosSemana1 = parseFloat(semana1Input.value) || 0;
      const puntosSemana2 = parseFloat(semana2Input.value) || 0;
      const puntosSemana3 = parseFloat(semana3Input.value) || 0;
      const puntosSemana4 = parseFloat(semana4Input.value) || 0;
  
      // Redireccionar a la otra página con los puntos por semana como parámetro en la URL
      window.location.href = `otra_pagina.html?puntosSemana1=${puntosSemana1}&puntosSemana2=${puntosSemana2}&puntosSemana3=${puntosSemana3}&puntosSemana4=${puntosSemana4}`;
  
      // Calcula la media y clasifica al usuario
      const totalPuntos = puntosSemana1 + puntosSemana2 + puntosSemana3 + puntosSemana4;
      const mediaPuntos = totalPuntos / 4;
  
      let experiencia = '';
      let autorreflexion = '';
      let clasificacion = '';
  
      if (mediaPuntos >= 8) {
        clasificacion = 'Usuario Avanzado';
      } else if (mediaPuntos >= 5) {
        clasificacion = 'Usuario Intermedio';
      } else {
        clasificacion = 'Usuario Principiante';
      }
  
      if (mediaPuntos >= 8) {
        experiencia = 'Excelente';
      } else if (mediaPuntos >= 5) {
        experiencia = 'Buena';
      } else {
        experiencia = 'Limitada';
      }
  
      if (mediaPuntos >= 8) {
        autorreflexion = 'Muy Profunda';
      } else if (mediaPuntos >= 5) {
        autorreflexion = 'Algo Profunda';
      } else {
        autorreflexion = 'Básica';
      }
  
      // Mostrar los resultados en la página
      const mensaje = `Puntos por Semana:
      Semana 1: ${puntosSemana1}
      Semana 2: ${puntosSemana2}
      Semana 3: ${puntosSemana3}
      Semana 4: ${puntosSemana4}
      Media de Puntos: ${mediaPuntos.toFixed(2)}
      
  Clasificación: ${clasificacion}
  Experiencia: ${experiencia}
  Autorreflexión: ${autorreflexion}`;
  
      document.getElementById('mensaje-puntos').textContent = mensaje;
    });
  });
  





