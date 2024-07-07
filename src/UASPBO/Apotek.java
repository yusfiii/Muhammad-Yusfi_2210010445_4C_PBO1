package UASPBO;

//Mengimpor kelas ArrayList dan Scanner dari paket java.util,
//yang digunakan untuk menyimpan daftar obat dan mengambil input dari pengguna melalui keyboard
import java.util.ArrayList;
import java.util.Scanner;

public class Apotek {
    //Metode utama yang akan dieksekusi pertama kali saat program dijalankan.
    public static void main(String[] args) {
        //Membuat sebuah ArrayList bernama inventaris untuk menyimpan objek-objek obat(Obat dan ObatResep)
        ArrayList<Obat> inventaris = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        inventaris.add(new Obat("Paracetamol", "Analgesik", 10000.0));
        inventaris.add(new ObatResep("Amoksisilin", "Antibiotik", 20000.0, "Dr. Smith"));

        boolean menjalankan = true;
        
        //perulangan while:akan terus berjalan (menjalankan = true) sampai pengguna memilih opsi "3. Keluar"
        while (menjalankan) {
            System.out.println("1. Tambah Obat");
            System.out.println("2. Tampilkan Inventaris");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi[1,2,3]: ");
            int pilihan = scanner.nextInt();

            //seleksi:statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi
            switch (pilihan) {
                case 1:
                    //IO sederhana
                    tambahObat(scanner, inventaris);
                    break;
                case 2:
                    tampilkanInventaris(inventaris);
                    break;
                case 3:
                    menjalankan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    public static void tambahObat(Scanner scanner, ArrayList<Obat> inventaris) {
        try {
            System.out.print("Masukkan Nama Obat: ");
            String nama = scanner.next();
            System.out.print("Masukkan jenisnya: ");
            String jenis = scanner.next();
            System.out.print("Masukkan harga: ");
            double harga = scanner.nextDouble();

            System.out.print("Apakah ini obat resep dokter? (ya/tidak): ");
            String adalahObatResep = scanner.next();

            if (adalahObatResep.equalsIgnoreCase("ya")) {
                System.out.print("Masukkan nama dokter: ");
                String namaDokter = scanner.next();
                inventaris.add(new ObatResep(nama, jenis, harga, namaDokter));
            } else {
                
                inventaris.add(new Obat(nama, jenis, harga));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            scanner.next();  // Membersihkan buffer
        }
    }

    //polymorphism override
    public static void tampilkanInventaris(ArrayList<Obat> inventaris) {
        for (Obat obat : inventaris) {
            obat.tampilkanInfo();
        }
    }
}
