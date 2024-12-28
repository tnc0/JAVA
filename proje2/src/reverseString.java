public class reverseString {
    static void reverse(char s[], int index){   // Bir sey return etmesine gerek olmayan "void" metodumuz.
        if(index >= s.length){                  // Eger "index" degiskeni "s" dizisinin uzunlugunu gecerse,
            return;                             // Recursive 'i sonlandiriyoruz. Yanlis anlasilmasin; bir degeri return etmiyoruz, edemeyiz de. "Null" return ediyoruz.
        }
        System.out.print(s[index]);             // Dizinin "index" numaralı index 'ini yazdiriyoruz.
        reverse(s,index + 1);                   // Recursive ifademiz.
    }
    public static void main(String[] args){
        char[] s = {'y', 'u', 's', 'u', 'f', ' ', 't', 'u', 'n', 'c'};  // Character dizimizi ilan ettik.
        reverse(s, 0);                                            // Sadece metodu calistirdik.
    }
}
