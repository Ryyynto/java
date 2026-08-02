public class Datanilai {
    public static void main(String[] args){
        String nama = "Budi Santoso";
        int tugas = 85;
        int uts = 78;
        int uas = 90;
        float total = tugas+uts+uas;
        float rata = total/3;

        System.out.println("=================================");
        System.out.println("        NILAI MAHASISWA");
        System.out.println("=================================");
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai UTS : " + uts);
        System.out.println("Nilai UAS : " + uas);
        System.out.println("Total Nilai : " + total);
        System.out.println("Rata rata : " + rata);
        System.out.println("=================================");
    }
}
