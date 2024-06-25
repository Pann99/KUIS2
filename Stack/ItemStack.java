package Stack;
import java.util.Stack;

public class ItemStack {
    private Stack<Item> stack;

    // Konstruktor
    public ItemStack() {
        stack = new Stack<>();
    }

    public void tambahItem(Item item) {
        stack.push(item);
    }

    public Item hapusItem() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Item cariItem(String nama) {
        for (Item item : stack) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                return item;
            }
        }
        return null;
    }

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
