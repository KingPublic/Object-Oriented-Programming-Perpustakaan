public class Detailbyr {
    private boolean status;
    private String jenisbyr;
    private int totalbyr;
    private Transaksi transaksi;
    


    public Detailbyr() {
    }


    public Detailbyr(boolean status, String jenisbyr, int totalbyr, Transaksi transaksi) {
        this.status = status;
        this.jenisbyr = jenisbyr;
        this.totalbyr = totalbyr;
        this.transaksi = transaksi;
    }


    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getJenisbyr() {
        return this.jenisbyr;
    }

    public void setJenisbyr(String jenisbyr) {
        this.jenisbyr = jenisbyr;
    }

    public int getTotalbyr() {
        return this.totalbyr;
    }

    public void setTotalbyr(int totalbyr) {
        this.totalbyr = totalbyr;
    }

    public Transaksi getTransaksi() {
        return this.transaksi;
    }

    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }







}
