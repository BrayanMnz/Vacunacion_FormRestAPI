$(function () {
  $("#wizard").steps({
    headerTag: "h4",
    bodyTag: "section",
    transitionEffect: "fade",
    enableAllSteps: true,
    transitionEffectSpeed: 500,
    onStepChanging: function (event, currentIndex, newIndex) {
      if (newIndex === 1) {
        dniRegex = new RegExp("^[0-9]{3}-?[0-9]{7}-?[0-9]{1}$");

        dni = String(document.getElementById("id_persona").value);
        nombre = String(document.getElementById("nombreCompleto").value);
        fecha = String(document.getElementById("fechaNacimiento").value);
        sexo = String(document.getElementById("sexoPersona").value);
        encuesta = String(document.getElementById("encuesta").value);


        // console.log(dni);
        // console.log(nombre);
        // console.log(fecha);
        // console.log(sexo);
        // console.log(encuesta);
        // console.log(dniRegex.test(dni));
        if (dniRegex.test(dni)) {
          if (
            Boolean(dni) &&
            Boolean(nombre) &&
            Boolean(fecha) &&
            Boolean(sexo) &&
            Boolean(encuesta)
          ) {
            $(".steps ul").addClass("step-2");
            console.log(true);
          } else {
            alert("Debe completar todos los campos");
            return 0;
          }
        } else {
            alert('Debe insertar una cedula en el formato correcto, incluyendo guiones');
            return 0;
        }
      } else {
        $(".steps ul").removeClass("step-2");
      }
      if (newIndex === 2) {
        var mailformat = new RegExp("^w+([.-]?w+)*@w+([.-]?w+)*(.w{2,3})+$");
        console.log(mailformat.test("brayanmnz@hotmail.com"));






        $(".steps ul").addClass("step-3");
      } else {
        $(".steps ul").removeClass("step-3");
      }

      if (newIndex === 3) {
        $(".steps ul").addClass("step-4");
        $(".actions ul").addClass("step-last");
      } else {
        $(".steps ul").removeClass("step-4");
        $(".actions ul").removeClass("step-last");
      }
      return true;
    },
    labels: {
      finish: "Solicitar Cita",
      next: "Siguiente",
      previous: "Anterior",
    },
  });
  // Custom Steps Jquery Steps
  $(".wizard > .steps li a").click(function () {
    $(this).parent().addClass("checked");
    $(this).parent().prevAll().addClass("checked");
    $(this).parent().nextAll().removeClass("checked");
  });
  // Custom Button Jquery Steps
  $(".forward").click(function () {
    $("#wizard").steps("next");
  });
  $(".backward").click(function () {
    $("#wizard").steps("previous");
  });
  // Checkbox
  $(".checkbox-circle label").click(function () {
    $(".checkbox-circle label").removeClass("active");
    $(this).addClass("active");
  });
});
