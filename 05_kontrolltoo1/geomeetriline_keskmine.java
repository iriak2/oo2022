import java.util.*;
public class geomeetriline_keskmine {

    public static void main(String[] args){
        //ül 1
        double arv1=2.0;
        double arv2=2.0;
        System.out.println(Math.sqrt(arv1 * arv2));

        //ül 2
        ArrayList<Double> arvuList = new ArrayList<Double>();
        arvuList.add(2.0);
        arvuList.add(4.0);
        arvuList.add(6.0);
        arvuList.add(8.0);
        arvuList.add(10.0);

        double pikkus = arvuList.size();

        double korrutis=1;
        for(int i=0; i<pikkus; i++){
            korrutis=korrutis*arvuList.get(i);
        }
        double vastus=Math.pow(korrutis, (1/pikkus));
        System.out.println(vastus);
    }

}
