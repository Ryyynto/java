public class ProfilPerusahaan {
    public static void main(String[] args) {
        String namaPerusahaan = "TechNova Indonesia";
        String ceo = "Prabowo";
        int karyawanAwal = 48;
        int karyawanBaru = 12;
        int lamaRekrutmen = 3;
        
        int totalKaryawan = karyawanAwal + karyawanBaru;
        int rataRataRekrut = karyawanBaru / lamaRekrutmen;

        System.out.println("==========================================");
        System.out.println("      PROFIL PERUSAHAAN");
        System.out.println("==========================================");
        System.out.println("Nama Perusahaan : " + namaPerusahaan);
        System.out.println("CEO             : " + ceo);
        System.out.println("Karyawan Awal   : " + karyawanAwal);
        System.out.println("Karyawan Baru   : " + karyawanBaru);
        System.out.println("Total Karyawan  : " + totalKaryawan);
        System.out.println("Rata-rata Rekrut/Bln : " + rataRataRekrut);
        System.out.println("==========================================");
    }
}
