package Tund_7a;

public class hobu2{
    public static int varsaKaal(int emaKaal) {
        int ajutine = emaKaal / 10; //vastsyndinud varsa kaal on alati 10% tema ema kaalust.
        return ajutine;
    }

    public static void main(String[] args) {
        System.out.println(varsaKaal(450));
    }
    
}