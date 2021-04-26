package Products;

import Service.Serviciu;

import java.util.Scanner;

import static Products.Women_Clothes.nr_wclothes;

public class Men_Sale extends Men_Clothes implements Serviciu {

    static int nr_msclothes = 0;
    private double discount;
    protected int codems;

    public Men_Sale() {
    }

    public Men_Sale(String name, String type, String color, String fabric, double price, double discount) {
        super(name, type, color, fabric, price);
        this.discount = discount;
        nr_msclothes++;
        codems = nr_msclothes;
    }

    public Men_Sale(Men_Sale haina) {
        super(haina);
        this.discount = haina.discount;
        nr_msclothes++;
        codems = nr_msclothes;
    }

    public int getCodems() {
        return codems;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void Discount()
    {
        double new_price = getPrice();
        new_price = Math.round(new_price - new_price * (getDiscount()/100));
        setPrice(new_price);
        System.out.println("New_price( discount of " +getDiscount() + " added  ): " + new_price + "$\n");
    }

    @Override
    public void AddProductM() {
        Scanner add = new Scanner(System.in);
        Men_Sale[] insert = new Men_Sale[10];

        String name, category, color, fabric;
        double price, discount;

        for(int i = 0; i < insert.length; i++)
        {
            System.out.println("Introduceti numele: ");
            insert[i] = new Men_Sale();
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

            System.out.println("Introduceti discount-ul: ");
            discount = add.nextDouble();
            insert[i].setDiscount(discount);

        }
    }
}
