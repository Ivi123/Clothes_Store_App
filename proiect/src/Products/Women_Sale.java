package Products;

public class Women_Sale extends Women_Clothes {

    static int nr_wsclothes = 0;
    private double discount;
    protected int codews;

    public Women_Sale(String name, String category, String color, String fabric, double price, double discount ) {
        super(name, category, color, fabric, price);
        this.discount = discount;
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

    public void Discount()
    {
        double new_price = getPrice();
        new_price = Math.round(new_price - new_price * (getDiscount()/100));
        setPrice(new_price);
        System.out.println("New_price( discount of " +getDiscount() + " added  ): " + new_price + "$\n");
    }
}