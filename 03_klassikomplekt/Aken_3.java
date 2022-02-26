public class Aken_3 {

    private double aknaLaius;
    private double aknaPikkus;

    public Aken_3(double uusAknaLaius, double uusAknaPikkus){
    aknaLaius=uusAknaLaius;
    aknaPikkus=uusAknaPikkus;
  }

    public double aknaPindala(){
        return (aknaPikkus * aknaLaius);
    }

}
