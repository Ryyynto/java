public class ShowroomMobil {
    public static void main(String[] args) {
        String merkMobil = "Toyota Avanza";
        int harga = 275000000;
        int stokAwal = 12;
        int terjual = 5;
        int sisaStok = stokAwal - terjual;

        System.out.println("==============================");
        System.out.println(" DATA KENDARAAN");
        System.out.println("==============================");
        System.out.println("Merk Mobil : " + merkMobil);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Stok Awal : " + stokAwal);
        System.out.println("Terjual : " + terjual);
        System.out.println("Sisa Stok : " + sisaStok);
        System.out.println("==============================");
    }
}
