const btn_add = document.getElementById("btn_add");
const txt_field = document.getElementById("txt_field");
const txt_container = document.getElementById("txt_container");
const word_count = document.getElementById("word-count");
const textosIngresados = [];

btn_add.addEventListener("click", function () {
  const placeholderValue = txt_field.getAttribute("data-placeholder");
  txt_field.value = placeholderValue;
  word_count.style.display = "block";
  txt_field.style.display = "block";
  txt_field.focus();
});

function crearTextoConIconos(texto) {
  const nuevoDiv = document.createElement("div");
  nuevoDiv.classList.add("texto-con-iconos");

  const divIcon = document.createElement("div");
  divIcon.classList.add("contain_icon");
  nuevoDiv.appendChild(divIcon);

  const textoElement = document.createElement("p");
  textoElement.textContent = texto;
  nuevoDiv.appendChild(textoElement);

  // Editar //
  const iconoEditar = document.createElement("img");
  iconoEditar.src = "resources/edit.png";
  iconoEditar.alt = "Editar";
  iconoEditar.addEventListener("click", function () {
    const placeholderValue = textoElement.getAttribute("data-placeholder");
    txt_field.value = placeholderValue;
    textoElement.contentEditable = "true";
    textoElement.focus();

    textoElement.addEventListener("keydown", function (event) {
      if (event.key === "Enter") {
        event.preventDefault();
        textoElement.contentEditable = "false";
      }
    });
    textoElement.removeAttribute("data-placeholder");
  });
  divIcon.appendChild(iconoEditar);

  // Borrar //
  const iconoBorrar = document.createElement("img");
  iconoBorrar.src = "resources/trash-bin.png";
  iconoBorrar.alt = "Borrar";
  iconoBorrar.addEventListener("click", function () {
    nuevoDiv.remove();
  });
  divIcon.appendChild(iconoBorrar);

  return nuevoDiv;
}


