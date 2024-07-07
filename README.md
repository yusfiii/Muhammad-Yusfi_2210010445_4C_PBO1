# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Obat`, `ObatResep`, dan `Apotek` adalah contoh dari class.

```bash
public class Obat {
    ...
}

public class ObatResep extends Obat {
    ...
}

public class Apotek {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `("Paracetamol", "Analgesik", 10000.0));` adalah contoh pembuatan object.

```bash
("Paracetamol", "Analgesik", 10000.0));
("Amoksisilin", "Antibiotik", 20000.0, "Dr. Smith"));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` , `jenis` dan `harga` adalah contoh atribut.

```bash
String nama;
String jenis;
double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Obat` dan `ObatResep`.

```bash
public Obat(String nama, String jenis, double harga) {
this.nama = nama;
this.jenis = jenis;
this.harga = harga;
}

public ObatResep(String nama, String jenis, double harga, String namaDokter) {
super(nama, jenis, harga);
this.namaDokter = namaDokter;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` , `setJenis` , `setHarga` dan `setNamaDokter` adalah contoh method mutator.

```bash
public void setNama(String nama) {
this.nama = nama;
}

public void setJenis(String jenis) {
this.jenis = jenis;
}

public void setHarga(double harga) {
this.harga = harga;
}

public void setNamaDokter(String namaDokter) {
this.namaDokter = namaDokter;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getJenis`, `getHarga`, `getNamaDokter` adalah contoh method accessor.

```bash
public String getJenis() {
return jenis;
}

public String getNama() {
return nama;
}

public double getHarga() {
return harga;
}

public String getNamaDokter() {
return namaDokter;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` , `jenis` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String jenis;
private double harga;

private String namaDokter;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ObatResep` mewarisi `Obat` dengan sintaks `extends`.

```bash
public class ObatResep extends Obat {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public void tampilkanInfo() {
System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Harga: " + harga);
}

@Override
public void tampilkanInfo() {
super.tampilkanInfo();
System.out.println("Diresepkan oleh Dokter: " + namaDokter);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data.

```bash
while (menjalankan) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);

System.out.println("1. Tambah Obat");
System.out.println("2. Tampilkan Inventaris");
System.out.println("3. Keluar");
System.out.print("Pilih opsi[1,2,3]: ");
int pilihan = scanner.nextInt();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ArrayList<Obat> inventaris = new ArrayList<>();` adalah contoh penggunaan array.

```bash
ArrayList<Obat> inventaris = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
    scanner.next();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Yusfi
NPM: 2210010445
Kelas: 4C TI BJB
