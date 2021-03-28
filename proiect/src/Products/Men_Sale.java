package Products;

public class Men_Sale extends Men_Clothes {

    static int nr_msclothes = 0;
    private double discount;
    protected int codems;

    public Men_Sale(String name, String type, String color, String fabric, double price, double discount) {
        super(name, type, color, fabric, price);
        this.discount = discount;
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

}
