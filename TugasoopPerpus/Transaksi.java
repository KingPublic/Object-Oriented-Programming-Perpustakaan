public class Transaksi {
    private int idtransaksi;
    private String jumitem;
    private String tglpinjam;
    private String tglkembali;
    private Pustakawan pustakawan;
    private Member member;
    


    public Transaksi() {
    }



    public Transaksi(int idtransaksi, String jumitem, String tglpinjam, String tglkembali, Pustakawan pustakawan, Member member) {
        this.idtransaksi = idtransaksi;
        this.jumitem = jumitem;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
        this.pustakawan = pustakawan;
        this.member = member;
    }


    public int getIdtransaksi() {
        return this.idtransaksi;
    }

    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public String getJumitem() {
        return this.jumitem;
    }

    public void setJumitem(String jumitem) {
        this.jumitem = jumitem;
    }

    public String getTglpinjam() {
        return this.tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return this.tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public Pustakawan getPustakawan() {
        return this.pustakawan;
    }

    public void setPustakawan(Pustakawan pustakawan) {
        this.pustakawan = pustakawan;
    }

    public Member getMember() {
        return this.member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    

    

    



    
}
