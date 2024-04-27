public class Pustakawan {
    private String idpustakawan;
    private String nama;
    private String username;
    private String password;
    private String jk;


    public Pustakawan() {
    }


    public Pustakawan(String idpustakawan, String nama, String username, String password, String jk) {
        this.idpustakawan = idpustakawan;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.jk = jk;
    }


    public String getIdpustakawan() {
        return this.idpustakawan;
    }

    public void setIdpustakawan(String idpustakawan) {
        this.idpustakawan = idpustakawan;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJk() {
        return this.jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    




}
