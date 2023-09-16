const btn_add = document.getElementById("btn_add");
const txt_field = document.getElementById("txt_field")
const txt_added = document.getElementById("txt_added")

btn_add.addEventListener("click", function(){
    txt_field.style.display = "block";
});

txt_field.addEventListener("keyup", function(event){
    if (event.key == "Enter"){
        const texto = txt_field.value;
        txt_added.textContent =  `Texto ingresado: ${texto}`;
    
        txt_field.value="";
        txt_field.style.display= "none";
    }
})