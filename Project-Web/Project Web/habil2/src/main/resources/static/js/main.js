import { onAuthStateChanged } from "https://www.gstatic.com/firebasejs/10.4.0/firebase-auth.js";
import { auth } from "./apps/firebase.js";
import "./apps/singupForm.js";
import "./apps/logout.js";
import "./apps/signinForm.js";
import "./apps/googleLogin.js";
import "./apps/facebookLogin.js"
import "./apps/githudLogin.js"
import { loginCheck } from "./apps/loginCheck.js";

onAuthStateChanged(auth, async (user) => {
    const diarioAprendizajeLink = document.getElementById('diarioAprendizajeLink');
    const diarioAprendizajeLink1 = document.getElementById('diarioAprendizajeLink1');

    if (user) {
        // Si el usuario ha iniciado sesión, permitir la navegación a indexx.html y diarioAprendizajeLink1
        diarioAprendizajeLink.addEventListener('click', function(event) {
            // Aquí puedes agregar cualquier lógica adicional que desees realizar cuando el usuario hace clic en el enlace
            // ...
        });

        diarioAprendizajeLink1.addEventListener('click', function(event) {
            // Aquí puedes agregar cualquier lógica adicional que desees realizar cuando el usuario hace clic en el enlace
            // ...
        });
    } else {
        // Si el usuario no ha iniciado sesión, prevenir la navegación a indexx.html y diarioAprendizajeLink1
        diarioAprendizajeLink.addEventListener('click', function(event) {
            event.preventDefault(); // Previene la acción predeterminada del enlace
            alert('Debes iniciar sesión para acceder a Diario Aprendizaje.');
            // Puedes redirigir al usuario a la página de inicio de sesión aquí si lo deseas
            // window.location.href = 'pagina_de_inicio_de_sesion.html';
        });

        diarioAprendizajeLink1.addEventListener('click', function(event) {
            event.preventDefault(); // Previene la acción predeterminada del enlace
            alert('Debes iniciar sesión para acceder a Perfil.');
            // Puedes redirigir al usuario a la página de inicio de sesión aquí si lo deseas
            // window.location.href = 'pagina_de_inicio_de_sesion.html';
        });
    }

    // Llamar a la función loginCheck y pasar el usuario como argumento
    loginCheck(user);
});
