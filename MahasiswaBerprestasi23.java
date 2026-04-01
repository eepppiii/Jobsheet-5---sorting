import java.util.Scanner;

public class MahasiswaBerprestasi23 {
    Mahasiswa23[] listMhs = new Mahasiswa23[5];
    int idx = 0;

    void tambah(Mahasiswa23 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
    }

    // ✅ DIPERBAIKI: hanya menampilkan data yang terisi
    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilinformasi();
            System.out.println("-----------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa23 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();

        for (int i = 0; i < list.listMhs.length; i++) {
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // buang enter

            list.tambah(new Mahasiswa23(nim, nama, kelas, ipk));
            System.out.println();
        }

        System.out.println("Data Sebelum Sorting");
        list.tampil();

        list.bubbleSort();
        System.out.println("Data Setelah Sorting IPK (DESC)");
        list.tampil();
    }
}