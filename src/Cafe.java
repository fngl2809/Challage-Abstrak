import java.util.ArrayList;
import java.util.List;

class Cafe {
      private List<ProductForSale> menu;
    private List<OrderItem> order;

    public Cafe() {
        menu = new ArrayList<>();
        order = new ArrayList<>();
    }

    public void addMenuItem(ProductForSale product) {
        menu.add(product);
    }

    public void printOrder() {
        for (OrderItem item : order) {
            item.getProduct().printPricedItem(item.getQty());
        }
    }

    public void addItemToOrder(int qty, ProductForSale product) {
        order.add(new OrderItem(qty, product));
    }

    public void showMenu() {
        for (ProductForSale product : menu) {
            product.showDetails();
            System.out.println();
        }
    }

    public class Main {
        public static void main(String[] args) {
            Cafe cafe = new Cafe();
    
            // Tambahkan menu item ke cafe
            cafe.addMenuItem(new Drink("Kopi", 10000, "Kopi hitam", "Hot"));
            cafe.addMenuItem(new Drink("Teh", 8000, "Teh panas", "Hot"));
            cafe.addMenuItem(new Food("Nasi Goreng", 20000, "Nasi goreng dengan ayam", "Makanan"));
    
            // Tampilkan menu
            cafe.showMenu();
    
            // Tambahkan item ke order
            cafe.addItemToOrder(2, cafe.menu.get(0));
            cafe.addItemToOrder(1, cafe.menu.get(1));
            cafe.addItemToOrder(1, cafe.menu.get(2));
    
            // Cetak order
            cafe.printOrder();
        }
}

}
