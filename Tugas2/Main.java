import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    Map<Integer, String> data = new HashMap<>();

    // Method untuk menambahkan mahasiswa
    public void setMahasiswa(Scanner scanner) {
        System.out.print("Masukkan nim mahasiswa: ");
        int nim = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        data.put(nim, nama);
        System.out.println("Data mahasiswa berhasil ditambahkan");
    }

    // Method untuk melihat daftar mahasiswa
    public void getMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            System.out.println("Nim: " + entry.getKey() + ", Nama: " + entry.getValue());
        }
    }

    // Method untuk update data mahasiswa
    public void updateMahasiswa(Scanner scanner) {
        System.out.print("Masukkan nim mahasiswa yang ingin diupdate: ");
        int nim = scanner.nextInt();
        scanner.nextLine();
        if (data.containsKey(nim)) {
            System.out.print("Masukkan nama mahasiswa baru: ");
            String nama = scanner.nextLine();
            data.put(nim, nama);
            System.out.println("Data mahasiswa berhasil diupdate");
        } else {
            System.out.println("Nim mahasiswa tidak ditemukan");
        }
    }

    // Method untuk menghapus data mahasiswa
    public void deleteMahasiswa(Scanner scanner) {
        System.out.print("Masukkan nim mahasiswa yang ingin dihapus: ");
        int nim = scanner.nextInt();
        if (data.containsKey(nim)) {
            data.remove(nim);
            System.out.println("Data mahasiswa berhasil dihapus");
        } else {
            System.out.println("Nim mahasiswa tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main fungsi = new Main();
        
        while (true) {
            System.out.println("\n1. Daftarkan mahasiswa");
            System.out.println("2. Lihat Daftar Mahasiswa");
            System.out.println("3. Update Data Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihanmu: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fungsi.setMahasiswa(scanner);
                    break;
                case 2:
                    fungsi.getMahasiswa();
                    break;
                case 3:
                    fungsi.updateMahasiswa(scanner);
                    break;
                case 4:
                    fungsi.deleteMahasiswa(scanner);
                    break;
                case 5:
                    System.out.println("Terimakasih Sudah Memakai Program ini");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}

