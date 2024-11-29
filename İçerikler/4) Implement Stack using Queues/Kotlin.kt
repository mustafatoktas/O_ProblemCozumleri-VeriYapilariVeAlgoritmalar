class MyStack {
    private val kuyruk: MutableList<Int> = mutableListOf()

    fun push(x : Int) {
        kuyruk.add(x)
    }

    fun pop() : Int {
        val sonEleman = kuyruk[kuyruk.size-1]
        kuyruk.removeAt(kuyruk.size-1)

        return sonEleman
    }

    fun top() : Int {
        return kuyruk[kuyruk.size-1]
    }

    fun empty() : Boolean {
        return kuyruk.isEmpty()
    }

}


fun main() {
    val myStack = MyStack()
    myStack.push(1)   // Yığına 1 eklenir.
    myStack.push(2)   // Yığına 2 eklenir.

    println("Top: " + myStack.top().toString()) // Yığının tepesindeki eleman: 2
    println("Pop: " + myStack.pop().toString()) // Yığının tepesindeki eleman kaldırılır ve döner: 2
    println("Empty: " + myStack.empty())      // Yığının boş olup olmadığı kontrol edilir: false
}