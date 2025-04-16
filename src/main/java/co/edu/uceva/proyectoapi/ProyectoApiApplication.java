package co.edu.uceva.proyectoapi;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApiApplication {

    public static void main(String[] args) {

        // Solo cargar el .env si las variables no vienen definidas
        if (System.getenv("DB_URL") == null || System.getenv("DB_USER") == null || System.getenv("DB_PASS") == null) {
            Dotenv dotenv = Dotenv.load();
            System.setProperty("DB_URL", dotenv.get("DB_URL"));
            System.setProperty("DB_USER", dotenv.get("DB_USER"));
            System.setProperty("DB_PASS", dotenv.get("DB_PASS"));
        }

        SpringApplication.run(ProyectoApiApplication.class, args);
    }

}
