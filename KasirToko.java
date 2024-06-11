package uts_pl;
//inheritance, interface
class KasirToko extends Kasir implements Pembayaran{   
    private String namaToko;
    
    public KasirToko(String nama, String namaToko) {
        super(nama);
        this.namaToko = namaToko;
        System.out.println("Kasir = " +nama);
        System.out.println(namaToko);
    }
    //override method abstract
    @Override
    public void Bayar() {
        System.out.print("Jumlah pembayaran: Rp. ");
    }

    //Encapsulation
    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    // Method overriding
    @Override
    public void cetakTotal() {
        System.out.println("Total belanja di " + namaToko + ": Rp. " + total);
    }
    
    //implements mmethod
    @Override
    public void bayar(double jumlah) {
        System.out.println("Pembayaran: Rp. " + jumlah);
    }
}