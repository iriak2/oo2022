public class hobu implements hobuInterface{
    double hobuKaal;
    public hobu(double kaal){
        hobuKaal=kaal;
    }
    
    public void paevaHein(){
        System.out.println(0.0198675497 * hobuKaal);
    }

    public void hobuKaal(){
        System.out.println(hobuKaal);
    }

    public void talveHein(){
        System.out.println(0.0198675497 * hobuKaal * (30*8));
    }
}
