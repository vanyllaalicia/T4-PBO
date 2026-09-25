public class Main {
    public static void main(String[] args) {

        System.out.println("=== Objek Jinak ===");
        Jinak k1 = new Jinak("Suteng", 4);
        k1.info();
        k1.suara();
        k1.bermain();

        System.out.println();

        System.out.println("=== Polymorphism ===");
        Kucing[] daftar = {
            new Anggora("Ciko", 1),
            new Persia("Oyen", 1)
        };

        for (Kucing k : daftar) {
            k.info();
            k.suara();
            System.out.println();
        }
    }
}