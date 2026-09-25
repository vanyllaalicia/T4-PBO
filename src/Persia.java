public class Persia extends Jinak {

    public Persia(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " mengeong pelan.");
    }
}