public class Detailpengembalian {
    private boolean rusaktdk;
    private int hargatelat;
    private Transaksi transaksi;
    private Koleksi koleksi;
    



    public Detailpengembalian() {
    }




    public Detailpengembalian(boolean rusaktdk, int hargatelat, Transaksi transaksi, Koleksi koleksi) {
        this.rusaktdk = rusaktdk;
        this.hargatelat = hargatelat;
        this.transaksi = transaksi;
        this.koleksi = koleksi;
    }


    public boolean isRusaktdk() {
        return this.rusaktdk;
    }

    public boolean getRusaktdk() {
        return this.rusaktdk;
    }

    public void setRusaktdk(boolean rusaktdk) {
        this.rusaktdk = rusaktdk;
    }

    public int getHargatelat() {
        return this.hargatelat;
    }

    public void setHargatelat(int hargatelat) {
        this.hargatelat = hargatelat;
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
