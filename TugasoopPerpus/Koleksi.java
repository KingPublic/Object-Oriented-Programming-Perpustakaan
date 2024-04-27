public class Koleksi {
    private int idkoleksi;
    private int jtotal;
    private int jters;
    private String judul;
    private String tahunterbit;
    private String edisi;
    private String kategori;

    //pakek enum utk menentukan dia cd or buku??


    public Koleksi() {
    }



    public Koleksi(int idkoleksi, int jtotal, int jters,String judul, String tahunterbit, String edisi, String kategori) {
        this.idkoleksi = idkoleksi;
        this.jtotal = jtotal;
        this.jters = jters;
        this.judul = judul;
        this.tahunterbit = tahunterbit;
        this.edisi = edisi;
        this.kategori = kategori;
    }


    public int getIdkoleksi() {
        return this.idkoleksi;
    }

    public void setIdkoleksi(int idkoleksi) {
        this.idkoleksi = idkoleksi;
    }

    public int getJtotal() {
        return this.jtotal;
    }

    public void setJtotal(int jtotal) {
        this.jtotal = jtotal;
    }

    public int getJters() {
        return this.jters;
    }

    public void setJters(int jters) {
        this.jters = jters;
    
    }

    

    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTahunterbit() {
        return this.tahunterbit;
    }

    public void setTahunterbit(String tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public String getEdisi() {
        return this.edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    









}
