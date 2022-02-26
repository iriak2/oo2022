public class Uks_3 {

    private double ukseLaius;
    private double uksePikkus;

    public Uks_3(double uusUkseLaius, double uusUksePikkus){
    ukseLaius=uusUkseLaius;
    uksePikkus=uusUksePikkus;
  }

    public double uksePindala(){
        return (uksePikkus * ukseLaius);
    }

}
