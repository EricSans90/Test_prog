import java.util.Random;

public class Persona {
        //Atributos
        private String nombre;
        private int edad;
        private String DNI;
        private char sexo;
        private double peso;
        private double altura;

        //Constantes
        private final int PESO_IDEAL = 0;
        private final int INFRAPESO = -1;
        private final int SOBREPESO = 1;


        //Constructor por defecto
        public Persona() {
            this.nombre="";
            this.edad=0;
            this.DNI="";
            this.sexo = 'H';
            this.peso=0;
            this.altura=0;
        }

        //Constructor con nombre, edad y sexo
        public Persona(String nombre, int edad, char sexo) {
            this.nombre = nombre;
            this.edad = edad;
            this.DNI="";
            this.sexo = sexo;
            this.peso=0;
            this.altura=0;
        }

        //Constructor con todos los atributos
        public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.DNI = DNI;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
        }

        //Getters y setters para los atributos
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getDNI() {
            return DNI;
        }

        public void setDNI(String DNI) {
            this.DNI = DNI;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        //Método calcularIMC
        public int calcularIMC() {
            double imc = peso / (altura * altura);
            if (imc < 20) {
                return INFRAPESO;
            } else if (imc >= 20 && imc <= 25) {
                return PESO_IDEAL;
            } else {
                return SOBREPESO;
            }
        }

        //Método esMayorDeEdad
        public boolean esMayorDeEdad() {
            return edad >= 18;
        }

        //Método comprobarSexo
        private void comprobarSexo(char sexo) {
            if (sexo != 'H' && sexo != 'M') {
                this.sexo = 'M';
            }
        }

        //Método toString
        @Override
        public String toString() {
            return "Información de la persona: \n" +
                    "Nombre: " + nombre + "\n" +
                    "Edad: " + edad + "\n" +
                    "DNI: " + DNI + "\n" +
                    "Sexo: " + sexo + "\n" +
                    "Peso: " + peso + " kg\n" +
                    "Altura: " + altura + " m\n";
        }

        //Método generaDNI
        public String generaDNI() {
            Random rnd = new Random();
            int numDNI = rnd.nextInt((99999999 - 10000000) + 1) + 10000000;
            this.DNI = Integer.toString(numDNI) + generaLetraDNI(numDNI);
            return this.DNI;
        }
        // Método para generar la letra del DNI
        public char generaLetraDNI(int numDNI) {
            String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
            int modulo = numDNI % 23;
            char letra = juegoCaracteres.charAt(modulo);
            return letra;
        }

    public static void imprimirResultadoIMC(int valorIMC) {
        if (valorIMC == 0) {
            System.out.println("Peso ideal");
        } else if (valorIMC == -1) {
            System.out.println("Infrapeso");
        } else if (valorIMC == 1) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Valor IMC no válido");
        }
    }
    }


