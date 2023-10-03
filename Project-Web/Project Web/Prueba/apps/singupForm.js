import { createUserWithEmailAndPassword } from "https://www.gstatic.com/firebasejs/10.4.0/firebase-auth.js"
import { auth } from "./firebase.js"
import { showMessage } from "./showMessage.js"
const singupForm = document.querySelector("#singup-form")

singupForm.addEventListener('submit',async (e) => {
    e.preventDefault()
    const email = singupForm["singup-email"].value
    const password = singupForm["singup-password"].value
    console.log(email, password)
    try {
        const userCredentials = await createUserWithEmailAndPassword(auth, email, password)
        console.log(userCredentials) 
        //cerrar modal registro
        const sigupModal = document.querySelector("#singupModal")
        const modal = bootstrap.Modal.getInstance(sigupModal)
        modal.hide()
        showMessage("bienvenido " + userCredentials.user.email)

      






    } catch (error) {
        console.log(error.message)
        console.log(error.code)
        if(error.code === "auth/email-already-in-use"){
            showMessage("este email ya ha sido utilizado","error")
            
        }else if(error.code === "auth/invalid-email"){
            showMessage("email invalido","error")

            
        }else if(error.code === "auth/weak-password"){
            showMessage("contraseña poco segura","error")

        }else if (error.code){
            alert("algo fallo")
        }




    }

})