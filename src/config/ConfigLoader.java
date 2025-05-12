package config;  // El paquete en el que estamos trabajando

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    // Método para cargar la API key desde el archivo config.properties
    public static String getApiKey() {
        try (InputStream input = new FileInputStream("config.properties")) {  // Asegúrate de que el archivo esté en la raíz de tu proyecto
            Properties prop = new Properties();
            prop.load(input);  // Cargar las propiedades del archivo
            return prop.getProperty("API_KEY");  // Devolver el valor de la clave API
        } catch (IOException ex) {
            System.out.println("⚠️ No se pudo cargar la API key.");
            return null;  // Retornar null si ocurre algún error
        }
    }
}

