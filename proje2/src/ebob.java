public class ebob {
    static int EBOB(int x,int y){
        if(y == 0){
            return x;
        }
        return EBOB(y, x % y);
    }
    public static void main(String[] args){
        System.out.println(EBOB(2,4)); //2, 4' e bölünemez ve kalan kendisi(2) olur.
                                           //kendinden büyük bir sayı ile mod alınan  
                                           //işlemlerin açıklaması budur.                                          
        int a = 1;
        boolean isEven = a % 2 == 0;
        System.out.println(isEven);
    } 
}                                          //işlemlerin açıklaması budur.

/*
def ebob(a, b):
    if b == 0:
        return a
    return ebob(b, a % b)

num1 = 48
num2 = 18
 */