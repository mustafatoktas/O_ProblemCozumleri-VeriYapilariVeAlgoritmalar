<h1 align="center">
Tek Sayı<a name="article-top"></a>
</h1>
<h3 align="center">Single Number</h3>

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
    <td style="text-align: left;"> <img src="../0) İçerik Resources/Zorluk Seviyeleri/Kolay.png" alt="Kolay" height="20"/> </td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Çözüm Dili</th>
    <td style="text-align: left;">Kotlin, C#</td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Eklenme Tarihi</th>
    <td style="text-align: left;">2 kasım 2024</td>
  </tr>
</table>


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Problem Açıklaması 

Boş olmayan bir `nums` tamsayı dizisi veriliyor. Dizideki her eleman iki kez yer alırken yalnızca bir eleman tek başına bulunuyor. Bu tek elemanı bulun.

Bu çözümü yalnızca sabit bir ekstra alan kullanarak ve doğrusal bir çalışma süresi karmaşıklığında (O(n)) olacak şekilde gerçekleştirmeniz gerekiyor.


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Örnekler

- ### Örnek 1

**Girdi:** `nums = [2,2,1]`

**Çıktı:** `1`

- ### Örnek 2

**Girdi:** `nums = [4,1,2,1,2]`

**Çıktı:** `4`

- ### Örnek 3

**Girdi:** `nums = [1]`

**Çıktı:** `1`


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Kısıtlar

`1 <= nums.length <= 30.000`

`-30.000 <= nums[i] <= 30.000`

- Dizideki her eleman iki kez geçerken yalnızca bir eleman bir kez geçer.


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
    <tr>
      <td>C#</td>
      <td align="center"> <a href="./CSharp.cs" target="_blank"> <img src="../0) İçerik Resources/Link.png" alt="C# Çözümü" width="30"/> </a> </td>
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