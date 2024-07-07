package UASPBO;

//inheritance:  ObatResep mewarisi semua properti dan metode dari kelas Obat,
//termasuk variabel dan method yang didefinisikan di kelas Obat.
public class ObatResep extends Obat {
    private String namaDokter;

    //constructor
    public ObatResep(String nama, String jenis, double harga, String namaDokter) {
        super(nama, jenis, harga);
        this.namaDokter = namaDokter;
    }

    //accessor getter
    public String getNamaDokter() {
        return namaDokter;
    }

    //mutator setter
    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    //polymorphism override
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Diresepkan oleh Dokter: " + namaDokter);
    }
}
