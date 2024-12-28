//Her döngü recursive olarak yazılabilir. Tam tersi de geçerlidir.
import java.util.Scanner;
public class Recursive {
    
    static int f(int x){
        
        if(x == 10){
            return 10;
        }
        
        System.out.println("x:"+x);                                                             
        
        return x + f(x + 1);
    }
    
    static int fibonacci(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args){
        
        /*
        int toplam = 0;
        for (int i = 0; i<10; i++){
            toplam += i+1; //toplam += i; -> 0,1,2,3,4,5,6,7,8,9 
        }                 //toplam += i+1;-> 1,2,3,4,5,6,7,8,9,10
        System.out.println(toplam);
        */
        
        
        /* 
        System.out.println("f(10) -> " + f(1));
        */
    
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
