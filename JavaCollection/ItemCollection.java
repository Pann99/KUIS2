package JavaCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemCollection {
    private List<Item> items;

    // Konstruktor untuk inisialisasi daftar item
    public ItemCollection() {
        items = new ArrayList<>();
    }

    // Metode untuk menambahkan item ke dalam daftar
    public void tambahItem(Item item) {
        items.add(item);
    }

    // Metode untuk menghapus item dari daftar berdasarkan nama
    public void hapusItem(String nama) {
        items.removeIf(item -> item.getNama().equalsIgnoreCase(nama));
    }

    // Metode untuk mencari item dari daftar berdasarkan nama
    public Item cariItem(String nama) {
        for (Item item : items) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                return item;
            }
        }
        return null;
    }

    // Metode untuk mencetak semua item dalam daftar
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

    // Metode untuk mengurutkan item berdasarkan harga
    public void urutkanItemBerdasarkanHarga() {
        Collections.sort(items, Comparator.comparingDouble(Item::getHarga));
    }
}