public class Methods_Functions {
    //f(x) = 5x + 10
    static int f(int x){
        return 5*x + 10;
    }
    static int g(int x, int y){
        return y + 2*x;
    }
    static void yaz(){
        System.out.println("merhaba dünya");
    }
    public static void main(String[] args){
        System.out.println(f(10));
        System.out.println(g(5,3));
        yaz();
        System.out.println(f(g(5,3)));
    }   
}
