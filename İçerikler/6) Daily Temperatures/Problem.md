<h1 align="center">
Günlük Sıcaklıklar<a name="article-top"></a>
</h1>
<h3 align="center">Daily Temperatures</h3>

## İçindekiler

- [Problem Açıklaması](#problem-açıklaması)
- [Örnekler](#örnekler)
- [Kısıtlar](#kısıtlar)
- [Çözüm](#çözüm)

<br>

<table>
  <tr>
    <th style="text-align: left; font-weight: bold;">Kaynak</th>
    <td style="text-align: left;">LeetCode</td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Kategori</th>
    <td style="text-align: left;">Stack & Queue</td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Zorluk Seviyesi</th>
    <td style="text-align: left;"> <img src="../0) İçerik Resources/Zorluk Seviyeleri/Normal.png" alt="Normal" height="20"/> </td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Eklenme Tarihi</th>
    <td style="text-align: left;">29 Kasım 2024</td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Anahtar Kelime</th>
    <td style="text-align: left;"></td>
  </tr>
</table>


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Problem Açıklaması 

Bir tamsayı dizisi olan `temperatures`, günlük sıcaklıkları temsil eder.
Her bir gün için daha sıcak bir güne kadar beklemeniz gereken gün sayısını belirten bir dizi
`answer` döndürün. Eğer gelecekte böyle bir gün yoksa o gün için `answer[i] = 0` olarak bırakın.


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Örnekler

- ### Örnek 1

  **Girdi:** `temperatures = [73, 74, 75, 71, 69, 72, 76, 73]`

  **Çıktı:** `[1, 1, 4, 2, 1, 1, 0, 0]`

  **Açıklama:** 
  - İlk gün sıcaklık 73 ve bir sonraki daha sıcak gün (74) için **1 gün beklenir.**
  - İkinci gün sıcaklık 74 ve bir sonraki daha sıcak gün (75) için **1 gün beklenir.**
  - Üçüncü gün sıcaklık 75 ve bir sonraki daha sıcak gün (76) için **4 gün beklenir.**
  - Diğer günler için aynı hesap yapılır.

- ### Örnek 2

  **Girdi:** `temperatures = [30, 40, 50, 60]`

  **Çıktı:** `[1, 1, 1, 0]`

  **Açıklama:** 
  - Her bir gün için bir sonraki gün sıcaklık artar. Son gün ise daha sıcak bir gün olmadığı için **0** döner.

- ### Örnek 3

  **Girdi:** `temperatures = [30, 60, 90]`

  **Çıktı:** `[1, 1, 0]`

  **Açıklama:** 
  - Son gün için daha sıcak bir gün olmadığından **0** döner.


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Kısıtlar

- `1 <= temperatures.length <= 10⁵`
- `30 <= temperatures[i] <= 100`


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

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
      <td> <a href="./Kotlin.kt" target="_blank">Kotlin</a> </td>
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
  <a href="https://buymeacoffee.com/mustafatoktas" target="_blank"> <img src="../../Readme Resources/İletişim/Buy Me a Coffee.png" alt="Buy Me a Coffee" height="64"/> </a>
</div>

<br>


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## İletişim

<a href="mailto:info@mustafatoktas.com"              target="_blank"> <img src="../../Readme Resources/İletişim/Mail.png"     alt="Mail"     width="64"/> </a>
<a href="https://t.me/mustafatoktas00"               target="_blank"> <img src="../../Readme Resources/İletişim/Telegram.png" alt="Telegram" width="64"/> </a>
<a href="https://www.linkedin.com/in/mustafatoktas/" target="_blank"> <img src="../../Readme Resources/İletişim/LinkedIn.png" alt="LinkedIn" width="64"/> </a>

<p align="center">
  <a href="#article-top"> <img src="../../Readme Resources/Back to Top.png" alt="Back to Top" height="64"/> </a>
</p>