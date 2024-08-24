abstract class ProductForSale {
    protected String name;
    protected double price;
    protected String description;

    public ProductForSale(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        System.out.println(quantity + " x " + name + " = " + getSalesPrice(quantity));
    }

    public abstract void showDetails();
}


