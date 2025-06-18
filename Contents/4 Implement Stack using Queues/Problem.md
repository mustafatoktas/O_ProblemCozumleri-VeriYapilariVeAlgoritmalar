<h1 align="center">
Kuyruk (Queue) Kullanarak Yığın (Stack) Uygulaması<a name="problem-top"></a>
</h1>

<h3 align="center">Implement Stack using Queues</h3>

## İçindekiler

- [Problem Açıklaması](#problem-açıklaması)
- [Örnek](#örnek)
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
    <td>Stack & Queue</td>
  </tr>
  <tr>
    <th>Zorluk Seviyesi</th>
    <td><img src="../0 Content Resources/Zorluk Seviyeleri/Kolay.png" alt="Kolay" height="20"/></td>
  </tr>
  <tr>
    <th>Eklenme Tarihi</th>
    <td>29 Kasım 2024</td>
  </tr>
  <tr>
    <th>Anahtar Kelime</th>
    <td></td>
  </tr>
</table>


![—————————————————————————————————————————————————](../../Readme%20Resources/Line.png)

## Problem Açıklaması 

Bu problemde kuyruk kullanarak bir son giren ilk çıkar `LIFO` yığınını (stack) uygulamanız isteniyor.
Uygulanan yığın, bir yığının normalde desteklediği tüm işlemleri desteklemelidir: `push` `top` `pop` `empty`

`MyStack` sınıfını oluşturmanız gerekiyor:

1. `void push(int x)`

   Eleman `x`'i yığının en üstüne ekler.

2. `int pop()`

   Yığının en üstündeki elemanı kaldırır ve geri döner.

3. `int top()`

   Yığının en üstündeki elemanı döner (ancak kaldırmaz).

4. `boolean empty()` 

   Yığın boşsa `true` doluysa `false` döner.

### Notlar

- Sadece bir kuyruğun standart işlemlerini kullanabilirsiniz. Yani şu işlemleri kullanabilirsiniz:
  - Kuyruğa eleman eklemek **(push to back)**
  - Kuyruğun önünden eleman almak **(peek/pop from front)**
  - Kuyruğun boyutunu öğrenmek **(size)**
  - Kuyruğun boş olup olmadığını kontrol etmek **(is empty)**

- Kullanılan dilde doğrudan kuyruk desteği yoksa kuyruk işlemlerini bir liste veya çift yönlü
  kuyruk (deque) kullanarak simüle edebilirsiniz. Ancak yine de sadece kuyruğun standart işlemlerini kullanmanız gerekiyor.


![—————————————————————————————————————————————————](../../Readme%20Resources/Line.png)

## Örnek

**Girdi:**
```
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
```

**Çıktı:** `[null, null, null, 2, 2, false]`

**Açıklama:** 
```
MyStack myStack = new MyStack();  // Yığın oluşturulur.
myStack.push(1);   // Yığına 1 eklenir.
myStack.push(2);   // Yığına 2 eklenir.
myStack.top();     // Yığının tepesindeki eleman: 2
myStack.pop();     // Yığının tepesindeki eleman kaldırılır ve döner: 2
myStack.empty();   // Yığının boş olup olmadığı kontrol edilir: false
```


![—————————————————————————————————————————————————](../../Readme%20Resources/Line.png)

## Kısıtlar

- `1 <= x <= 9`

- `push` `pop` `top` `empty` işlemleri toplamda en fazla 100 kez çağrılabilir.

- Tüm `pop` ve `top` işlemleri geçerli çağrılar olacaktır.


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
      <td align="center">O(1)</td>
      <td align="center">O(1)</td>
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
