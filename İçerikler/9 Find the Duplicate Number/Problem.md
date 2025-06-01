<h1 align="center">
Tekrarlanan Numarayı Bulma<a name="article-top"></a>
</h1>

<h3 align="center">Find the Duplicate Number</h3>

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
    <td>Linked List</td>
  </tr>
  <tr>
    <th style="font-weight: bold;">Zorluk Seviyesi</th>
    <td><img src="../0 İçerik Resources/Zorluk Seviyeleri/Normal.png" alt="Normal" height="20"/></td>
  </tr>
  <tr>
    <th style="font-weight: bold;">Eklenme Tarihi</th>
    <td>2 Aralık 2024</td>
  </tr>
    <tr>
    <th style="font-weight: bold;">Anahtar Kelime</th>
    <td>Tavşan-Kaplumbağa yöntemi - Floyd’un Döngü Algılama Algoritması (Floyd's Cycle Detection)</td>
  </tr>
</table>


![-----------------------------------------------------](../../Readme%20Resources/Line.png)

## Problem Açıklaması 

Bir tamsayı dizisi olan `nums` veriliyor. Bu dizi `[1, n]` aralığında değerler
içeren toplam `n + 1` tamsayıdan oluşuyor.

Dizide yalnızca bir tekrarlanan sayı var. Bu sayıyı bulun ve döndürün.

Bu problemi çözmek için diziyi değiştirmeden ve yalnızca
sabit ekstra alan kullanarak çözüm bulmalısınız.

![-----------------------------------------------------](../../Readme%20Resources/Line.png)

## Örnekler

- ### Örnek 1

  **Girdi:** `nums = [1,3,4,2,2]`

  **Çıktı:** `2`

- ### Örnek 2

  **Girdi:** `nums = [3,1,3,4,2]`

  **Çıktı:** `3`

- ### Örnek 3

  **Girdi:** `nums = [3,3,3,3,3]`

  **Çıktı:** `3`


![-----------------------------------------------------](../../Readme%20Resources/Line.png)

## Kısıtlar

- `1 <= n <= 10⁵`
- `nums.length == n + 1`
- `1 <= nums[i] <= n`
- Dizide yalnızca bir sayı birden fazla kez, diğer sayılar ise yalnızca bir kez görünür.


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
      <td><a href="./Kotlin - nkare.kt">Kotlin</a></td>
      <td align="center">O(n²)</td>
      <td align="center">O(1)</td>
      <td align="center">2 Aralık 2024</td>
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