## Pertanyaan 5.2
1.	Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
2.	Apakah memungkinkan perulangan pada method ```faktorialBF()``` diubah selain menggunakan for? Buktikan!
3.	Jelaskan perbedaan antara ```fakto *= i;``` dan int ```fakto = n * faktorialDC(n-1);``` !
4.	Buat Kesimpulan tentang perbedaan cara kerja method ```faktorialBF()```  dan ```faktorialDC()```!
### Jawaban:
1. if digunakan untuk base case atau kondisi berhenti rekursi. else digunakan untuk memecahkan maasalah menjadi lebih kecil, lalu memanggil diri sendiri hingga mencapai base case.
2. Memungkinkan. apabila menggunakan while
```int faktorialBF(int n) {```
```  int fakto = 1;```
```  int i = 1;```
```  while (i <= n ) {```
    ```     fakto *= i;```
    ```     i++;```
```  }```
```  return fakto;```
```}```
3. fakto *= i untuk untuk brute force. n* faktorialDC(n-1) untuk divide & conquer.
4. faktorialDC() untuk eksekusi divide conquer menggunakan pendekatan rekursif, sedangkan faktorialBF() untuk eksekusi Brute force menggunakan pendekatan iteratif.

## Pertanyaan 5.3
1.	Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
2.	Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
3.	Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
4.	Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
### Jawaban:
1. pangkatBF() mengalikan nilai sebanyak pangkat kali dalam loop atau secara iteratif sedangkan pangkatDC() membagi pangkat menjadi setengahnya atau secara rekursif. 
2. iya ada tahap combine 
```return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);```
3. pangkatBF() tetap relevan karena dengan parameter method bisa dipakai secara fleksibel. Bisa tanpa parameter karena atribut nilai dan pangkat sudah ada di class.
4. Kesimpulan 
- pangkatBF(): mengalikan a sebanyak n kali secara berulang dari awal hingga akhir.
- pangkatDC(): memecah pangkat besar karena jumlah rekursi jauh lebih sedikit.

## Pertanyaan 5.4
1. 1.	Kenapa dibutuhkan variable mid pada method TotalDC()?
2.	Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
 ```double lsum = totalDC(arr, l, mid);```
 ```double rsum = totalDC(arr, mid+1, r);```
3.	Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
 ```return lsum+rsum;```
4.	Apakah base case dari totalDC()?
5.	Tarik Kesimpulan tentang cara kerja totalDC()
### Jawaban: 
1. variabel mid dibutuhkan untuk membagi array menjadi dua bagian.
2. base case di totalDC() untuk menghentikan rekursi ketika bagian array yang diproses hanya 1 elemen, langsung dikembalikan nilainya tanpa perlu membagi lagi.
3. lsum+rsum adalah tahap combine yang dimana keduanya dijumlahkan untuk mendapatkan total keseluruhan array.
4. ```if (l == r) return arr[1];```
5. kesimpulan:
- array dibagi menjadi dua menggunakan variabel mid.
- setiap bagian dihitung totalnya secara rekursif hingga tersisa 1 elemen.
- lsum+rsum digabungkan untuk mendapatkan hasil akhir