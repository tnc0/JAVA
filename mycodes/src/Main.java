import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Girilen iki sayıyı toplayıp sonucunu ekrana yazdıran program?
        
        Scanner myinput1 = new Scanner(System.in);  //Bir input aldık.
        Scanner myinput2 = new Scanner(System.in);  //Bir input aldık.
        
        System.out.print("sayi1: ");
        int sayi1 = myinput1.nextInt();   // aldığımız inputu integer tipi okuduk.
        
        System.out.print("sayi2: ");
        int sayi2 = myinput2.nextInt();   // aldığımız inputu integer tipi okuduk.
        
        System.out.print("Toplam: ");
        System.out.println(sayi1 + sayi2);
        */
        


        /* V=I*R formülünü kullanarak verilen I ve R değerine göre V yi hesaplayan prog?
        
        float I =(float)2.5 ;
        float R =(float) 2;
        float V = (float) I * R;
        System.out.println(V);
        */

        /* Kısa ve uzun kenarı girilen dikdörtgenin alanını ve çevresini  hesaplayan prog?

        int kisakenar = 2;
        int uzunkenar = 3;
        int cevre = (int)(2*(kisakenar + uzunkenar));
        int alan = (int)(kisakenar*uzunkenar);
        System.out.println("cevre: " + cevre);
        System.out.println("alan: " + alan);
        */

        /* Yarıçapı verilen çemberin alanını hesaplayan prog (pi = 3,14)?
         
        Scanner input = new Scanner(System.in);
        System.out.print("r: ");
        float r = input.nextFloat();
        float pi = (float) 3.1415;
        float alan = (float)r*pi;
        System.out.print("Dairenin alani: " + alan);
        */

        /*Girilen gün sayısını kaç yıl ve kaç ay olduğunu bulan program?
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int mounth = day / 30;
        int year = mounth / 12;
        System.out.println(year + "yil, " + mounth + "ay");
        */

        /* Klavyeden girilen 3 basamaklı sayının basamak değerlerini yazdıran program?
        
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int yuzler = sayi / 100;
        int onlar = sayi / 10 - yuzler*10;
        int birler = sayi - yuzler*100 - onlar*10;
        System.err.println(yuzler);
        System.err.println(onlar);
        System.err.println(birler);
        */

        
        /* A ve B değişken değerlerini üçüncü bir değişken kullanmadan yer değiştiriniz?
        
        char x = '2'; //x = a
        char y = 'a'; //y = 2
        
        int a = (int) x;    // a = 50
        int b = (int) y;    // b = 97
        
        a = a + b; // a = 147
        b = a - b; // b = 50 '2'
        a = a - b; // a = 97 'a'
        
        x = (char) a; 
        y = (char) b; 
        
        System.out.println(x);
        System.out.println(y);
        */
        
        
        /*  Girilen n ve k değerlerine göre k + 2k + 3k + ...+nk yı hesaplayan program? 
        
        Scanner input = new Scanner(System.in);
        System.out.print("n:");int n = input.nextInt();
        System.out.print("k:");int k = input.nextInt();
        int answer = k*(n*(n+1)/2);
        System.out.println(answer);
        */

        /* Girilen sayının pozitif ya da negatif olduğunu ekrana yazınız?
        
         
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number < 0){
            System.out.print("negatif");
        }
        else if(number == 0){
            System.out.print("notr");
        }
        else{
            System.out.print("pozitif");
        }
        */

        /* Kullanıcının girdiği üç sayıdan büyük olanını yazdıran program? 
        
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        int max;
        
        if(number1 > number2){
            if(number1 > number3){
                max = number1;
            }
            else{
                max = number3;
            }
        }
        else if(number2 > number3){
            max = number2;
        }
        else{
            max = number3;
        }
        System.out.println("max:"+max);
        */


        /* Girilen 5 sayının ortalamasını bulan program?
         
        
        int top = 0;
        for(int i = 0;i < 5;i++){
            System.out.print("write 5 number:");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            top += num;
        }
        float ort =(float) top/5;
        System.out.println("ortlama:"+ort);
        */


        /* OLMADI (max & min)
        
        int max = 0;
        int min = 0;
        
        for (int i=0;i<5;i++){
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        } 
        System.out.println(max);
        System.out.println(min);
        */
        /* Girilen sayının tam bölenlerini bulan program?

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        for (int i = 1; i<=number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
        */
        
        /* Girilen sayının asal olup olmadığını bulan program ?
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean asal = true;
        
        for (int i = 2; i < number; i++){
            if(number % i != 0){
                asal = true;
            }
            else{
                asal = false;
                break;
            }
        }
        
        if(asal == true){
            System.out.print("Asal.");
        }
        
        else{
            System.out.println("Asal degil.");
        }
        */
        
        
    }
}
