public class ArrayProcess {
    
    
    static void diziyaz(int[] dizi){    //static türü; metotumuzu bir obje oluşturmadan kullanmamızı sağlar. Tıpkı Python'daki gibi.
    for(int i = 0; i < dizi.length; i++){
        System.out.print(dizi[i]+ "|");
    }System.out.println();
    }


    static void recursiveDiziYaz(int[] dizi, int index){
        if(index < dizi.length){
            System.out.print(dizi[index] + "|");
            recursiveDiziYaz(dizi, index + 1);
        }
        else{
            System.out.println();
        }
    }

    static int DiziArama(int[] dizi, int aranan){
        for(int i = 0; i < dizi.length; i++){
            if(dizi[i] == aranan){
                System.out.print(i+".index:");
                return dizi[i];
            }
        }
        return -1;
    }


    static int recursiveDiziArama(int[] dizi, int aranan, int index){
        if(index >= dizi.length){
            return -1; //"return 0;" : bulduğumuz elemanın 0.index olduğu anlamına gelebilir. Bu yüzden -1 döndürüyoruz.
        }
        if(index < dizi.length){
            if(dizi[index] == aranan){
                System.out.print(index+".index:");
                return dizi[index];
            }
        }
        return recursiveDiziArama(dizi, aranan, index + 1);
    }
    
    
    static int[] diziElemanEkle(int[] array, int yeni) {
        int[] yenidizi = new int[array.length + 1];

        for(int i = 0; i < array.length; i++) {
            yenidizi[i] = array[i];
        }
        yenidizi[array.length] = yeni; //"array.length": last index of list actually.    
        return yenidizi;
    }
    



    static int[] diziElemanSil(int[] array) {
        int[] yenidizi = new int[array.length - 1];
        
        for(int i = 1; i < array.length; i++) {
            yenidizi[i-1] = array[i];
        }
        return yenidizi;
    }



    
    static int diziElemanSay(int[] array,int hedef) {
        int sayac = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == hedef){
                sayac = sayac + 1;
            }
        }
        return sayac;
    }


    

    static int[] diziArananElemanIndeks(int[] array, int hedef) {
        int[] indexdizi = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] == hedef){
                indexdizi[i] = i;
            }
            
        }
        return indexdizi;
    }


    

    public static void main(String[] args) {
        int[] dizi = {0,1,3,2,3,4,8,12};        
        int yenieleman = 65362;
        int[] yeniDizi = diziElemanEkle(dizi,yenieleman);
        diziyaz(yeniDizi);
        int[] yeniDizi2 = diziElemanSil(dizi);
        diziyaz(yeniDizi2);
        System.out.println(diziElemanSay(dizi, 3));
        int[] indexdizi = diziArananElemanIndeks(dizi, 3);
        diziyaz(indexdizi);

        recursiveDiziYaz(dizi, 0);
        System.out.println(DiziArama(dizi, 12));
        System.out.println(recursiveDiziArama(dizi, 8, 0));
    }
    
}