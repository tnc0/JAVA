/* */
public class siralama {


    static void diziyaz(int[] dizi){    //static türü; metotumuzu bir obje oluşturmadan kullanmamızı sağlar. Tıpkı Python'daki gibi.
        for(int i = 0; i < dizi.length; i++){
            System.out.print(dizi[i]+ "|");
        }System.out.println();
    }


    static void secmeliSiralamaString(String[] str) {
        for(int kelime1 = 0; kelime1 < str.length; kelime1++){
            int min_index = kelime1;
            for(int kelime2 = kelime1 + 1; kelime2 < str.length; kelime2++){
                if(str[kelime2].compareTo(str[min_index]) < 0){ //length()
                    min_index = kelime2;

                }
            }
           
            
            String temp = str[kelime1];
            str[kelime1] = str[min_index];
            str[min_index] = temp;
        
        
        }
        
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
    
    public static void main(String[] args) {
        String [] str = {"ali","ahmet","aliye","ayşe","azra","ceren"};
        secmeliSiralamaString(str);
        
    }
}
