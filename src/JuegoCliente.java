import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class JuegoCliente {
    public static void main(String[] args) throws IOException {
        // Conectar al servidor
        Socket socket = new Socket("10.2.1.175", 5009);
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner scanner = new Scanner(System.in);
        String mensaje = reader.readLine();
        System.out.println(mensaje);

        // categoría preguntas
        while (true) {
            mensaje = reader.readLine();

            System.out.println(mensaje);  // Mostrar las preguntas o instrucciones del servidor

            if (mensaje.contains("¡Ha salido Ciencia!") || mensaje.contains("¡Ha salido Historia!") || mensaje.contains("¡Ha salido Deporte!") || mensaje.contains("¡Ha salido Entretenimiento!")) {
                for (int i = 0; i < 5; i++) {
                    // Recibir pregunta
                    mensaje = reader.readLine();
                    System.out.println(mensaje);

                    // Leer jugador
                    String respuesta = scanner.nextLine();
                    writer.println(respuesta);

                    //incorrecto y correcto
                    mensaje = reader.readLine();
                    System.out.println(mensaje);
                }
            }
        }
    }
}
