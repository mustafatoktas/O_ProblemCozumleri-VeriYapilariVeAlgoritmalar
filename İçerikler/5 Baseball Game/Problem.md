<h1 align="center">
Beyzbol Oyunu<a name="article-top"></a>
</h1>

<h3 align="center">Baseball Game</h3>

## İçindekiler

- [Problem Açıklaması](#problem-açıklaması)
- [Örnekler](#örnekler)
- [Kısıtlar](#kısıtlar)
- [Çözüm](#çözüm)

<br>

<table>
  <tr>
    <th style="font-weight: bold;">Kaynak</th>
    <td>LeetCode</td>
  </tr>
  <tr>
    <th style="font-weight: bold;">Kategori</th>
    <td>Stack & Queue</td>
  </tr>
  <tr>
    <th style="font-weight: bold;">Zorluk Seviyesi</th>
    <td><img src="../0 İçerik Resources/Zorluk Seviyeleri/Kolay.png" alt="Kolay" height="20"/></td>
  </tr>
  <tr>
    <th style="font-weight: bold;">Eklenme Tarihi</th>
    <td>29 Kasım 2024</td>
  </tr>
  <tr>
    <th style="font-weight: bold;">Anahtar Kelime</th>
    <td></td>
  </tr>
</table>


![-----------------------------------------------------](../../Readme%20Resources/Line.png)

## Problem Açıklaması 

Garip kurallara sahip bir beyzbol oyununun skorlarını tutuyorsunuz. Oyunun başında skor tablosu boştur.

Size her bir öğesi aşağıdakilerden biri olan bir işlemler listesi (operations) verilir:

1. Bir tam sayı `x`

   Skor tablosuna yeni bir `x` skoru ekleyin.

2. `"+"`

   Skor tablosuna önceki iki skorun **toplamı** olan yeni bir skor ekleyin.

3. `"D"`

   Skor tablosuna önceki skorun **iki katı** olan yeni bir skor ekleyin.

4. `"C"` 

   Önceki skoru geçersiz kılar ve skor tablosundan siler.

İşlemlerin uygulanmasından sonra skor tablosundaki tüm skorların toplamını döndürün.

### Notlar

- Test durumları, verilen tüm işlemlerin geçerli olduğunu ve tüm ara hesaplamaların 32-bit tam sayı sınırları içinde kaldığını garanti eder.


![-----------------------------------------------------](../../Readme%20Resources/Line.png)

## Örnekler

- ### Örnek 1

  **Girdi:** `ops = ["5","2","C","D","+"]`

  **Çıktı:** `30`

  **Açıklama:** 
  ```
  "5" -> 5 skoru tabloya eklendi. Skor tablosu: [5]
  "2" -> 2 skoru tabloya eklendi. Skor tablosu: [5, 2]
  "C" -> Önceki skor (2) geçersiz kılındı. Skor tablosu: [5]
  "D" -> Önceki skorun (5) iki katı (10) tabloya eklendi. Skor tablosu: [5, 10]
  "+" -> Önceki iki skorun toplamı (5 + 10 = 15) tabloya eklendi. Skor tablosu: [5, 10, 15]
  Toplam: 5 + 10 + 15 = 30
  ```

- ### Örnek 2

  **Girdi:** `ops = ["5","-2","4","C","D","9","+","+"]`

  **Çıktı:** `27`

  **Açıklama:** 
  ```
  "5" -> 5 skoru tabloya eklendi. Skor tablosu: [5]
  "-2" -> -2 skoru tabloya eklendi. Skor tablosu: [5, -2]
  "4" -> 4 skoru tabloya eklendi. Skor tablosu: [5, -2, 4]
  "C" -> Önceki skor (4) geçersiz kılındı. Skor tablosu: [5, -2]
  "D" -> Önceki skorun (-2) iki katı (-4) tabloya eklendi. Skor tablosu: [5, -2, -4]
  "9" -> 9 skoru tabloya eklendi. Skor tablosu: [5, -2, -4, 9]
  "+" -> Önceki iki skorun toplamı (-4 + 9 = 5) tabloya eklendi. Skor tablosu: [5, -2, -4, 9, 5]
  "+" -> Önceki iki skorun toplamı (9 + 5 = 14) tabloya eklendi. Skor tablosu: [5, -2, -4, 9, 5, 14]
  Toplam: 5 + (-2) + (-4) + 9 + 5 + 14 = 27.
  ```

- ### Örnek 3

  **Girdi:** `ops = ["1","C"]`

  **Çıktı:** `0`

  **Açıklama:** 
  ```
  "1" -> 1 skoru tabloya eklendi. Skor tablosu: [1]
  "C" -> Önceki skor (1) geçersiz kılındı ve silindi. Skor tablosu: []
  Skor tablosu boş olduğundan, toplam 0'dır.
  ```

![-----------------------------------------------------](../../Readme%20Resources/Line.png)

## Kısıtlar

- `1 ≤ ops.length ≤ 1000`

- `operations[i]`, `"C"`, `"D"`, `"+"` veya aralık olarak `[-3 * 10⁴, 3 * 10⁴]` içinde bir tam sayıyı temsil eden bir string olacaktır.

- `"+"` işlemi için her zaman skor tablosunda en az iki önceki skor bulunacaktır.

- `"C"` ve `"D"` işlemleri için her zaman skor tablosunda en az bir önceki skor bulunacaktır.


![-----------------------------------------------------](../../Readme%20Resources/Line.png)

## Çözüm

<table>
  <thead>
    <tr>
      <th>Dil</th>
      <th>Zaman Karmaşıklığı ⏳</th>
      <th>Bellek Karmaşıklığı 🧠</th>
      <th>Çözüm Tarihi 📅</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><a href="./Kotlin.kt">Kotlin</a></td>
      <td align="center">O(n)</td>
      <td align="center">O(n)</td>
      <td align="center">29 Kasım 2024</td>
    </tr>
  </tbody>
</table>

<br>

<div align="center">
Problem çözümünü faydalı bulduysanız destek olmak adına beni takip edebilir veya bir kahve ısmarlayabilirsiniz ☕

Destekleriniz daha fazla problem üzerinde çalışmam için motivasyon sağlar 🚀
</div>

<br>

<div align="center">
  <a href="https://buymeacoffee.com/mustafatoktas"><img src="../../Readme Resources/Communication/Buy Me a Coffee.png" alt="Buy Me a Coffee" height="64"/></a>
</div>

<br>


![-----------------------------------------------------](../../Readme%20Resources/Line.png)

## İletişim

<a href="mailto:info@mustafatoktas.com"             ><img src="../../Readme Resources/Communication/Mail.png"     alt="Mail"     width="64"/></a>
<a href="https://t.me/mustafatoktas00"              ><img src="../../Readme Resources/Communication/Telegram.png" alt="Telegram" width="64"/></a>
<a href="https://www.linkedin.com/in/mustafatoktas/"><img src="../../Readme Resources/Communication/LinkedIn.png" alt="LinkedIn" width="64"/></a>

<div align="center">
  <a href="#article-top"><img src="../../Readme Resources/Back to Top.png" alt="Back to Top" height="64"/></a>
</div>