package entity;

public class entity_transaksi {
    private int idTransaksi;
    private String date;
    private int total;
    int bayar = 0;
    private int kembali;
    private int idKasir;

    public entity_transaksi(int idTrans, String date, int total, int bayar, int back, int idKasir) {
        this.idTransaksi = idTrans;
        this.date = date;
        this.total = total;
        this.bayar = bayar;
        this.kembali = back;
        this.idKasir = idKasir;
    }

    public void cetak() {
        System.out.println("id Transaksi : " + this.idTransaksi);
        System.out.println("Tanggal      : " + this.date);
        System.out.println("total        : " + this.total);
        System.out.println("bayar        : " + this.bayar);
        System.out.println("kembali      : " + this.kembali);
        System.out.println("id kasir     : " + this.idKasir + "\n");
    }
}
