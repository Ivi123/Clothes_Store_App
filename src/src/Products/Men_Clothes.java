package Products;

import Service.Serviciu;

import java.util.Scanner;

public class Men_Clothes implements Serviciu{
    static int nr_mclothes = 0;
    private String name, category, color, fabric;
    private double price; // dollars
    public int code;

    public Men_Clothes(){

    }

    public Men_Clothes(String name, String category, String color, String fabric, double price) {
        super();
        this.name = name;
        this.category = category;
        this.color = color;
        this.fabric = fabric;
        this.price = price;
        nr_mclothes++;
        code = nr_mclothes;

    }

    public Men_Clothes(Men_Clothes haina) {
        this.name = haina.name;
        this.category = haina.category;
        this.color = haina.color;
        this.fabric = haina.fabric;
        this.price = haina.price;
        nr_mclothes++;
        code = nr_mclothes;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCategory(String category) {
        this.category = category;
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

    @Override
    public void AddProductM() {
        Scanner add = new Scanner(System.in);
        Men_Clothes[] insert = new Men_Clothes[10];

        String name, category, color, fabric;
        double price;


        for(int i = 0; i < insert.length; i++)
        {
            System.out.println("Introduceti numele: ");
            insert[i] = new Men_Clothes();
            name = add.next();
            insert[i].setName(name);

            System.out.println("Introduceti categoria: ");
            category = add.next();
            insert[i].setCategory(category);

            System.out.println("Introduceti culoarea: ");
            color = add.next();
            insert[i].setColor(color);

            System.out.println("Introduceti materialul: ");
            fabric = add.next();
            insert[i].setFabric(fabric);

            System.out.println("Introduceti pretul: ");
            price = add.nextDouble();
            insert[i].setPrice(price);

            insert[i].setCode(i);

        }
    }
}



