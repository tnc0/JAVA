package codes;
class Zaman{
    int saat;
    int dakika;
    int saniye;
    
    Zaman(int saat, int dakika, int saniye){
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }


    void ilerle(){
        if(saniye == 60){
            saniye = 0;
            dakika++;
            if(dakika == 60){
                dakika = 0;
                saat++;
                if(saat == 24){
                    if(saat == 24){
                        saat = 0;
                    }
                }
            }
        }
        saniye++;
    }

    void yaz(){
        System.out.println("Zaman: "+saat+":"+dakika+":"+saniye);
    }
}
class Program {
    public static void main(String[] args) throws InterruptedException{
        Zaman zamanNesnesi = new Zaman(0,0,0);
        int s = 0;
        while(s <= 3){
            zamanNesnesi.yaz();
            Thread.sleep(1000);
            s += 1;
            zamanNesnesi.ilerle();
        }
    }
}

