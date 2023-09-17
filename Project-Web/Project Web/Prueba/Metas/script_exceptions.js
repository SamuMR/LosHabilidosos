const wordCount = document.getElementById("word-count");
const adv_1 = document.getElementById("adv-1");
const adv_2 = document.getElementById("adv-2");
const adv_3 = document.getElementById("adv-3");
const maxWords = 30;
const maxCharacters = 500;

let currentWordCount = 0;
let currentCharacterCount = 0;

txt_field.addEventListener("input", function () {
  const texto = txt_field.value;
  const words = texto.trim().split(/\s+/).filter(word => word !== '');

  currentWordCount = words.length;
  currentCharacterCount = texto.length;
  wordCount.textContent = `${currentWordCount}/${maxWords} palabras`;
console.log(currentCharacterCount);
    
  if (currentWordCount > maxWords || currentCharacterCount > maxCharacters) {
    wordCount.style.color = "red";
  } else {
    wordCount.style.color = "black";
  }

  if (currentWordCount === 0 || currentCharacterCount === 0) {
    wordCount.style.color = "red";
    adv_1.style.display = "block";
  } else if (currentWordCount === 1) {
    adv_1.style.display = "none";
  }

  if (currentWordCount <= maxWords) {
    adv_2.style.display = "none";
  }

  if (currentCharacterCount >= maxCharacters) {
    adv_3.style.display = "block";
  } else {
    adv_3.style.display = "none";
  }
});

txt_field.addEventListener("keydown", function (event) {
  const texto = txt_field.value;
  const words = texto.trim().split(/\s+/).filter(word => word !== '');

  if ((words[0] === "" || words.length === 0 || texto.length === 0) && event.key === "Enter") {
    adv_1.style.display = "block";
    wordCount.style.color = "red";
    event.preventDefault();
  } else if (event.key === "Enter" && (currentWordCount > maxWords || currentCharacterCount > maxCharacters)) {
    // Verificar si se excede el límite de palabras o caracteres después de presionar "Enter"
    adv_2.style.display = "block";
    wordCount.style.color = "red";
    event.preventDefault();
  } else {
    if (event.key === "Enter") {
      const texto = txt_field.value;
      textosIngresados.push(texto);
  
      const nuevoDiv = crearTextoConIconos(texto);
  
      txt_container.appendChild(nuevoDiv);
  
      txt_field.value = "";
      txt_field.style.display = "none";
  
      wordCount.textContent = "0/30";
      wordCount.style.color = "black";
      wordCount.style.display = "none";
    }
  }
});
