/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ProyectoVacunacion.ClienteREST;

import io.javalin.Javalin;
import ProyectoVacunacion.ClienteREST.Controllers.*;
import ProyectoVacunacion.ClienteREST.util.*;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {
        //Creando la instancia del servidor.
        Javalin app = Javalin.create(config ->{
            // config.addStaticFiles("/publico"); //desde la carpeta de resources
            config.addStaticFiles("src/main/resources/publico/templates", Location.EXTERNAL);
            config.enableCorsForAllOrigins();
        });

        app.start(8000);

        new MainController(app).aplicarRutas();

    }
}
