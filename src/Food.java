class Food extends ProductForSale {
    private String category;

    public Food(String name, double price, String description, String category) {
        super(name, price, description);
        this.category = category;
    }

    @Override
    public void showDetails() {
        System.out.println("Nama: " + name);
        System.out.println("Deskripsi: " + description);
        System.out.println("Harga: " + price);
        System.out.println("Kategori: " + category);
    }

}
