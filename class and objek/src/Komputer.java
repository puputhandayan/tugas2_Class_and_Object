public class Komputer {
    String jenis_komputer;
    private String merk;

    public void setDataKomputer(String jenis, String merk) {
        this.jenis_komputer = jenis;
        this.merk = merk;
    }

    public String getJenis() {
        return jenis_komputer;
    }

    public String getMerk() {
        return merk;
    }

    public static void main(String[] args) {
        Komputer mykom = new Komputer();
        mykom.setDataKomputer("laptop", "macbook");
        System.out.println("Jenis komputer: " + mykom.getJenis());
        System.out.println("Merk komputer: " + mykom.getMerk());
    }
}