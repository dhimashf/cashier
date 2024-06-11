
package uts_pl;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
       KasirToko kasir1 = new KasirToko("Dhimas", "Warung TIF");
       System.out.println("=======================");
       System.out.println("Pilihan Menu :");
       System.out.println("1. Nasi Goreng   (15000)");
       System.out.println("2. Mie Goreng    (12000)");
       System.out.println("3. Ayam Bakar    (20000)");
       System.out.println("4. Indomie       (10000)");
       System.out.println("5. Esteh         (5000)");
       System.out.println("6. Kopi          (7000)");
       // Menu Makanan
       List<Menu> menuList = new ArrayList<>();
       menuList.add(new Menu("1", 15000));
       menuList.add(new Menu("2", 12000));
       menuList.add(new Menu("3", 20000));
       menuList.add(new Menu("4", 10000));
       menuList.add(new Menu("5", 5000));
       menuList.add(new Menu("6", 7000.0));  
       //Scanner
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Masukkan jumlah menu yang akan dipesan: ");
       int jumlahMenu = scanner.nextInt();
       scanner.nextLine(); 
        //Looping untuk jumlah menu
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan Kode Menu ke-" + (i + 1) + ": ");
            String namaMenu = scanner.nextLine();
            //If Else untuk memilih menu
            Menu menu = cariMenu(namaMenu, menuList);
            if (menu != null) {
                kasir1.tambahTotal(menu.getHarga());
            } else {
                System.out.println("Menu tidak ditemukan");
            }
        }
        kasir1.cetakTotal();
                kasir1.Bayar(); // Memanggil method Bayar() dari kelas KasirToko menggunakan polimorfisme
        double bayar = scanner.nextDouble();
         
        kasir1.bayar(bayar); // Memanggil method bayar() dari interface Pembayaran menggunakan polimorfisme              
        kasir1.Kembalian(bayar);               
       }
        private static Menu cariMenu(String nama, List<Menu> menuList) {
        for (Menu menu : menuList) {
            if (menu.getKode().equalsIgnoreCase(nama)) {
                return menu;
                
            }
        }
        return null;
        }
    }