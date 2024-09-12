import java.util.Scanner;

public class Tugas {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama kamu: ");
        String nama = scan.nextLine();

        System.out.print("Masukkan umur kamu: ");
        int umur = scan.nextInt();

        scan.close();

        System.out.println("Nama kamu: " + nama);
        System.out.println("Umur kamu: " + umur);
    }
}
