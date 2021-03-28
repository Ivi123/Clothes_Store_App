package Products;

import java.util.Comparator;

public class Men_Clothes implements Comparable<Men_Clothes> {
    static int nr_mclothes = 0;
    private String name, category, color, fabric;
    private double price; // dollars
    public int code;

    public Men_Clothes(){

    }
    public Men_Clothes(String name, String category, String color, String fabric, double price) {

        this.name = name;
        this.category = category;
        this.color = color;
        this.fabric = fabric;
        this.price = price;
        nr_mclothes++;
        code = nr_mclothes;

    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public String getFabric() {
        return fabric;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void DisplayMCLTH()
    {
        System.out.println("Details of men product: \n" + "Name: " + name + "\nType: " + category + "\nColor: " + color + "\nFabric: " + fabric + "\nPrice: " + price + "$" + '\n');
    }

    /*@Override
    public int compareTo(Men_Clothes o) {
        double price = o.getPrice();
        //cresc
        return (int) (this.price - price);
        //desc --  return (int) price - this.price
    }*/

    @Override
    public int compareTo(Men_Clothes o) {

        int comparecode = ((Men_Clothes) o).getCode();

        //ascending order
        return this.code - comparecode;

        //descending order
        //return compareQuantity - this.quantity;

    }

    public static Comparator<Men_Clothes> NameComparator
            = new Comparator<Men_Clothes>() {

        public int compare(Men_Clothes c1, Men_Clothes c2) {

            String Name1 = c1.getName().toUpperCase();
            String Name2 = c2.getName().toUpperCase();

            //ascending order
            return Name1.compareTo(Name2);

            //descending order
            //return fruitName2.compareTo(fruitName1);
        }

    };
}
