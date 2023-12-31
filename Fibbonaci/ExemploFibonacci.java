public class ExemploFibonacci {
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int iTermo = 6;
        int iFibonacci = Fibonacci(iTermo);
        System.out.println("O termo " + iTermo + " da sequência de Fibonacci é: " + iFibonacci);
    }
}