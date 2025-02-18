import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        //DECLARAR EL SERVER
        ServerSocket server = new ServerSocket(5009);
        Socket socket1 = server.accept();
        PrintWriter writer1 = new PrintWriter(socket1.getOutputStream(), true);
        var socketreaser1 = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
        writer1.println("Esperando al jugador 2...");
        Socket socket2 = server.accept();
        PrintWriter writer2 = new PrintWriter(socket2.getOutputStream(), true);
        var socketreaser2 = new BufferedReader(new InputStreamReader(socket2.getInputStream()));

        //jugador 1
        writer1.println("¡Bienvenidos al 'Desafío del Conocimiento'! 🎉");
        writer1.println("Pon a prueba tu inteligencia con nuestro emocionante juego de preguntas.");
        writer1.println("Vamos a elegir aleatoriamente la categoría:");

        //jugador 2
        writer2.println("¡Bienvenidos al 'Desafío del Conocimiento'! 🎉");
        writer2.println("Pon a prueba tu inteligencia con nuestro emocionante juego de preguntas.");
        writer2.println("Vamos a elegir aleatoriamente la categoría:");

        Random rand = new Random();
        int categoria = rand.nextInt(1, 5);

        //jugador 1 y jugador 2
        writer1.println("1️⃣ Ciencia 🧪");
        writer1.println("2️⃣ Historia 📜");
        writer1.println("3️⃣ Deporte ⚽");
        writer1.println("4️⃣ Entretenimiento 🎬");
        writer1.println("¡Responde correctamente y conviértete en el campeón del conocimiento!");

        writer2.println("1️⃣ Ciencia 🧪");
        writer2.println("2️⃣ Historia 📜");
        writer2.println("3️⃣ Deporte ⚽");
        writer2.println("4️⃣ Entretenimiento 🎬");
        writer2.println("¡Responde correctamente y conviértete en el campeón del conocimiento!");

        int contj1 = 0;
        int contj2 = 0;

        if (categoria == 1) {
            // Categoria Ciencia
            String[] preguntasCiencia = {
                    "¿Cuál es el elemento más abundante en la Tierra?",
                    "¿Qué planeta es conocido como el planeta rojo?",
                    "¿Cuál es la molécula responsable de almacenar información genética?",
                    "¿Quién formuló la teoría de la relatividad?",
                    "¿Cuántos huesos tiene el cuerpo humano adulto?"
            };
            String[] respuestasCiencia = { "Oxígeno", "Marte", "ADN", "Albert Einstein", "206" };

            // Jugador 1
            writer1.println("¡Ha salido Ciencia!");
            contj1 = hacerPreguntas(writer1, socketreaser1, preguntasCiencia, respuestasCiencia);

            // Jugador 2
            writer2.println("¡Ha salido Ciencia!");
            contj2 = hacerPreguntas(writer2, socketreaser2, preguntasCiencia, respuestasCiencia);
        } else if (categoria == 2) {
            // Categoria Historia
            String[] preguntasHistoria = {
                    "¿En qué año llegó Cristóbal Colón a América?",
                    "¿Quién fue el primer presidente de los Estados Unidos?",
                    "¿Cuál fue la causa principal de la Primera Guerra Mundial?",
                    "¿En qué año terminó la Segunda Guerra Mundial?",
                    "¿Qué civilización construyó las pirámides de Egipto?"
            };
            String[] respuestasHistoria = { "1492", "George Washington", "El asesinato del archiduque Francisco Fernando de Austria", "1945", "Egipcios" };

            // Jugador 1
            writer1.println("¡Ha salido Historia!");
            contj1 = hacerPreguntas(writer1, socketreaser1, preguntasHistoria, respuestasHistoria);

            // Jugador 2
            writer2.println("¡Ha salido Historia!");
            contj2 = hacerPreguntas(writer2, socketreaser2, preguntasHistoria, respuestasHistoria);
        } else if (categoria == 3) {
            // Categoria Deporte
            String[] preguntasDeporte = {
                    "¿Cuántos jugadores tiene un equipo de fútbol en el campo?",
                    "¿Quién ha ganado más títulos de Fórmula 1 en la historia?",
                    "¿En qué país se originó el tenis?",
                    "¿Cuántos puntos vale un triple en baloncesto?",
                    "¿Cuál es el evento deportivo más visto en el mundo?"
            };
            String[] respuestasDeporte = { "11", "Lewis Hamilton", "Francia", "3", "Mundial" };

            // Jugador 1
            writer1.println("¡Ha salido Deporte!");
            contj1 = hacerPreguntas(writer1, socketreaser1, preguntasDeporte, respuestasDeporte);

            // Jugador 2
            writer2.println("¡Ha salido Deporte!");
            contj2 = hacerPreguntas(writer2, socketreaser2, preguntasDeporte, respuestasDeporte);
        } else {
            // Categoria Entretenimiento
            String[] preguntasEntretenimiento = {
                    "¿Quién interpretó a Iron Man en el Universo Cinematográfico de Marvel?",
                    "¿Cuál es la película con mayor recaudación de la historia?",
                    "¿Qué serie de televisión tiene más temporadas hasta la fecha?",
                    "¿Quién es el creador de Mickey Mouse?",
                    "¿Cuál es el videojuego más vendido de todos los tiempos?"
            };
            String[] respuestasEntretenimiento = { "Robert Downey Jr.", "Avatar", "Los Simpsons", "Walt Disney", "Minecraft" };

            // Jugador 1
            writer1.println("¡Ha salido Entretenimiento!");
            contj1 = hacerPreguntas(writer1, socketreaser1, preguntasEntretenimiento, respuestasEntretenimiento);

            // Jugador 2
            writer2.println("¡Ha salido Entretenimiento!");
            contj2 = hacerPreguntas(writer2, socketreaser2, preguntasEntretenimiento, respuestasEntretenimiento);
        }

        // PUNTOS
        writer1.println("¡El juego ha terminado! Tu puntaje es: " + contj1);
        writer2.println("¡El juego ha terminado! Tu puntaje es: " + contj2);

        if (contj1 > contj2) {
            writer1.println("¡Felicidades! Eres el ganador 🎉");
            writer2.println("¡Lo siento, has perdido! 😔");
        } else if (contj2 > contj1) {
            writer2.println("¡Felicidades! Eres el ganador 🎉");
            writer1.println("¡Lo siento, has perdido! 😔");
        } else {
            writer1.println("¡Es un empate! 🔥");
            writer2.println("¡Es un empate! 🔥");
        }
        socket1.close();
        socket2.close();
        server.close();
    }

    public static int hacerPreguntas(PrintWriter writer, BufferedReader reader, String[] preguntas, String[] respuestasCorrectas) throws Exception {
        int puntos = 0;
        for (int i = 0; i < preguntas.length; i++) {
            writer.println(preguntas[i]);
            String respuesta = reader.readLine();
            if (respuesta.equalsIgnoreCase(respuestasCorrectas[i])) {
                writer.println("¡Respuesta correcta!");
                puntos++;
            } else {
                writer.println("Respuesta incorrecta. La respuesta correcta es: " + respuestasCorrectas[i]);
            }
        }
        return puntos;
    }
}