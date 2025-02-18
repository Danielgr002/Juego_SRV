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
        writer1.write("Esperando al jugador 2...");
        Socket socket2 = server.accept();
        PrintWriter writer2 = new PrintWriter(socket2.getOutputStream(), true);
        var socketreaser2 = new BufferedReader(new InputStreamReader(socket2.getInputStream()));

        //juador 1
        writer1.write("¡Bienvenidos al 'Desafío del Conocimiento'! 🎉");
        writer1.write("Pon a prueba tu inteligencia con nuestro emocionante juego de preguntas.");
        writer1.write("Vamos a elegir aleatoriamnete la categoría:");
        // fi juagor 2

        //juagdor 2
        writer2.write("¡Bienvenidos al 'Desafío del Conocimiento'! 🎉");
        writer2.write("Pon a prueba tu inteligencia con nuestro emocionante juego de preguntas.");
        writer2.write("Vamos a elegir aleatoriamnete la categoría:");
        // fi jugador 2

        Random rand = new Random();
        int categoria = rand.nextInt(1,5);

        //juagdor 1
        writer1.write("1️⃣ Ciencia 🧪");
        writer1.write("2️⃣ Historia 📜");
        writer1.write("3️⃣ Deporte ⚽");
        writer1.write("4️⃣ Entretenimiento 🎬");
        // fi jugador 2

        //System.out.println(categoria);

        //juagdor 2
        writer2.write("1️⃣ Ciencia 🧪");
        writer2.write("2️⃣ Historia 📜");
        writer2.write("3️⃣ Deporte ⚽");
        writer2.write("4️⃣ Entretenimiento 🎬");
        // fi juagdor 2

        if(categoria == 1){

            writer1.write("¡Ha salido Ciencia!");
            writer1.write("1. ¿Cuál es el elemento más abundante en la Tierra?");
            writer1.write("2. ¿Qué planeta es conocido como el planeta rojo?");
            writer1.write("3. ¿Cuál es la molécula responsable de almacenar información genética?");
            writer1.write("4. ¿Quién formuló la teoría de la relatividad?");
            writer1.write("5. ¿Cuántos huesos tiene el cuerpo humano adulto?");

            writer2.write("¡Ha salido Ciencia!");
            writer2.write("1. ¿Cuál es el elemento más abundante en la Tierra?");
            writer2.write("2. ¿Qué planeta es conocido como el planeta rojo?");
            writer2.write("3. ¿Cuál es la molécula responsable de almacenar información genética?");
            writer2.write("4. ¿Quién formuló la teoría de la relatividad?");
            writer2.write("5. ¿Cuántos huesos tiene el cuerpo humano adulto?");

        } else if (categoria == 2) {
            writer1.write("¡Ha salido Historia!");
            writer1.write("1. ¿En qué año llegó Cristóbal Colón a América?");
            writer1.write("2. ¿Quién fue el primer presidente de los Estados Unidos?");
            writer1.write("3. ¿Cuál fue la causa principal de la Primera Guerra Mundial?");
            writer1.write("4. ¿En qué año terminó la Segunda Guerra Mundial?");
            writer1.write("5. ¿Qué civilización construyó las pirámides de Egipto?");

            writer2.write("¡Ha salido Historia!");
            writer2.write("1. ¿En qué año llegó Cristóbal Colón a América?");
            writer2.write("2. ¿Quién fue el primer presidente de los Estados Unidos?");
            writer2.write("3. ¿Cuál fue la causa principal de la Primera Guerra Mundial?");
            writer2.write("4. ¿En qué año terminó la Segunda Guerra Mundial?");
            writer2.write("5. ¿Qué civilización construyó las pirámides de Egipto?");

        } else if (categoria == 3) {
            writer1.write("¡Ha salido Deporte!");
            writer1.write("1. ¿Cuántos jugadores tiene un equipo de fútbol en el campo?");
            writer1.write("2. ¿Quién ha ganado más títulos de Fórmula 1 en la historia?");
            writer1.write("3. ¿En qué país se originó el tenis?");
            writer1.write("4. ¿Cuántos puntos vale un triple en baloncesto?");
            writer1.write("5. ¿Cuál es el evento deportivo más visto en el mundo?");

            writer2.write("¡Ha salido Deporte!");
            writer2.write("1. ¿Cuántos jugadores tiene un equipo de fútbol en el campo?");
            writer2.write("2. ¿Quién ha ganado más títulos de Fórmula 1 en la historia?");
            writer2.write("3. ¿En qué país se originó el tenis?");
            writer2.write("4. ¿Cuántos puntos vale un triple en baloncesto?");
            writer2.write("5. ¿Cuál es el evento deportivo más visto en el mundo?");
        } else {
            writer1.write("¡Ha salido Entretenimiento!");
            writer1.write("1. ¿Quién interpretó a Iron Man en el Universo Cinematográfico de Marvel?");
            writer1.write("2. ¿Cuál es la película con mayor recaudación de la historia?");
            writer1.write("3. ¿Qué serie de televisión tiene más temporadas hasta la fecha?");
            writer1.write("4. ¿Quién es el creador de Mickey Mouse?");
            writer1.write("5. ¿Cuál es el videojuego más vendido de todos los tiempos?");

            writer2.write("¡Ha salido Entretenimiento!");
            writer2.write("1. ¿Quién interpretó a Iron Man en el Universo Cinematográfico de Marvel?");
            writer2.write("2. ¿Cuál es la película con mayor recaudación de la historia?");
            writer2.write("3. ¿Qué serie de televisión tiene más temporadas hasta la fecha?");
            writer2.write("4. ¿Quién es el creador de Mickey Mouse?");
            writer2.write("5. ¿Cuál es el videojuego más vendido de todos los tiempos?");
        }

        System.out.println("¡Responde correctamente y conviértete en el campeón del conocimiento!");



    }
}