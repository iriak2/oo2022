import java.io.*;
import java.util.ArrayList;
public class geomeetriline3 {

    public static void main(String[] arg) throws IOException{

        ArrayList<Double> list = new ArrayList<Double>();

        BufferedReader reader=new BufferedReader(new FileReader("sisend.txt"));
        String rida1=reader.readLine();
        double rida = Double.parseDouble(rida1);
        System.out.println(rida1);
        
        
        String line;
        while( (line = reader.readLine()) != null){
            list.add(Double.parseDouble(line));
        }
        System.out.println(list);

        PrintWriter writer=new PrintWriter(
            new FileWriter("valjund.txt"));
            writer.println("Esimese aasta palk oli: " + rida1);
            writer.println("Järgnevate aastate palgad olid: ");
            


        for(int i=0; i<4; i++){
            rida = rida * list.get(i);
            System.out.println(rida);
            writer.println(rida);
        }

        writer.close();
    
    }

}
