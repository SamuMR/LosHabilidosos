

const singupForm = document.querySelector("#singup-form")

singupForm.addEventListener('submit', (e) => {
    e.preventDefault()
    const email = singupForm["singup-email"].value
    const password = singupForm["singup-password"].value
    console.log(email, password)

})