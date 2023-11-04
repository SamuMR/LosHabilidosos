// Import the functions you need from the SDKs you need
import { initializeApp } from "https://www.gstatic.com/firebasejs/10.4.0/firebase-app.js";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries
import {getAuth } from "https://www.gstatic.com/firebasejs/10.4.0/firebase-auth.js"

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyA2Ew3Ce1vI9tWn7dZJRJL-qgiFpaUfhHs",
  authDomain: "fb-registro-c7178.firebaseapp.com",
  projectId: "fb-registro-c7178",
  storageBucket: "fb-registro-c7178.appspot.com",
  messagingSenderId: "507872492007",
  appId: "1:507872492007:web:fbee9d5762e31d04082542"
};

// Initialize Firebase
export const app = initializeApp(firebaseConfig);
export const auth = getAuth(app)
