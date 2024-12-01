<h1 align="center">
Listenin Sonundan n'inci Düğümü Kaldır<a name="article-top"></a>
</h1>
<h3 align="center">Remove Nth Node From End of List</h3>

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
    <th style="text-align: left; font-weight: bold;">Zorluk Seviyesi</th>
    <td style="text-align: left;"> <img src="../0) İçerik Resources/Zorluk Seviyeleri/Normal.png" alt="Normal" height="20"/> </td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Çözüm Dili</th>
    <td style="text-align: left;">Kotlin</td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Eklenme Tarihi</th>
    <td style="text-align: left;">1 Aralık 2024</td>
  </tr>
</table>


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Problem Açıklaması 

Bir bağlantılı listenin başı `(head)` verildiğinde listenin sonundan itibaren **n'inci düğümünü**
kaldırın ve güncellenmiş bağlantılı listenin başını döndürün.


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Örnekler

- ### Örnek 1

  <img src="./Resources/remove_ex1.jpg" alt="Bağlantılı Liste Görseli" height="200"/>

  **Girdi:** `head = [1,2,3,4,5]`, `n = 2`

  **Çıktı:** `[1,2,3,5]`

  **Açıklama:** 
  Listenin sonundan itibaren 2. düğüm `4`'tür. Bu düğüm kaldırıldığında listenin yeni hali `[1,2,3,5]` olur.


- ### Örnek 2

  **Girdi:** `head = [1]`, `n = 1`

  **Çıktı:** `[]`

  **Açıklama:** 
  Listenin tek elemanı olan `1` düğümü kaldırıldığında liste boş kalır.

- ### Örnek 3

  **Girdi:** `head = [1,2]`, `n = 1`

  **Çıktı:** `[1]`

  **Açıklama:** 
  Listenin sonundan itibaren 1. düğüm `2`'dir. Bu düğüm kaldırıldığında liste `[1]` olur.


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Kısıtlar

- Listedeki düğüm sayısı `sz` ile belirtilmiştir.
- `1 <= sz <= 30`
- `0 <= Node.val <= 100`
- `1 <= n <= sz`


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Çözüm

<table>
  <thead>
    <tr>
      <th>Çözüm Dili</th>
      <th>Çözüm</th>
      <th>Zaman Karmaşıklığı</th>
      <th>Yer Karmaşıklığı</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Kotlin</td>
      <td align="center"> <a href="./Kotlin.kt" target="_blank"> <img src="../0) İçerik Resources/Link.png" alt="Kotlin Çözümü" width="30"/> </a> </td>
      <td align="center">O(n)</td>
      <td align="center">O(1)</td>
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