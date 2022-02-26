public class Test_3 {
    public static void main(String[] args){
        Tuba_3 tuba1=new Tuba_3(3.0, 2.0, 5.0);
        Aken_3 aken=new Aken_3(1.0, 1.0);
        Uks_3 uks=new Uks_3(1.0, 2.0);

        double vastus=(tuba1.toaPindala() - (aken.aknaPindala() + uks.uksePindala() ));
        System.out.println("Ühe akna ja uksega toa värvitav pindala on " + vastus + " ruutmeetrit.");
  
    }
}
