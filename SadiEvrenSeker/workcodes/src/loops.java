import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*
        for(int i = 0; i<10; i++){
             System.out.println(i);
        } 

        for(int a = 1; a < 100; a = a + 2){
            System.out.println(a);
        }
        
        for(int b = 0; b < 100; b++){
            if(b % 3 == 0){
                if(b % 7 == 0){
                    System.out.println(b);
                }
            }
        }
         
         */
        //2.2.2.2.2
        //PRATİK COZUM   2x2 = 4 , 2+2 = 4 sayıyı kendisi ile toplamak
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i<=10; i++){//a1 b1 c0
            System.out.print(b+" ");
            b = b*2;
            
        }
        //NORMAL COZUM
        int x = 2;
        int sonuc = 1;
        int us = 1;
        for(int sayac = 1; sayac<=5; sayac++){
            sonuc = x * us;
            us = us * 2;
            System.out.println(sonuc);
            }
        
        Scanner input = new Scanner(System.in);
        int sayac2 = input.nextInt();
        while(sayac2>0){
            sonuc = x*us;
            us = us * 2;
            System.out.println(sonuc);
            sayac2--;
        }
    
    
    Scanner input2 = new Scanner(System.in);
    int sayac = input2.nextInt();
    int sayi = 1;
    while (sayi <= sayac){
        if(sayi % 5 == 0){
            System.out.print(sayi);
            if(sayi != sayac){
                System.out.print("-");
            }
        }
        sayi++;
    }
    }
}
