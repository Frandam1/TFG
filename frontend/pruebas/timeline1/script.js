function toggleForm() {
    var dateInput = document.getElementById("date");
    var commentInput = document.getElementById("comment");
    var addButton = document.querySelector(".btn-primary");
  
    if (dateInput.style.display === "none") {
      dateInput.style.display = "block";
      commentInput.style.display = "block";
      addButton.style.display = "block";
    } else {
      dateInput.style.display = "none";
      commentInput.style.display = "none";
      addButton.style.display = "none";
    }
  }
  
  function addEntry() {
    var date = document.getElementById("date").value;
    var comment = document.getElementById("comment").value;
  
    var timeline = document.getElementById("timeline");
  
    var entryDiv = document.createElement("div");
    entryDiv.classList.add("entry");
  
    var dateParagraph = document.createElement("p");
    dateParagraph.textContent = date;
  
    var commentParagraph = document.createElement("p");
    commentParagraph.textContent = comment;
  
    entryDiv.appendChild(dateParagraph);
    entryDiv.appendChild(commentParagraph);
  
    timeline.appendChild(entryDiv);
  
    // Limpiar campos después de agregar una nueva entrada
    document.getElementById("date").value = "";
    document.getElementById("comment").value = "";
  
    // Ocultar campos nuevamente
    toggleForm();
  
    // Ajustar la altura de la línea vertical
    adjustLineHeight();
  }
  
  function adjustLineHeight() {
    var entries = document.querySelectorAll(".entry");
    var lineHeight = 0;
  
    // Calcular la altura total de todas las entradas
    entries.forEach(function(entry) {
      lineHeight += entry.clientHeight;
    });
  
    // Ajustar la altura de la línea vertical
    var line = document.querySelector(".timeline-line");
    if (line) {
      line.style.height = lineHeight + "px";
    }
  }
  
  