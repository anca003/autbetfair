package homeworks;

public class SumOfNumbers {

    public static int sumOfNumbers() {
        int sum = 0;
        for (int i=1 ; i <= 100 ; i++){
            sum = sum + i;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("Sum of the first 100 numbers higher than 0 is: " + sumOfNumbers());
    }
}
