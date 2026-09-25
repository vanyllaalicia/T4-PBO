# Latihan Inheritance dan Polymorphism

## Struktur Program

```
src/
├── Bentuk.java
├── BujurSangkar.java
├── Lingkaran.java
├── Silinder.java
└── Main.java
```

## Penjelasan Konsep

### 1. Inheritance

Inheritance adalah konsep pewarisan, yaitu class turunan dapat mewarisi atribut dan method dari class induknya menggunakan keyword `extends`.

Pada program ini hubungan pewarisannya adalah:

- `Bentuk` (Superclass)
  - `BujurSangkar`
  - `Lingkaran`
    - `Silinder`

Contoh penggunaan inheritance:

```java
public class BujurSangkar extends Bentuk
```

Class `BujurSangkar` mewarisi atribut `warna` beserta method `getWarna()`, `setWarna()`, dan `printInfo()` dari class `Bentuk`.

Selain itu, constructor pada class turunan menggunakan `super()` untuk memanggil constructor milik parent class.

Contoh:

```java
super(warna);
```

---

### 2. Polymorphism

Polymorphism pada program ini menggunakan **method overriding**, yaitu setiap class turunan menuliskan kembali method `printInfo()` dengan perilaku yang berbeda.

Contoh:

- `Bentuk` menampilkan warna.
- `BujurSangkar` menampilkan warna dan luas.
- `Lingkaran` menampilkan warna dan luas.
- `Silinder` menampilkan warna dan volume.

Pada `Main.java`, polymorphism ditunjukkan dengan menyimpan beberapa objek berbeda ke dalam array bertipe `Bentuk`.

```java
Bentuk[] daftarBentuk = {bs, lg, sl};

for (Bentuk b : daftarBentuk) {
    b.printInfo();
}
```

Walaupun tipe referensinya `Bentuk`, method `printInfo()` yang dijalankan mengikuti jenis objek sebenarnya.

---


## Screenshot

Berikut hasil saat program dijalankan.

![Output](Output/Screenshot.png)