# 💱 Conversor de Monedas

Aplicación Java que permite convertir entre distintas monedas del mundo utilizando la API de [ExchangeRate-API](https://www.exchangerate-api.com/). Ideal para practicar fundamentos de Java, orientación a objetos, consumo de APIs externas y manejo de archivos de configuración.

---

## 🚀 Características

- Conversión entre monedas populares (USD, ARS, BRL, COP, etc.).
- Opción para convertir entre **cualquier par de monedas** ingresadas por el usuario.
- Historial de conversiones con **marca de tiempo**.
- API Key cargada desde archivo externo (`config.properties`).
- Interfaz por consola amigable y clara.

---

## 🛠️ Tecnologías utilizadas

- Java 17+
- API HTTP nativa (`java.net.http`)
- [Gson](https://github.com/google/gson) para procesamiento de JSON
- Maven/Gradle (opcional)
- IntelliJ IDEA (recomendado)

---

## 📦 Configuración inicial

1. **Cloná el repositorio:**

   ```bash
   git clone https://github.com/TU_USUARIO/conversor-de-monedas.git
   cd conversor-de-monedas
   ```

2. **Crear el archivo `config.properties` en la raíz del proyecto:**

   ```properties
   API_KEY=tu_clave_api_aqui
   ```

3. **Agregar tu clave API de ExchangeRate-API:**

   - Registrate en [https://www.exchangerate-api.com](https://www.exchangerate-api.com)
   - Pegá tu clave en `config.properties`

---

## 🧪 Cómo ejecutar

Desde tu IDE (como IntelliJ IDEA):

- Ejecutá el archivo `Main.java`
- Usá el menú para seleccionar una conversión

Desde consola (si usás Maven o Gradle):

```bash
javac -d out src/**/*.java
java -cp out com.kenmar.currencyconverter.Main
```

---

## 📁 Estructura del proyecto

```
conversor-de-monedas/
│
├── src/
│   ├── com.kenmar.currencyconverter/
│   │   └── Main.java
│   └── config/
│       └── ConfigLoader.java
│
├── config.properties       # <- No se sube al repo
├── .gitignore
└── README.md
```

---

## 🛡️ Seguridad

☑️ El archivo `config.properties` está en el `.gitignore`, lo que evita que subas accidentalmente tu API Key al repositorio.

---

## 🧠 Autor

**Kenmar**  
Desarrollador Java en formación | Apasionado por el código limpio, útil y bello. 👨‍💻
