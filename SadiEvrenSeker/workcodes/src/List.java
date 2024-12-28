//The calculated Fibonacci numbers saved to "fib[]" list.
import java.util.Scanner;
public class List {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();  //In this line, an input was received from the user
        int fib[] = new int[L]; //The received input was saved to a variable
        fib[0] = 1; //                  (alındı)
        fib[1] = 1;
        for (int i = 2; i<L; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int eleman = 0; eleman < fib.length; eleman++){
            System.out.print(fib[eleman]+" ");
        }
    }
}
