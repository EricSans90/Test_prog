import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado holaaaa
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Introduce tu sexo (H o M): ");
        char sexo = scanner.nextLine().charAt(0);
        System.out.print("Introduce tu peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Introduce tu altura (m): ");
        double altura = scanner.nextDouble();

        // Crear objetos
        Persona persona0 = new Persona();
        Persona persona1 = new Persona(nombre, edad,persona0.generaDNI(), sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Juan");
        persona3.setEdad(30);
        persona3.setPeso(70);
        persona3.setAltura(1.75);

        // Comprobar peso ideal, sobrepeso o infrapeso
        persona1.imprimirResultadoIMC(persona1.calcularIMC());
        persona1.imprimirResultadoIMC(persona2.calcularIMC());
        persona1.imprimirResultadoIMC(persona3.calcularIMC());


        // Comprobar si es mayor de edad


        // Mostrar información de cada objeto

    }
}
