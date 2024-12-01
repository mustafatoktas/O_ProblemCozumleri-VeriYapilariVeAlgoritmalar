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

// iki listeyi kesiştirmek için yardımcı fonksiyon
// intersectLinkedLists fonksiyonunu kullanmamızın sebebi, iki bağlantılı listenin gerçek anlamda fiziksel olarak kesişmesini sağlamak.
// Çünkü iki liste arasında kesişim olması, sadece aynı değere sahip düğümler bulunması anlamına gelmez;
// düğümlerin aynı bellek adresini paylaşmaları, yani aynı referans üzerinden birleştirilmiş olmaları gerekir.
fun intersectLinkedLists(listA: ListNode?, listB: ListNode?, intersectAt: Int): Pair<ListNode?, ListNode?> {
    var currentA = listA
    var currentB = listB
    var intersectNode: ListNode? = null

    // List A içinde kesişim düğümünü bul
    while (currentA != null) {
        if (currentA.value == intersectAt) {
            intersectNode = currentA
            break
        }
        currentA = currentA.next
    }

    // List B'nin sonunu kesişim düğümüne bağla
    if (intersectNode != null) {
        while (currentB?.next != null) {
            currentB = currentB.next
        }
        currentB?.next = intersectNode
    }

    return Pair(listA, listB)
}

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var firstPointer = headA
        var secondPointer = headB

        while (firstPointer != secondPointer) {
            firstPointer = if (firstPointer != null) firstPointer.next else headB
            secondPointer = if (secondPointer != null) secondPointer.next else headA
        }

        return firstPointer
    }
}

fun main() {
    val headA1 = createLinkedList(intArrayOf(4, 1, 8, 4, 5))
    val headB1 = createLinkedList(intArrayOf(5, 6, 1, 8, 4, 5))
    val (yeniHeadA1, yeniHeadB1) = intersectLinkedLists(headA1, headB1, 8)

    val solution = Solution()
    println("${solution.getIntersectionNode(yeniHeadA1, yeniHeadB1)?.value} " + "değerinde kesişim bulundu.")
}