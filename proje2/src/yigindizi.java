public class yigindizi {
    int[] yigin;
    int isaretci;
    
    yigindizi(int boyut) {
        yigin = new int[boyut];
        isaretci = 0;
    }
    
    
    void diziyaz(){
    for(int i = 0; i < yigin.length; i++){
        System.out.println(yigin[i]);
    }
    
}

    public static void main(String[] args) {
        yigindizi yigin = new yigindizi(5);
        yigin.diziyaz();

    }
}
