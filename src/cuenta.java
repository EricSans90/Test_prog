
    public class cuenta {
        //Atributos
        private String titular;
        private double cantidad;

        //Constructor 1: solo requiere el titular
        public cuenta(String titular) {
            this.titular = titular;
        }

        //Constructor 2: requiere el titular y la cantidad
        public cuenta(String titular, double cantidad) {
            this.titular = titular;
            this.cantidad = cantidad;
        }

        //Getters y setters para los atributos
        public String getTitular() {
            return titular;
        }
        public void setTitular(String titular) {
            this.titular = titular;
        }
        public double getCantidad() {
            return cantidad;
        }
        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return "cuenta " +
                    "titular=" + titular;
        }

        //Método ingresar
        public void ingresar(double cantidad) {
            if (cantidad > 0) {
                this.cantidad += cantidad;
            }
        }

        //Método retirar
        public void retirar(double cantidad) {
            if (cantidad > 0) {
                double saldoFinal = this.cantidad - cantidad;
                if (saldoFinal < 0) {
                    this.cantidad = 0;
                } else {
                    this.cantidad = saldoFinal;
                }
            }
        }
    }
