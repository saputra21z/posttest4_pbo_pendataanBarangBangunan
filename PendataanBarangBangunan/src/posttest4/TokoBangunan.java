
package posttest4;

import java.util.ArrayList;
import java.util.Scanner;


public class TokoBangunan {
     protected String namaBrg, satuan;
    public int stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual;
    protected long noKodeBrg;
    String kode = "TB";
    
    TokoBangunan(String namaBrg, String satuan, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeBrg){
        this.namaBrg = namaBrg;
        this.satuan = satuan;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.stokAwal = stokAwal;
        this.stokMasuk = stokMasuk;
        this.stokKeluar = stokKeluar;
        this.noKodeBrg = noKodeBrg;
    }
    
    TokoBangunan() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    

    public long getNoKodeBrg() {
        return noKodeBrg;
    }

    public String getNamaBrg() {
        return namaBrg;
    }
    
    public void setNamaBrg(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public String getSatuan() {
        return satuan;
    }
    
    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getStokAwal() {
        return stokAwal;
    }
    
    public void setStokAwal(int stokAwal) {
        this.stokAwal = stokAwal;
    }
    
    public int getStokMasuk() {
        return stokMasuk;
    }
    
    public void setStokMasuk(int stokMasuk) {
        this.stokMasuk = stokMasuk;
    }
    public int getStokKeluar() {
        return stokKeluar;
    }
    
    public void setStokKeluar(int stokKeluar) {
        this.stokKeluar = stokKeluar;
    }

    
    public int getHargaBeli() {
        return hargaBeli;
    }
    
    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }
    public int getHargaJual() {
        return hargaJual;
    }
    
    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }
    
    public long getNoKode() {
        return noKodeBrg;
    }
    
    TokoBangunan TB;
    ArrayList<TokoBangunan> TBList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    public void tambahBarang(){
        System.out.println("\nMenambahkan Produk\n");
    }
    public void tampilBarang(){
        System.out.println("\nMenampilkan Produk\n");
    }
    public ArrayList<TokoBangunan> ubahBarang(ArrayList<TokoBangunan> TBList) {
        return TBList;
    }
    public ArrayList<TokoBangunan> hapusBarang(ArrayList<TokoBangunan> TBlist) {//OVERLOADING 1
        System.out.println("\nMenghapus Produk\n");
        return TBlist;
    }
    
}
