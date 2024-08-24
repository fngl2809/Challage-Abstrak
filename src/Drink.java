class Drink extends ProductForSale {
    private String type;

    public Drink(String name, double price, String description, String type) {
        super(name, price, description);
        this.type = type;
    }

    @Override
    public void showDetails() {
        System.out.println("Nama: " + name);
        System.out.println("Deskripsi: " + description);
        System.out.println("Harga: " + price);
        System.out.println("Tipe: " + type);
    }

}
