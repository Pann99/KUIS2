package Stack;
import java.util.Stack;

public class ItemStack {
    private Stack<Item> stack;

    // Konstruktor untuk inisialisasi stack
    public ItemStack() {
        stack = new Stack<>();
    }

    // Metode untuk menambahkan item ke dalam stack
    public void tambahItem(Item item) {
        stack.push(item);
    }

    // Metode untuk menghapus item dari stack
    public Item hapusItem() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // Metode untuk mencari item berdasarkan nama dalam stack
    public Item cariItem(String nama) {
        for (Item item : stack) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                return item;
            }
        }
        return null;
    }

    // Metode untuk mencetak semua item dalam stack
    public void cetakSemuaItem() {
        if (stack.isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            System.out.println("Daftar Item dalam Stack:");
            System.out.printf("%-20s | %-13s | %-10s%n", "Nama", "Harga", "Jumlah");
            System.out.println("---------------------------------------------");
            for (Item item : stack) {
                System.out.println(item);
            }
            System.out.println("---------------------------------------------");
        }
    }
}
