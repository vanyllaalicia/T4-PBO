public class Main {

    public static void main(String[] args) {

        BujurSangkar bs = new BujurSangkar(4, "Merah");
        Lingkaran lg = new Lingkaran(7, "Biru");
        Silinder sl = new Silinder(10, 3, "Hijau");

        System.out.println("=== Eksplorasi Objek ===");
        bs.printInfo();
        lg.printInfo();
        sl.printInfo();

        System.out.println("\n=== Polymorphism ===");

        Bentuk[] daftarBentuk = {bs, lg, sl};

        for (Bentuk b : daftarBentuk) {
            b.printInfo();
        }
    }
}