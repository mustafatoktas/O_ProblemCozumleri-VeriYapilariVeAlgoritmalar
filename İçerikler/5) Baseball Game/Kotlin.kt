class Solution {
    private val yigin : MutableList<Int> = mutableListOf()

    fun calPoints(operations: Array<String>): Int {

        for (ops in operations) {
            when(ops) {
                "C" -> {
                    yigin.removeAt(yigin.size - 1)
                }
                "D" -> {
                    val yeniSkor = yigin[yigin.size - 1] * 2
                    yigin.add(yeniSkor)
                }
                "+" -> {
                    val yeniSkor = yigin[yigin.size - 1] + yigin[yigin.size - 2]
                    yigin.add(yeniSkor)
                }
                else -> yigin.add(ops.toInt())
            }
        }
        var toplam = 0
        for (i in yigin){
            toplam += i
        }
        return toplam
    }
}


fun main() {
    val ops : Array<String> = arrayOf("5","2","C","D","+")
    val ops2 : Array<String> = arrayOf("5","-2","4","C","D","9","+","+")
    val ops3 : Array<String> = arrayOf("1","C")
    println(Solution().calPoints(ops))
    println(Solution().calPoints(ops2))
    println(Solution().calPoints(ops3))
}