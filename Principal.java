import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaHora();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n¿Cuántos usuarios deseas crear?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Usuario[] usuarios = crearUsuarios(cantidad, scanner);

        System.out.println("\n--- Lista de Usuarios ---");
        for (Usuario u : usuarios) {
            System.out.println("Nombre: " + u.nombre + " " + u.apellidos + " | Email: " + u.email);
        }
        scanner.close();
    }

    public static void mostrarFechaHora() {
        System.out.println("Fecha y hora actual: " + LocalDateTime.now());
    }

    public static Usuario[] crearUsuarios(int cantidad, Scanner scanner) {
        Usuario[] arrayUsuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            Usuario nuevoUsuario = new Usuario();
            System.out.println("\nDatos para el usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nuevoUsuario.nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            nuevoUsuario.apellidos = scanner.nextLine();
            System.out.print("Email: ");
            nuevoUsuario.email = scanner.nextLine();
            arrayUsuarios[i] = nuevoUsuario;
        }
        return arrayUsuarios;
    }
}