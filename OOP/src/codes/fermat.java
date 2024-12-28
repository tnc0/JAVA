
public class fermat {

    
    boolean asalmi(long fermatadayi){
        int kontrol = 1;
        for(int i = 2; i<fermatadayi; i++){
            if(fermatadayi % i != 0){
                continue;
            }
            else{
                kontrol = 0;
                break;
            }
        }
        if (kontrol == 1){
            return true;
        }   
        else{
            return false;
        }
    }


    public static void main(String[] args) throws Exception {
        
        int n = 0;
        fermat fermatobj = new fermat();
        while (true){
            long fermat = (long) Math.pow(2, Math.pow(2, n)) + 1;
            if(fermatobj.asalmi(fermat) == true){
                System.out.println(fermat);
            }
            else{
                continue;
            }
            n += 1;
            Thread.sleep(1000);
            
        }
    }
}
