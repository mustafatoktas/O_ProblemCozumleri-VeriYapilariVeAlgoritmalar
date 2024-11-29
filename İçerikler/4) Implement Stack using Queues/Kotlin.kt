class MyStack {
    private val yigin: MutableList<Int> = mutableListOf()

    fun push(x : Int) {
        yigin.add(x)
    }

    fun pop() : Int {
        val sonEleman = yigin[yigin.size-1]
        yigin.removeAt(yigin.size-1)

        return sonEleman
    }

    fun top() : Int {
        return yigin[yigin.size-1]
    }

    fun empty() : Boolean {
        return yigin.isEmpty()
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