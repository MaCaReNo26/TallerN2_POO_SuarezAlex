import java.sql.SQLOutput;
import java.util.Scanner;

public class Jugador {
    String nombre;
    String posicion;
    int edad;
    int camisa;

    public Jugador(String nombre, String posicion, int edad, int camisa) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.camisa = camisa;
    }

void mostrar() {
    System.out.println("--------------|| FICHA DE JUGADOR ||--------------");
    System.out.println("Nombre: " + nombre);
    System.out.println("Posicion: " + posicion);
    System.out.println("Edad: " + edad);
    System.out.println("Camisa: " + camisa);
    System.out.println("--------------|| ° ||--------------\n");
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------|| INGRESO DE JUGADORES ||---------------");
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el posicion del jugador: ");
        String posicion = sc.nextLine();
        System.out.print("Ingrese el edad del jugador: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese el numero de camisa del jugador: ");
        int camisa = sc.nextInt();
        Jugador jug1 = new Jugador(nombre, posicion, edad, camisa);
        jug1.mostrar();
        Jugador jug2 = new Jugador("AMY DIAZ", "ARQUERO", 21, 1);
        Jugador jug3 = new Jugador("DEREK ORTIZ", "DEFENSA", 20, 5);
        jug2.mostrar();
        jug3.mostrar();
    }

}
