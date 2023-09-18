public class Ex2 {
        public static double calcularTermoPG(int n, double a1, double q) {
            if (n == 1) {
                return a1; // O primeiro termo (a1) é igual a 1.
            } else {
                // Chamada recursiva para calcular o n-ésimo termo da PG.
                return calcularTermoPG(n - 1, a1, q) * q;
            }
        }
    
        public static void main(String[] args) {
            int n = 10; // Número do termo desejado (10º termo).
            double a1 = 1; // Primeiro termo da PG.
            double q = 2; // Razão da PG.
            
            double resultado = calcularTermoPG(n, a1, q);
            System.out.println("O " + n + "º termo da PG é: " + resultado);
        }
    }
