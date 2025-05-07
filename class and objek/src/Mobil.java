public class Mobil {
    // Deklarasi variabel instance dengan access modifier private
    private String merk;

    // Constructor dengan parameter
    public Mobil(String merk) {
        this.merk = merk;
    }

    // Method getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Method setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Method untuk menampilkan merk
    public void tampilkanMerk() {
        System.out.println("Merk mobil: " + this.merk);
    }

    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil m = new Mobil("Toyota");

        // Menampilkan merk menggunakan method
        m.tampilkanMerk();

        // Mengubah merk menggunakan setter
        m.setMerk("Honda");

        // Menampilkan merk lagi
        System.out.println("Merk baru: " + m.getMerk());
    }
}