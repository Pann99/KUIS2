package Stack;
import java.util.Scanner;

public class MainStack {
    public static void main(String[] args) {
        ItemStack itemStack = new ItemStack();

        itemStack.tambahItem(new Item("Pulpen", 1500, 100));
        itemStack.tambahItem(new Item("Buku Catatan", 2500, 50));
        itemStack.tambahItem(new Item("Penghapus", 500, 200));
        itemStack.tambahItem(new Item("Pensil", 1000, 150));

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n====================================================");
            System.out.println("          MENU TOKO ATK - PANDYA CAHYA - 23         ");
            System.out.println("====================================================");
            System.out.println("1. Tambah Item");
            System.out.println("2. Hapus Item");
            System.out.println("3. Cari Item");
            System.out.println("4. Cetak Semua Item");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("====================================================");
                    System.out.println("                    PENAMBAHAN ITEM                 ");
                    System.out.println("====================================================");
                    System.out.print("Masukkan nama item: ");
                    String nama = scanner.next();
                    System.out.print("Masukkan harga item: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Masukkan jumlah item: ");
                    int jumlah = scanner.nextInt();
                    itemStack.tambahItem(new Item(nama, harga, jumlah));
                    break;
                case 2:
                    System.out.println("====================================================");
                    System.out.println("                   PENGHAPUSAN ITEM                 ");
                    System.out.println("====================================================");
                    Item itemDihapus = itemStack.hapusItem();
                    if (itemDihapus != null) {
                        System.out.println("Item dihapus: " + itemDihapus);
                    }
                    break;
                case 3:
                    System.out.println("====================================================");
                    System.out.println("                    PENCARIAN ITEM                  ");
                    System.out.println("====================================================");
                    System.out.print("Masukkan nama item yang ingin dicari: ");
                    String namaItem = scanner.next();
                    Item itemDitemukan = itemStack.cariItem(namaItem);
                    if (itemDitemukan != null) {
                        System.out.println("Item ditemukan: " + itemDitemukan);
                    } else {
                        System.out.println("Item dengan nama " + namaItem + " tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("====================================================");
                    itemStack.cetakSemuaItem();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
