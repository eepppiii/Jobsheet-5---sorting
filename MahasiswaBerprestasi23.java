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

    void SelectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxmin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxmin].ipk) {
                    idxmin = j;
                }
                Mahasiswa23 tmp = listMhs[idxmin];
                listMhs[idxmin] = listMhs[i];
                listMhs[i] = tmp;
            }
        }
    }

    void intertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa23 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}