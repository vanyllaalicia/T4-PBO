public class Anggora extends Jinak {

    public Anggora(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " mengeong manja.");
    }
}