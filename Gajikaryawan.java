public class Gajikaryawan {
    public static void main(String[] args) {

        String nama = "Andi Saputra";
        int gajiPokok = 6000000;
        int bonus = 750000;
        int potongan = 250000;
        int gajiBersih = gajiPokok + bonus - potongan;

        System.out.println("====================================");
        System.out.println("        DATA GAJI KARYAWAN");
        System.out.println("====================================");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Bonus : Rp" + bonus);
        System.out.println("Potongan : Rp" + potongan);
        System.out.println("Gaji Bersih : Rp" + gajiBersih);
        System.out.println("====================================");

    }
}
