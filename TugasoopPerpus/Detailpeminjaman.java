public class Detailpeminjaman {
        private int totalpinjam;
        private Transaksi transaksi;
        private Koleksi koleksi;
//mw ksi ilang but nnti jdi aneh

    public Detailpeminjaman(int totalpinjam, Transaksi transaksi, Koleksi koleksi) {
        this.totalpinjam = totalpinjam;
        this.transaksi = transaksi;
        this.koleksi = koleksi;
    }


    public int getTotalpinjam() {
        return this.totalpinjam;
    }

    public void setTotalpinjam(int totalpinjam) {
        this.totalpinjam = totalpinjam;
    }

    public Transaksi getTransaksi() {
        return this.transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }

    public Koleksi getKoleksi() {
        return this.koleksi;
    }

    public void setKoleksi(Koleksi koleksi) {
        this.koleksi = koleksi;
    }






}
