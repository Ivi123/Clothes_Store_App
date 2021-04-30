package Service;

import java.io.FileWriter;
import java.io.IOException;

///scriere in Men_Clothes.csv
public class Scriere_MC {
    private final static String path = "src/Fisiere/Men_Clothes.csv";

    public static void scriereMC(String name, String category, String color, String fabric, double price ){
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter((path), true);
            String stringBuilder = name + "," + category + "," + color + "," + fabric + "," + price + '\n';
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

