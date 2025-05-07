public class Mahasiswa {
    // Variabel instance dengan access modifier private
    private String nama;
    private String nim;
    private int umur;

    // Constructor utama
    public Mahasiswa(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    // Constructor alternatif (overloading)
    public Mahasiswa(String nama) {
        this(nama, "NIM belum diisi", 0);
    }

    // Method getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method untuk perkenalan diri
    public void perkenalkanDiri() {
        System.out.println("Halo, perkenalkan:");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Umur: " + this.umur + " tahun");
    }

    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", "12345678", 20);
        Mahasiswa mhs2 = new Mahasiswa("Ani");

        // Memperkenalkan diri
        mhs1.perkenalkanDiri();
        System.out.println(); // Baris kosong
        mhs2.perkenalkanDiri();

        // Mengubah data menggunakan setter
        mhs2.setNim("87654321");
        mhs2.setUmur(19);

        System.out.println("\nSetelah diupdate:");
        mhs2.perkenalkanDiri();
    }
}