public class Sein_3 {

  private double seinaLaius;
  private double seinaPikkus;

  public Sein_3(double uusSeinaLaius, double uusSeinaPikkus){
    seinaLaius=uusSeinaLaius;
    seinaPikkus=uusSeinaPikkus;
  }

  public double seinaPindala(){
      return (seinaPikkus * seinaLaius);
  }

}
