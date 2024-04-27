import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int lastTransactionId = 0;
    static ArrayList<Member> listmem = new ArrayList<Member>();
    static ArrayList<Transaksi> listrans = new ArrayList<Transaksi>();
    static ArrayList<Detailpengembalian> listpengembalian = new ArrayList<Detailpengembalian>();
    static ArrayList<Koleksi> listkoleksi = new ArrayList<Koleksi>();
    static Pattern pattern = Pattern.compile ("[0-9]");
    
    public static void main(String[] args) throws IOException {
        
        boolean validinput = false;
        
        
        
        Pustakawan perpus = new Pustakawan("P1", "Andrey", "Kingand", "and123", "Laki - laki"); 

        while (!validinput) {
            
        System.out.println("==================== MENU ======================");
        System.out.println("1. Pustakawan ");
        System.out.println("2. Mahasiswa / Dosen / Staff ");
        System.out.println("3. Quit ");
        System.out.println("Pilihanmu : ");
        String Choice1 = scanner.nextLine();
        int Choice2 = Integer.parseInt(Choice1);
        System.out.println("================================================");

            switch (Choice2) {
                case 1:
                    System.out.println("================================================");
                    System.out.println(" Selamat Datang! Login Pustakawan ");
                    System.out.print(" Masukkan Username : ");
                    String useper = scanner.nextLine();
                    System.out.print(" Masukkan Password : ");
                    String passper = scanner.nextLine();
                    System.out.println("================================================");

                    if (useper.matches(perpus.getUsername()) && passper.matches(perpus.getPassword())) {
                        System.out.println("================================================");
                        System.out.println("      Hello " + perpus.getUsername() + "        " );
                        System.out.println("================================================");
                        System.out.println(" Apa Yang Ingin Kamu Lakukan ? : " );
                        System.out.println("1. Check Peminjaman Member ");
                        System.out.println("2. Input Member ");
                        System.out.println("3. Input Koleksi ");
                        System.out.println("4. Check Member ");
                        System.out.println("5. Quit ");
                        System.out.println("Pilihanmu : ");
                        String Choice4 = scanner.nextLine();
                        int Choiceperpus = Integer.parseInt(Choice4);
                        System.out.println("================================================");
                        

                        if (Choiceperpus == 1) {
                                listpeminjaman();
                            
                        }
                        if (Choiceperpus == 2) {
                            System.out.print("Masukkan Job Status: ");
                            String job = scanner.nextLine();

                            System.out.print("Masukkan NIM/NIK: ");
                            String id = scanner.nextLine();
                            System.out.print("Masukkan Nama: ");
                            String nama = scanner.nextLine();
                            System.out.print("Masukkan Fakultas: ");
                            String fakultas = scanner.nextLine();
                            System.out.print("Masukkan Prodi: ");
                            String prodi = scanner.nextLine();
                            System.out.print("Buat Username: ");
                            String username = scanner.nextLine();
                            System.out.print("Buat Password: ");
                            String password = scanner.nextLine();
                            Member newMember = new Member(id, nama, fakultas, prodi, job, username, password);
                            listmem.add(newMember);
                            System.out.println("Member baru berhasil ditambahkan.");
                        }

                        if (Choiceperpus == 3) {
                            int idforkoleksi = getNextTransactionId("koleksi");
                            // System.out.print("Masukkan ID Koleksi : ");
                            // String idkoleksi = scanner.nextLine();
                            System.out.print("Masukkan Judul : ");
                            String judul = scanner.nextLine();
                            System.out.print("Masukkan Tahun Terbit : ");
                            String tahunterbit = scanner.nextLine();
                            System.out.print("Masukkan Edisi : ");
                            String edisi = scanner.nextLine();
                            System.out.print("Masukkan Kategori : ");
                            String kategori = scanner.nextLine();
                            System.out.print("Masukkan Jumlah Total : ");
                            int jtotal = Integer.parseInt(scanner.nextLine());
                            System.out.print("Masukkan Jumlah Tersedia :");
                            int jters = Integer.parseInt(scanner.nextLine());
                            Koleksi newKoleksi = new Koleksi(idforkoleksi, jtotal,jters, judul, tahunterbit, edisi, kategori);
                            listkoleksi.add(newKoleksi); 
                            System.out.println("Koleksi baru berhasil ditambahkan.");
                        }

                        if (Choiceperpus == 4) {
                            listmemembermethod();
                            
                            
                        }


                    }



                        
                    break;
                
                case 2:
                    System.out.println("================================================");
                    System.out.println("1. Masuk Akun ");
                    System.out.println("2. Quit");
                    System.out.println("Pilihanmu : ");
                    String Choice3 = scanner.nextLine();
                    int Choiceuser = Integer.parseInt(Choice3);
                    System.out.println("================================================");

                    switch (Choiceuser) {
                        case 1:
                            boolean userFound = false;
                            int index = 0, i = 0;
                            System.out.println("================================================");
                            System.out.println("Silahkan Masukkan Username : ");
                            String useser = scanner.nextLine();
                            System.out.println("Silahkan Masukkan Password : ");
                            String passuse = scanner.nextLine();
                            System.out.println("================================================");

                            for(Member member : listmem){
                                if (useser.matches(member.getUsername()) && passuse.matches(member.getPassword())) {
                                    userFound = true;
                                    index = i;
                                }
                                i++;
                            }

                                if(userFound){
                                    
                                    System.out.println("================================================");
                                    System.out.println("         Hello " + listmem.get(index).getNama() + "        " );
                                    System.out.println("================================================");
                                    System.out.println("Apa Yang Ingin Kamu Lakukan ? : ");
                                    System.out.println("1. Detail Peminjamanmu ");
                                    System.out.println("2. Pinjam Koleksi(CD/Buku) ");
                                    System.out.println("Pilihanmu : ");
                                    String Choice5 = scanner.nextLine();
                                    int Choiceinuse = Integer.parseInt(Choice5);

                                    if (Choiceinuse == 1) {
                                        // heyy belum
                                        if (Choiceinuse == 1) {
                                            System.out.println("Detail Peminjaman Anda:");
                                            boolean found = false;
                                            for (Transaksi trans : listrans) {
                                                if (trans.getMember().getUsername().equals(listmem.get(index).getUsername())) {
                                                    System.out.println("ID Transaksi: " + trans.getIdtransaksi() + ", Item: " + trans.getJumitem() + ", Tanggal Pinjam: " + trans.getTglpinjam() + ", Tanggal Kembali: " + trans.getTglkembali());
                                                    found = true;
                                                }
                                            }
                                            if (!found) {
                                                System.out.println("Tidak ada peminjaman yang ditemukan.");
                                            }

                                        }
                                    }

                                    
                                    

                                    if (Choiceinuse == 2) {
                                        boolean userpound = false;
                                        int indexs = 0 , a = 0;
                                        System.out.println("================================================");
                                        System.out.println(" Pinjam ? ");
                                        System.out.println("1. CD | Buku | Majalah ");
                                        System.out.println("2. Check List Koleksi ");
                                        System.out.println("Pilihanmu : ");
                                        System.out.println("================================================");
                                        String Choice6 = scanner.nextLine();
                                        int Choicepin = Integer.parseInt(Choice6);

                                        if (Choicepin == 1 ) {
                                            
                                            System.out.println("Masukkan ID Buku | CD :");
                                            int itemId = Integer.parseInt(scanner.nextLine());
                                            Koleksi item = findKoleksiById(itemId, listkoleksi);
                                            if (item != null && item.getJters() > 0) {
                                                item.setJters(item.getJters() - 1);
                                                int newTransactionId = getNextTransactionId("transaksi");
                                                Transaksi newTransaksi = new Transaksi(newTransactionId, "1", inputTgl("Tanggal Pinjaman: "), inputakembali("Tanggal Kembali: "), perpus, listmem.get(index)); //pakek method dibawah -Remember -And 
                                                listrans.add(newTransaksi);
                                            
                                                System.out.println(" berhasil dipinjam. ID Transaksi Anda: " + newTransactionId);

                                            } 
                                            // else { 
                                            //     System.out.println((Choicepin == 1 ? "CD" : "Buku/Majalah") //enchance if + " tidak tersedia atau ID tidak ditemukan.");
                                            // }
                                            }
                                        if (Choicepin == 2) {
                                            listkoleksimethod();

                                        }



                                    

                                }
                            }

                           
                            break;

                        //case 2:
                            // System.out.println("================================================");
                            // System.out.print("Silahkan Masukkan Nim/Nik : ");
                            // String id = scanner.nextLine();
                            // System.out.print("Silahkan Masukkan Nama : ");
                            // String uname = scanner.nextLine();
                            // System.out.print("Silahkan Masukkan Fakultas : ");
                            // String fuse = scanner.nextLine();
                            // System.out.print("Silahkan Masukkan Prodi : ");
                            // String puse = scanner.nextLine();
                            // System.out.print("Silahkan Masukkan JobStatus : ");
                            // String juse = scanner.nextLine(); 
                            // System.out.print("Silahkan Buat Username : ");
                            // String ususe = scanner.nextLine();
                            // System.out.print("Silahkan Buat Password : ");
                            // String uspass = scanner.nextLine();
                            // System.out.print("================================================");
                            // listmem.add(new Member (id,uname,fuse,puse,juse,ususe,uspass)); salah nda ada buatakun soalnya fitur di member nda ada buatakun

                            //break;
                    
                        default:
                            break;
                    }

                    break;

                case 3:
                    validinput = true;

                    break;
            
                default:
                    break;
            }

        }

        

        
        
        
        
        
    }


    // BATAS MAIN  DISINI FUNCTION DAN METHOD - ANDDDD

    public static int getNextTransactionId(String jenis) {
        switch(jenis){
            case "transaksi":
                return (listrans.size() > 0) ? listrans.get(listrans.size() - 1).getIdtransaksi() : 0;  //Auto increment
            case "koleksi":
                return (listkoleksi.size() > 0) ? listkoleksi.get(listkoleksi.size() - 1).getIdkoleksi() : 0;  //Auto increment
        }
        return 0;
    }

    public static String inputTgl(String teks){
        System.out.print(teks);
        try{
            String tgl = scanner.nextLine();
            return tgl;
        } catch(Exception e){
            System.out.println("Error");
            return inputTgl(teks);
        }
    }

    public static String inputakembali(String tekss){
        System.out.print(tekss);
        try{
            String tgls = scanner.nextLine();
            return tgls;
        } catch(Exception e){
            System.out.println("Error");
            return inputakembali(tekss);
        }
    }

    public static String enumerator(String Judul, String[] listpilihan){
        System.out.println(Judul);
        int count = 1;
        for (String pilihan : listpilihan){
            System.out.println(count + "." + pilihan);
            count++;
        }
        System.out.print("Masukkan Pilihan: ");
        int pilihan;
        try{
            pilihan = Integer.parseInt(scanner.nextLine());
            if(pilihan <= listpilihan.length && pilihan > 0){
                return listpilihan[pilihan-1];
            } else{
                System.out.println("\nWrong Input!");
                return enumerator(Judul, listpilihan);
            }
        } catch(Exception e){
            System.out.println("\nWrong Input!");
            return enumerator(Judul, listpilihan);
        }

        
    }

    public static boolean printTXT(String bannerTitle, String tableFormat, Object[][] Databaris, String pathToFile, Object[] Judulkolom, int dataLengthTotal) throws IOException{
        try{
            PrintWriter txt = new PrintWriter (pathToFile);
            String titleBanner = "+", titlePadding = "";
            if(dataLengthTotal % 2 == 0){
                for(int i=0; i < dataLengthTotal; i++){
                    titleBanner += "-";
                }
            } else{
                for(int i=0; i < dataLengthTotal; i++){
                    titleBanner += "-";
                }
            }
            titleBanner += "+";
            for(int i=0; i < ((dataLengthTotal-bannerTitle.length())/2)-1; i++){
                titlePadding += " ";
            }
            txt.printf(titleBanner + "%n");
            txt.printf("|" + titlePadding + bannerTitle + " " + titlePadding + "|%n");
            txt.printf(titleBanner + "%n");
            txt.printf(tableFormat, Judulkolom);
            txt.printf(titleBanner + "%n");
            for (int n = 0; n < Databaris.length; n++) {
                txt.printf(tableFormat, Databaris[n]);
            }
            txt.printf(titleBanner + "%n");
            txt.close();
            return true;
        } catch(Exception e){
            return false;
        }
    }

    //Generate table untuk TXT dan di Terminal INI FUNCTIONYA

    public static void generateTable(String bannerTitle, String tableFormat, Object[][] Databaris, Object[] Judulkolom, int dataLengthTotal){
            String titleBanner = "+", titlePadding = "";
            if(dataLengthTotal % 2 == 0){
                for(int i=0; i < dataLengthTotal-1; i++){
                    titleBanner += "-";
                }
            } else{
                for(int i=0; i < dataLengthTotal-1; i++){
                    titleBanner += "-";
                }
            }
            titleBanner += "+";
            for(int i=0; i < ((dataLengthTotal-bannerTitle.length())/2)-1; i++){
                titlePadding += " ";
            }
            System.out.printf(titleBanner + "%n");
            System.out.printf("|" + titlePadding + bannerTitle + " " + titlePadding + "|%n");
            System.out.printf(titleBanner + "%n");
            System.out.printf(tableFormat, Judulkolom);
            System.out.printf(titleBanner + "%n");
            for (int n = 0; n < Databaris.length; n++) {
                System.out.printf(tableFormat, Databaris[n]);
            }
            System.out.printf(titleBanner + "%n");
    }

    public static Object[][] dataGenerator(int rowCount, Object[] Judulkolom){
        Object Databaris[][] =  new Object[rowCount][Judulkolom.length];
        return Databaris;
    }

    public static String tableFormatter(Object[][] Databaris, Object[] Judulkolom){
        int[] dataLength = new int[Judulkolom.length];
        for (int length = 0; length < Judulkolom.length; length++) {
            if (Judulkolom[length] != null) {
                int panjangHeader = Judulkolom[length].toString().length();
                if (panjangHeader > dataLength[length]) {
                    dataLength[length] = panjangHeader;
                }
            }
        }

        for(int i = 0; i < Databaris.length; i++){
            for (int l = 0; l < Judulkolom.length; l++) {
                if (Databaris[i][l] != null) {
                    int panjangData = Databaris[i][l].toString().length();
                    if (panjangData > dataLength[l]) {
                        dataLength[l] = panjangData;
                    }
                }
            }
        }
        
        String formatTable = "| %";
        int dataLengthTotal = 0;
        for(int a = 0; a < dataLength.length; a++) {
            formatTable += "-" + (dataLength[a] + 2) + "s | %";
            dataLengthTotal += dataLength[a] + 5;
        }
        formatTable += "n";
        return formatTable + "/" + dataLengthTotal;
    }

    //DISINI YANG PENTING UNTUK BUAT TABLE

    public static void listmemembermethod() throws IOException {
         Object[] Judulkolom = new Object[]{
        "No",
        "Nim/Nik",
        "Nama",
        "Fakultas",
        "Prodi",
        "Job Status",
        "Username",
        "Password"
    };
    Object[][] Databaris = dataGenerator(listmem.size(), Judulkolom);
    for(int i = 0; i < Databaris.length; i++){
        Member data = listmem.get(i);
        Databaris[i][0] = i + 1;
        Databaris[i][1] = data.getId_nimnik();
        Databaris[i][2] = data.getNama();
        Databaris[i][3] = data.getFakultas();
        Databaris[i][4] = data.getProdi();
        Databaris[i][5] = data.getJob();
        Databaris[i][6] = data.getUsername();
        Databaris[i][7] = data.getPassword();
    }
    generateTable("Members", tableFormatter(Databaris, Judulkolom).split("/")[0], Databaris, Judulkolom, Integer.parseInt(tableFormatter(Databaris, Judulkolom).split("/")[1]));
    printTXT("Members", tableFormatter(Databaris, Judulkolom).split("/")[0], Databaris, "Members.txt", Judulkolom, Integer.parseInt(tableFormatter(Databaris, Judulkolom).split("/")[1]));
    }



    public static void listkoleksimethod() throws IOException {
        Object[] Judulkolom = new Object[]{
       "No",
       "ID Koleksi",
       "Judul",
       "Tahun Terbit",
       "Edisi",
       "Kategori",
       "Jumlah Total",
       
   };
   Object[][] Databaris = dataGenerator(listkoleksi.size(), Judulkolom);
   for(int i = 0; i < Databaris.length; i++){
       Koleksi data = listkoleksi.get(i);
       Databaris[i][0] = i + 1;
       Databaris[i][1] = data.getIdkoleksi();
       Databaris[i][2] = data.getJudul();
       Databaris[i][3] = data.getTahunterbit();
       Databaris[i][4] = data.getEdisi();
       Databaris[i][5] = data.getKategori();
       Databaris[i][6] = data.getJtotal();
       
   }
   generateTable("Collections", tableFormatter(Databaris, Judulkolom).split("/")[0], Databaris, Judulkolom, Integer.parseInt(tableFormatter(Databaris, Judulkolom).split("/")[1]));
   printTXT("Collections", tableFormatter(Databaris, Judulkolom).split("/")[0], Databaris, "Collections.txt", Judulkolom, Integer.parseInt(tableFormatter(Databaris, Judulkolom).split("/")[1]));
   }







    public static void listpeminjaman() throws IOException { //tolong tambah tanggap kembali
         Object[] Judulkolom = new Object[]{
        "ID Transaksi",
        "Nama",
        "Item",
        "Tanggal Pinjam"
    };
    Object[][] Databaris = dataGenerator(listrans.size(), Judulkolom);
    for(int i = 0; i < Databaris.length; i++){
        Transaksi data = listrans.get(i);
        Databaris[i][0] = data.getIdtransaksi();
        Databaris[i][1] = data.getMember();
        Databaris[i][2] = data.getJumitem();
        Databaris[i][3] = data.getTglpinjam();
    }
    generateTable("List Peminjaman", tableFormatter(Databaris, Judulkolom).split("/")[0], Databaris, Judulkolom, Integer.parseInt(tableFormatter(Databaris, Judulkolom).split("/")[1]));
    printTXT("List Peminjaman", tableFormatter(Databaris, Judulkolom).split("/")[0], Databaris, "Peminjaman.txt", Judulkolom, Integer.parseInt(tableFormatter(Databaris, Judulkolom).split("/")[1]));
    }

    




    public static String pilihKoleksi(ArrayList<Koleksi> listKoleksi){
        String[] koleksi = new String[listKoleksi.size()];
        for(int i = 0; i < koleksi.length; i++){
            koleksi[i] = listKoleksi.get(i).getJudul();
        }
        return enumerator("Pilih Koleksi", koleksi);
    } 


    public static Koleksi findKoleksiById(int id, ArrayList<Koleksi> listKoleksi){
        for (Koleksi koleksi : listKoleksi){
            if (id == koleksi.getIdkoleksi()){
                return koleksi;
            }
        }
        return null;
    }

    //ndajadi pake hehehe cuman tes sj

//     // public static void displayData(ArrayList<Member> members, ArrayList<Transaksi> transaksi, ArrayList<Koleksi> koleksi) {
//     //     System.out.println("================================= Data Member =================================");
//     //     System.out.printf("%-10s %-20s %-15s %-15s %-10s %-15s %-15s\n", "ID", "Nama", "Fakultas", "Prodi", "Job", "Username", "Password");
//     //     for (Member member : members) {
//     //         System.out.printf("%-10s %-20s %-15s %-15s %-10s %-15s %-15s\n", member.getId_nimnik(), member.getNama(), member.getFakultas(), member.getProdi(), member.getJob(), member.getUsername(), member.getPassword());
//     //     }
    
//     //     System.out.println("================================= Data Transaksi =================================");
//     //     System.out.printf("%-15s %-20s %-20s %-15s %-15s\n", "ID Transaksi", "Jumlah Item", "Tanggal Pinjam", "Tanggal Kembali", "Member");
//     //     for (Transaksi tr : transaksi) {
//     //         System.out.printf("%-15s %-20s %-20s %-15s %-15s\n", tr.getIdtransaksi(), tr.getJumitem(), tr.getTglpinjam(), tr.getTglkembali(), tr.getMember().getNama());
//     //     }
    
//     //     System.out.println("================================= Data Koleksi =================================");
//     //     System.out.printf("%-10s %-20s %-15s %-15s %-15s %-10s\n", "ID Koleksi", "Judul", "Tahun Terbit", "Edisi", "Kategori", "Jumlah");
//     //     for (Koleksi k : koleksi) {
//     //         System.out.printf("%-10s %-20s %-15s %-15s %-15s %-10s\n", k.getIdkoleksi(), k.getJudul(), k.getTahunterbit(), k.getEdisi(), k.getKategori(), k.getJtotal());
//     //     }
//     // }

//     // public static void saveDataToFile(ArrayList<Member> members, ArrayList<Transaksi> transaksi, ArrayList<Koleksi> koleksi) throws FileNotFoundException {
        
//     //         PrintWriter writer = new PrintWriter("output_data");
//     //         writer.println("================================= Data Member =================================");
//     //         writer.printf("%-10s %-20s %-15s %-15s %-10s %-15s %-15s\n", "ID", "Nama", "Fakultas", "Prodi", "Job", "Username", "Password");
//     //         for (Member member : members) {
//     //             writer.printf("%-10s %-20s %-15s %-15s %-10s %-15s %-15s\n", member.getId_nimnik(), member.getNama(), member.getFakultas(), member.getProdi(), member.getJob(), member.getUsername(), member.getPassword());
//     //         }
    
//     //         writer.println("================================= Data Transaksi =================================");
//     //         writer.printf("%-15s %-20s %-20s %-15s %-15s\n", "ID Transaksi", "Jumlah Item", "Tanggal Pinjam", "Tanggal Kembali", "Member");
//     //         for (Transaksi tr : transaksi) {
//     //             writer.printf("%-15s %-20s %-20s %-15s %-15s\n", tr.getIdtransaksi(), tr.getJumitem(), tr.getTglpinjam(), tr.getTglkembali(), tr.getMember().getNama());
//     //         }
    
//     //         writer.println("================================= Data Koleksi =================================");
//     //         writer.printf("%-10s %-20s %-15s %-15s %-15s %-10s\n", "ID Koleksi", "Judul", "Tahun Terbit", "Edisi", "Kategori");
//     //         writer.close();
 
// }
}


