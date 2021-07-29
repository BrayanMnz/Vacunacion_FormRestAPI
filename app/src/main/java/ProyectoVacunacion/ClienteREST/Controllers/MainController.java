package ProyectoVacunacion.ClienteREST.Controllers;

import ProyectoVacunacion.ClienteREST.util.*;
import io.javalin.Javalin;



public class MainController extends BaseControlador {

    public MainController(Javalin app) {
        super(app);
    }

    @Override
    public void aplicarRutas() {

        app.get("/", ctx -> {

            ctx.render("/publico/index.html");
        });

        app.get("/create-form", ctx -> {
            ctx.render("/public/templates/main-form.html");
        });

        app.get("/list-form", ctx -> {
            ctx.render("/public/templates/list-form.html");
        });



    }


}
