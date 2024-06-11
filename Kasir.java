package uts_pl;


// Kelas Induk Abstract
abstract class Kasir {
    protected String nama;
    protected double total;
    protected double kembalian;
    double bayar;

    public Kasir(String nama) {
        this.nama = nama;
        total = 0.0;
    }

    public void tambahTotal(double harga) {
        total += harga;
    }

    public void cetakTotal() {
        System.out.println("Total: Rp. " + total);
    }
        
     public abstract void Bayar(); 
    
       //Overloading Method
    public void Bayar(double jumlah) {
        System.out.println("Bayar ");
   
    }
    public double getBayar() {
        return bayar;
        
    }
    public void Kembalian (double kembalian){
        kembalian = kembalian-total;
        System.out.println("Kembalian : Rp. " +kembalian);
        this.kembalian=kembalian;         
          
       }
    }
    interface Pembayaran {
        void bayar(double jumlah);
} 