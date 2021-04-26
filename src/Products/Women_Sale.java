package Products;

import Service.Serviciu;

import java.util.Scanner;

public class Women_Sale extends Women_Clothes implements Serviciu {

    static int nr_wsclothes = 0;
    private double discount;
    protected int codews;

    public Women_Sale() {
    }

    public Women_Sale(String name, String category, String color, String fabric, double price, double discount ) {
        super(name, category, color, fabric, price);
        this.discount = discount;
        nr_wsclothes++;
        codews = nr_wsclothes;
    }

    public Women_Sale(Women_Sale haina) {
        super(haina);
        this.discount = haina.discount;
        nr_wsclothes++;
        codews = nr_wsclothes;
    }

    public int getCodews() {
        return codews;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void AddProductW() {
        Scanner add = new Scanner(System.in);
        Women_Sale[] insert = new Women_Sale[10];

        String name, category, color, fabric;
        double price, discount;

        for(int i = 0; i < insert.length; i++)
        {
            System.out.println("Introduceti numele: ");
            insert[i] = new Women_Sale();
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

    public void Discount()
    {
        double new_price = getPrice();
        new_price = Math.round(new_price - new_price * (getDiscount()/100));
        setPrice(new_price);
        System.out.println("New_price( discount of " +getDiscount() + " added  ): " + new_price + "$\n");
    }

}