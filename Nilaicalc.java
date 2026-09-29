public class Nilaicalc {
    public static void main(String[] args) {
        String nama = "Andi";
        int nilai = 30;
        char grade;

        if(nilai >= 85){
            grade = 'A';
        }
        else if(nilai >= 70){
            grade = 'B';
        }
        else if(nilai >= 60){
            grade = 'C';
        }
        else{
            grade = 'D';
        }

        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + grade);
    }
}
