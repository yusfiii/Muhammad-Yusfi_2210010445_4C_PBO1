package UASPBO;

public class Obat {
    //atribut dan encapsulation
    private String nama;
    private String jenis;
    private double harga;

    //constructor
    public Obat(String nama, String jenis, double harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    //accessor(getter): untuk mengambil nilai dari suatu atribut
    public String getNama() {
        return nama;
    }

    //mutator(setter): untuk mengubah nilai dari suatu atribut
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    //polymorphism overloading
    //Method ini membantu dalam debugging atau output informasi 
    //kepada pengguna tanpa perlu mengakses variabel instance langsung.
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Harga: " + harga);
    }
}
