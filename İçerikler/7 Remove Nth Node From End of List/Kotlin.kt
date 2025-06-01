class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun createLinkedList(values: IntArray): ListNode? {
    if (values.isEmpty()) return null

    val head = ListNode(values[0])
    var current = head
    for (i in 1 until values.size) {
        current.next = ListNode(values[i])
        current = current.next!!
    }
    return head
}

fun printLinkedList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.value} -> ")
        current = current.next
    }
    println("null") // Listenin sonunu belirtir
}

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy = ListNode(0) // sanal bir düğüm oluştur
        dummy.next = head // sanal düğümü listenin başına bağla
        var solPointer: ListNode? = dummy
        var sagPointer: ListNode? = dummy

        // sağ pointer'ı n + 1 adım ileri al, böylece aralarında n mesafe oluşur
        //başına sanal düğüm bağladığımız için n + 1 kadar ileri alıyoruz
        for (i in 0..n) {
            sagPointer = sagPointer?.next
        }

        // sağ pointer listenin sonuna ulaşana kadar her iki pointer'ı ilerlet
        while (sagPointer != null) {
            solPointer = solPointer?.next
            sagPointer = sagPointer.next
        }

        // sol pointer'ın bir sonraki düğümünü atla (hedef düğümü kaldır)
        solPointer?.next = solPointer?.next?.next

        return dummy.next // yeni baş düğümü döndür
    }
}


fun main() {
    val head1 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
    val n1 = 2
    val head2 = createLinkedList(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    val n2 = 4
    val head3 = createLinkedList(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    val n3 = 5

    // Sonucu yazdır
    printLinkedList(Solution().removeNthFromEnd(head1, n1))
    printLinkedList(Solution().removeNthFromEnd(head2, n2))
    printLinkedList(Solution().removeNthFromEnd(head3, n3))
}