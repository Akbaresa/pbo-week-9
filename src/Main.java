import data.data_barang;
import data.data_kasir;

import entity.entity_transaksi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Project PBO 2022");

        // input data kasir
        // data_kasir database_kasir = new data_kasir();
        // database_kasir.create("kurniawan",155,"123");
        // database_kasir.create("aan",156,"123");
        // database_kasir.read(); // viev database kasir
        //
        // // cek method update
        // database_kasir.update_pass(111,"111"); //pengujian salah
        // database_kasir.update_pass(155,"111"); //pengujian benar
        // database_kasir.read();
        //
        // //cek method delete
        // database_kasir.delete(111); //pengujian salah
        // database_kasir.delete(155); //pengujian benar
        // database_kasir.read();
        //
        // //tes login
        // int nip1 = database_kasir.login(156,"111");
        // int nip2 = database_kasir.login(156,"123");

        // data barang
        data_barang DBbarang = new data_barang();
        data_kasir objKasir = new data_kasir();

        DBbarang.create(1, "pepsodent", 7000, 1);
        DBbarang.create(2, "ciptadent", 5000, 12);
        DBbarang.view();
        System.out.println("==========overload======");
        DBbarang.view(1);
        // update
        DBbarang.updateHarga(1, 12000);
        DBbarang.updateStok(1, 23);
        // delete
        DBbarang.delete(2);
        System.out.println("== After ==");
        DBbarang.view();

        objKasir.create("esa", 1, "123");
        objKasir.create("ibrahim", 2, "12");
        System.out.println("=== Login ===");
        int idKasir = objKasir.login(1, "123");
        int idKasir2 = objKasir.login(2, "12");
        entity_transaksi objTransaksi = new entity_transaksi(1, "12/1/2022", 1, 7000, 0, idKasir);
        entity_transaksi objTransaksi1 = new entity_transaksi(2, "12/1/2022", 2, 5000, 0, idKasir2);

        // System.out.println(objKasir.login(1, "123"));
        // System.out.println(objKasir.login(2, "12"));
        System.out.println("=== Transaksi ===");
        objTransaksi.cetak();
        objTransaksi1.cetak();

    }
}