package uts_pl;
class Menu {
    private final String kode;
    private final double harga;

    public Menu(String kode, double harga) {
        this.kode = kode;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public double getHarga() {
        return harga;
    }
}


