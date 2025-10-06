import java.util.Scanner;

public class Empleado {
    String nombre;
    String cargo;
    double salario;
    int dia;
    int mes;
    int año;

    public Empleado(String nombre, String cargo, double salario, int dia, int mes, int año) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void imprimir() {
        System.out.println("--------------|| FICHA DE EMPLEADO ||--------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha de ingreso: " + dia+"/"+mes+"/"+año);
        System.out.println("--------------|| ° ||--------------\n");

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------|| INGRESO DE EMPLEADO ||---------------");
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Ingrese el salario: ");
        double salario = sc.nextDouble();
        System.out.print("Ingrese el dia: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int año = sc.nextInt();
        Empleado empresa = new Empleado(nombre, cargo, salario, dia, mes, año);
        empresa.imprimir();
        Empleado empresa1 = new Empleado("ALEX SUAREZ","CONTADOR",1500,15,8,2022);
        empresa1.imprimir();
        Empleado empresa2 = new Empleado("DERECK ORTIZ","GUARDIA",700,10,16,2020);
        empresa2.imprimir();



    }

}
