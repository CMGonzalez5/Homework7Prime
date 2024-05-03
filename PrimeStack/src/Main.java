import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> primenumbers = new Stack<>();
        int count = 0;
        int num = 2; 

        while (count < 50) {
            if (isPrime(num)) {
               primenumbers.push(num);
                count++;
            }
            num++;
        }
        while(!primenumbers.isEmpty()){
            System.out.println(primenumbers.pop());
        }
        
    }
    //method from first homework
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}