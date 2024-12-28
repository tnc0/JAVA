public class Examples {
    public static void main(String[] args){
        //Fibonacci
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i<10; i++){//a1 b1 c0
            System.out.print(c+" ");
            c = a + b;
            a = b;    
            b = c;            
        }
        for (int i = 1; i < 10; i++){
            System.out.print(i);
            
        }
        //
    }
}
