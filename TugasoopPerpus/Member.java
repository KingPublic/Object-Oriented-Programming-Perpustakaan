public class Member {
    private String id_nimnik;
    private String nama;
    private String fakultas;
    private String prodi;
    private String job;
    private String username;
    private String password;
    
    


    public Member() {
    }



    public Member(String id_nimnik, String nama, String fakultas, String prodi, String job, String username, String password) {
        this.id_nimnik = id_nimnik;
        this.nama = nama;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.job = job;
        this.username = username;
        this.password = password;
        
    }


    public String getId_nimnik() {
        return this.id_nimnik;
    }

    public void setId_nimnik(String id_nimnik) {
        this.id_nimnik = id_nimnik;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
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

    

    
    
    

}
