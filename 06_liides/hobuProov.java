import java.io.*;
public class hobuProov {
    public static void main (String[] arg) throws Exception{
        
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hobuse mass?");
        int mass=Integer.parseInt(reader.readLine());
        hobuInterface hobune=new hobu(mass);

        System.out.print("Heina kogus päevas ");
        hobune.paevaHein();
        System.out.print("Heina kogus talve jooksul ");
        hobune.talveHein();

    }
}
