import { onAuthStateChanged } from "https://www.gstatic.com/firebasejs/10.4.0/firebase-auth.js"
import { auth } from "./apps/firebase.js"
import"./apps/singupForm.js"
import "./apps/logout.js"
import "./apps/signinForm.js"
import "./apps/googleLogin.js"
import { loginCheck } from  "./apps/loginCheck.js "
onAuthStateChanged(auth, async (user) => {
    
 loginCheck(user)
     

})
