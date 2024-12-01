<h1 align="center">
Bağlı İki Listenin Kesişimi<a name="article-top"></a>
</h1>
<h3 align="center">Intersection of Two Linked Lists</h3>

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
    <td style="text-align: left;">Linked List</td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Zorluk Seviyesi</th>
    <td style="text-align: left;"> <img src="../0) İçerik Resources/Zorluk Seviyeleri/Kolay.png" alt="Kolay" height="20"/> </td>
  </tr>
  <tr>
    <th style="text-align: left; font-weight: bold;">Eklenme Tarihi</th>
    <td style="text-align: left;">1 Aralık 2024</td>
  </tr>
    <tr>
    <th style="text-align: left; font-weight: bold;">Anahtar Kelime</th>
    <td style="text-align: left;"></td>
  </tr>
</table>


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Problem Açıklaması 

İki bağlı listenin (linked-list) başlarını (`headA` ve `headB`) verilen bir fonksiyonda,
bu iki listenin kesiştiği düğümü döndürün. Eğer iki bağlı listenin kesişimi yoksa `null` döndürün.

**Örneğin:** Aşağıdaki bağlı iki liste c1 düğümünde kesişmeye başlıyor.

<img src="./Resources/statement.png" alt="Resim" height="200"/>

Test senaryoları, bağlı yapıların içinde herhangi bir döngü olmadığı garanti edilerek üretilir.

**Not:** Bağlı listeler, fonksiyon döndükten sonra özgün yapılarını korumalıdır.

**Özel Hakem (Custom Judge)**

Hakeme verilen girdiler şunlardır (programınıza bu girdiler doğrudan verilmez):

- `intersectVal`: Kesişimin olduğu düğümün değeri. Eğer bir kesişim yoksa bu değer `0` olur.
- `listA`: İlk bağlı listenin başı.
- `listB`: İkinci bağlı listenin başı.
- `skipA`: `listA` içinde kesişim düğümüne ulaşmak için baştan itibaren atlanacak düğüm sayısı.
- `skipB`: `listB` içinde kesişim düğümüne ulaşmak için baştan itibaren atlanacak düğüm sayısı.

Hakem, bu girdilere dayanarak bağlı yapıların tamamını oluşturacak ve programınıza yalnızca `headA` ve `headB`
başlarını verecek. Eğer doğru şekilde kesişim düğümünü döndürürseniz çözümünüz kabul edilecektir.

![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Örnekler

- ### Örnek 1

  <img src="./Resources/example_1.png" alt="Örnek 1 Resmi" height="200"/>

  **Girdi:** `intersectVal = 8` `listA = [4, 1, 8, 4, 5]` `listB = [5, 6, 1, 8, 4, 5]` `skipA = 2` `skipB = 3`

  **Çıktı:** `8` değerinde kesişim bulundu.

  **Açıklama:** 
  Kesişen düğümün değeri `8`dir (iki liste kesişiyorsa bu değer `0` olamaz).
  - `A` listesinin başından itibaren: `[4, 1, 8, 4, 5]`
  - `B` listesinin başından itibaren: `[5, 6, 1, 8, 4, 5]`
  - `A` listesindeki kesişen düğümden önce 2 düğüm, `B` listesindeki kesişen düğümden önce 3 düğüm vardır.

  **Not:** `A` ve `B` listelerindeki `1` değerine sahip düğümler farklı düğüm referanslarıdır (yani bellekte farklı konumlara işaret ederler). Ancak `8` değerine sahip düğümler aynı bellek adresine işaret eder, dolayısıyla kesişim bu düğümde gerçekleşir.


- ### Örnek 2

  <img src="./Resources/example_2.png" alt="Örnek 2 Resmi" height="200"/>

  **Girdi:** `intersectVal = 2` `listA = [1, 9, 1, 2, 4]` `listB = [3, 2, 4]` `skipA = 3` `skipB = 1`

  **Çıktı:** `2` değerinde kesişim bulundu.

  **Açıklama:** 
  Kesişen düğümün değeri `2`dir (iki liste kesişiyorsa bu değer `0` olamaz).
  - `A` listesinin başından itibaren: `[1, 9, 1, 2, 4]`
  - `B` listesinin başından itibaren: `[3, 2, 4]`
  - `A` listesindeki kesişen düğümden önce 3 düğüm, `B` listesindeki kesişen düğümden önce 1 düğüm vardır.

- ### Örnek 3

  <img src="./Resources/example_3.png" alt="Örnek 3 Resmi" height="200"/>

  **Girdi:** `intersectVal = 0` `listA = [2,6,4]` `listB = [1,5]` `skipA = 3` `skipB = 2`

  **Çıktı:** Kesişim yok.

  **Açıklama:** 
  A'nın başından itibaren liste `[2,6,4]` olarak okunur. B'nin başından itibaren liste `[1,5]` olarak okunur.
  İki liste kesişmediği için `intersectVal` 0 olmalıdır ve `skipA` ile `skipB` rastgele değerler olabilir.
  - İki liste kesişmediği için sonuç `null` döndürülür.


![-----------------------------------------------------](../../Readme%20Resources/Çizgi.png)

## Kısıtlar

- `listA`'nın düğüm sayısı `m` içindedir.
- `listB`'nin düğüm sayısı `n` içindedir.
- `1 <= m, n <= 3 * 10⁴`
- `1 <= Node.val <= 10⁵`
- `0 <= skipA <= m`
- `0 <= skipB <= n`
- Eğer `listA` ve `listB` kesişmiyorsa `intersectVal` 0'dır.
- Eğer `listA` ve `listB` kesişiyorsa `intersectVal = listA[skipA] == listB[skipB]`


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
      <td align="center">O(m + n)</td>
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