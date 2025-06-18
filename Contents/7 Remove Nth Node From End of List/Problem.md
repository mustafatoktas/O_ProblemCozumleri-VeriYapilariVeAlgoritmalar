<h1 align="center">
Listenin Sonundan n'inci Düğümü Kaldır<a name="problem-top"></a>
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
    <th>Kaynak</th>
    <td>LeetCode</td>
  </tr>
  <tr>
    <th>Kategori</th>
    <td>Linked List</td>
  </tr>
  <tr>
    <th>Zorluk Seviyesi</th>
    <td><img src="../0 Content Resources/Zorluk Seviyeleri/Normal.png" alt="Normal" height="20"/></td>
  </tr>
  <tr>
    <th>Eklenme Tarihi</th>
    <td>1 Aralık 2024</td>
  </tr>
  <tr>
    <th>Anahtar Kelime</th>
    <td></td>
  </tr>
</table>


![—————————————————————————————————————————————————](../../Readme%20Resources/Line.png)

## Problem Açıklaması 

Bir bağlantılı listenin başı `(head)` verildiğinde listenin sonundan itibaren **n'inci düğümünü**
kaldırın ve güncellenmiş bağlantılı listenin başını döndürün.


![—————————————————————————————————————————————————](../../Readme%20Resources/Line.png)

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


![—————————————————————————————————————————————————](../../Readme%20Resources/Line.png)

## Kısıtlar

- Listedeki düğüm sayısı `sz` ile belirtilmiştir.
- `1 <= sz <= 30`
- `0 <= Node.val <= 100`
- `1 <= n <= sz`


![—————————————————————————————————————————————————](../../Readme%20Resources/Line.png)

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
      <td align="center">O(1)</td>
      <td align="center">1 Aralık 2024</td>
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
  <a href="https://buymeacoffee.com/mustafatoktas"><img src="../../Readme Resources/Contact/Buy Me a Coffee.png" alt="Buy Me a Coffee" height="64"/></a>
</div>

<br>


![—————————————————————————————————————————————————](../../Readme%20Resources/Line.png)

## İletişim

<a href="mailto:info@mustafatoktas.com"             ><img src="../../Readme Resources/Contact/Mail.png"     alt="Mail"     width="64"/></a>
<a href="https://t.me/mustafatoktas00"              ><img src="../../Readme Resources/Contact/Telegram.png" alt="Telegram" width="64"/></a>
<a href="https://www.linkedin.com/in/mustafatoktas/"><img src="../../Readme Resources/Contact/LinkedIn.png" alt="LinkedIn" width="64"/></a>

<div align="center">
  <a href="#problem-top"><img src="../../Readme Resources/Back to Top.png" alt="Back to Top" height="64"/></a>
</div>
