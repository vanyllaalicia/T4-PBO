public class Jinak extends Kucing {

    public Jinak(String nama, int umur) {
        super(nama, umur);
    }

    public void bermain() {
        System.out.println(getNama() + " sedang bermain bola.");
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " mengeong dengan lembut.");
    }
}