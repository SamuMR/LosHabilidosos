const btn_add = document.getElementById("btn_add");
const txt_field = document.getElementById("txt_field");
const txt_container = document.getElementById("txt_container");
const textosIngresados = [];

btn_add.addEventListener("click", function () {
  // Obtén el valor del placeholder desde el atributo data-placeholder
  const placeholderValue = txt_field.getAttribute("data-placeholder");

  // Asigna el valor del placeholder al campo de texto
  txt_field.value = placeholderValue;

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

  const iconoEditar = document.createElement("img");
  iconoEditar.src = "resources/edit.png";
  iconoEditar.alt = "Editar";
  iconoEditar.addEventListener("click", function () {
    // Obtén el valor del placeholder desde el atributo data-placeholder
    const placeholderValue = textoElement.getAttribute("data-placeholder");

    // Asigna el valor del placeholder al campo de texto
    txt_field.value = placeholderValue;

    // Habilita la edición del texto
    textoElement.contentEditable = "true";
    textoElement.focus();

    // Captura la modificación al presionar "Enter" y previene el salto de línea
    textoElement.addEventListener("keydown", function (event) {
      if (event.key === "Enter") {
        event.preventDefault(); // Evita el salto de línea
        textoElement.contentEditable = "false";
      }
    });

    // Limpia el atributo data-placeholder
    textoElement.removeAttribute("data-placeholder");
  });
  divIcon.appendChild(iconoEditar);

  const iconoBorrar = document.createElement("img");
  iconoBorrar.src = "resources/trash-bin.png";
  iconoBorrar.alt = "Borrar";
  iconoBorrar.addEventListener("click", function () {
    // Eliminar el contenedor del texto
    nuevoDiv.remove();
  });
  divIcon.appendChild(iconoBorrar);

  return nuevoDiv;
}

txt_field.addEventListener("keyup", function (event) {
  if (event.key === "Enter") {
    const texto = txt_field.value;
    textosIngresados.push(texto);

    const nuevoDiv = crearTextoConIconos(texto);

    txt_container.appendChild(nuevoDiv);

    txt_field.value = "";
    txt_field.style.display = "none";
  }
});
