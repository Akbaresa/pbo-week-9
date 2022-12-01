package data;

import entity.entity_barang2;

import java.util.ArrayList;

public class data_barang {

    private ArrayList<entity_barang2> data_barang;

    public data_barang() {
        this.data_barang = new ArrayList<>();
    }

    public void create(int kode, String nama, int harga, int stok) {
        this.data_barang.add(new entity_barang2(kode, nama, harga, stok));
    }

    public void updateHarga(int kode, int harga) {
        for (int i = 0; i < data_barang.size(); i++) {
            if (kode == data_barang.get(i).getKodeBarang()) {
                this.data_barang.set(i, new entity_barang2(kode, data_barang.get(i).getNama(),
                        harga, data_barang.get(i).getStok()));
            }
        }
    }

    public void updateStok(int kode, int stok) {
        for (int i = 0; i < data_barang.size(); i++) {
            if (kode == data_barang.get(i).getKodeBarang())
                this.data_barang.set(i, new entity_barang2(kode, data_barang.get(i).getNama(),
                        data_barang.get(i).getHarga(), stok));

        }
    }

    public void delete(int kode) {
        for (int i = 0; i < data_barang.size(); i++) {
            if (kode == data_barang.get(i).getKodeBarang()) {
                this.data_barang.remove(i);
            }
        }
    }

    public void view() {
        for (int i = 0; i < this.data_barang.size(); i++) {
            this.data_barang.get(i).cetak();
        }
    }

    public void view(int index) {
        this.data_barang.get(index).cetak();
    }
}
