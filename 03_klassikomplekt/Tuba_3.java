public class Tuba_3 {

    Sein_3 sein1;
    Sein_3 sein2;
    Sein_3 porand;

    public Tuba_3(double pikkus, double laius, double korgus){
        sein1=new Sein_3(pikkus, korgus);
        sein2=new Sein_3(laius, korgus);
        porand=new Sein_3(laius, pikkus);
    }

    public double toaPindala(){
        return ((sein1.seinaPindala() + sein2.seinaPindala()) * 2 + (porand.seinaPindala() * 2));
    }

}
