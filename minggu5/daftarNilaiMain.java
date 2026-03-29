package minggu5;

import java.util.Scanner;

public class daftarNilaiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        daftarNilai dn = new daftarNilai();
        dn.uts = new int[jumlah];
        dn.uas = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai UTS mahasiswa ke-" + (i + 1) + ": ");
            dn.uts[i] = sc.nextInt();
            System.out.print("Masukkan nilai UAS mahasiswa ke-" + (i + 1) + ": ");
            dn.uas[i] = sc.nextDouble();
        }

        System.out.println("Nilai UTS Tertinggi: " + dn.maxUTS(dn.uts, 0, jumlah - 1));
        System.out.println("Nilai UTS Terendah: " + dn.minUTS(dn.uts, 0, jumlah - 1));
        System.out.println("Rata-rata nilai UAS: " + dn.rataUAS());
    }
}
