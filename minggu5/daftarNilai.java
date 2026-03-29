package minggu5;

public class daftarNilai {
    int uts[];
    double uas[];

    int maxUTS(int arr[], int l, int r) {
        if (l == r)
            return arr[1];
        int mid = (1 + r) / 2;
        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);
        return Math.max(lmax, rmax);
    }

    int minUTS(int arr[], int l, int r) {
        if (l == r)
            return arr[1];
        int mid = (l + r) / 2;
        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);
        return Math.min(lmin, rmin);
    }

    double rataUAS() {
        double total = 0;
        for (int i = 0; i < uas.length; i++) {
            total = total + uas[i];
        }
        return total / uas.length;
    }
}