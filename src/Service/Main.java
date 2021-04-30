package Service;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Menu.meniu();

        //scriere in fisierul Men_Clothes.csv
        Scriere_MC.scriereMC("blugi", "pantaloni", "bleu", "denim", 29);

    }

}