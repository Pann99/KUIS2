package JavaCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemCollection {
    private List<Item> items;

    // Konstruktor
    public ItemCollection() {
        items = new ArrayList<>();
    }

    public void tambahItem(Item item) {
        items.add(item);
    }

    public void hapusItem(String nama) {
        items.removeIf(item -> item.getNama().equalsIgnoreCase(nama));
    }

    public Item cariItem(String nama) {
        for (Item item : items) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                return item;
            }
        }
        return null;
    }

    public void cetakSemuaItem() {
        if (items.isEmpty()) {
            System.out.println("Daftar item kosong!");
        } else {
            System.out.println("====================================================");
            System.out.printf("%-20s | %-13s | %-10s%n", "Nama", "Harga", "Jumlah");
            System.out.println("====================================================");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    public void urutkanItemBerdasarkanHarga() {
        Collections.sort(items, Comparator.comparingDouble(Item::getHarga));
    }
}