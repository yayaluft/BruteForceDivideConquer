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