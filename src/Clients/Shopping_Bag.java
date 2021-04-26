package Clients;

import Products.*;

import java.util.Scanner;

public class Shopping_Bag extends Fidelity_Card {
    private double Order_Value;
    private Men_Clothes men_clothes;

    public Shopping_Bag(int card_id, int points, String owner ) {
        super(card_id, points, owner);
        this.Order_Value = Order_Value;
    }

    public double getOrder_Value() {
        return Order_Value;
    }

    public double addproduct() // functia trb sa returneze valoarea totala a produselor, doar ca aici citesc de la tastatura produsele
    {
        Scanner clothes = new Scanner(System.in);
        Scanner clth = new Scanner(System.in);
        System.out.println("Enter number of clothes: ");
        int nr_clothes = clothes.nextInt();
        for(int i = 0; i < nr_clothes; i++) {
            System.out.println("Enter details about clothes(name, code, price): ");
            String name = clth.nextLine();
            int code = clothes.nextInt();
            double price = clothes.nextLong();
            Order_Value = Order_Value + price;
        }

        setPoints(Order_Value + getPoints()); //nr de puncte adaugate pe card, reprezinta exact valoarea comenzii
        System.out.println("Total price for your order is: " + Order_Value + "$");
        return Order_Value;

    }

    public double addproduct2(Men_Clothes m)//aici incerc sa iau obiecte din pachetul Products, dar trb sa ma gandesc mai bine cum iau din fiecare
    {
        String name = m.getName();
        double price = m.getPrice();
        int code = m.getCode();

        Order_Value = Order_Value + price;
        setPoints(Order_Value + getPoints());
        return Order_Value;
    }

}
