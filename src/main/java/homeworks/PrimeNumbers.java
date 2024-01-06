package homeworks;

public class PrimeNumbers {

    public static boolean isPrime(int n){
        if (n == 0 || n == 1)
            return false;
        for (int i=2; i<n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

        int n = 1000000;
        System.out.println("All the prime numbers lower than 1 000 000 are: ");
        for (int i=1 ; i <= n ; i++){
            if( isPrime(i) )
                System.out.print(i + " ");
        }
    }
}
