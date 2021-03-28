package Products;

public class Women_Clothes {
    static int nr_wclothes = 0;
    protected String name, category, color, fabric;
    protected double price;
    protected int code;

    public Women_Clothes(String name, String category, String color, String fabric, double price) {

        this.name = name;
        this.category = category;
        this.color = color;
        this.fabric = fabric;
        this.price = price;
        nr_wclothes++;
        code = nr_wclothes;

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

    public void setType(String type) {
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void DisplayWCLTH()
    {
        System.out.println("Details of women product: \n" + "Name: " + name + "\nType: " + category + "\nColor: " + color + "\nFabric: " + fabric + "\nPrice: " + price + "$" + '\n' );
    }
}
