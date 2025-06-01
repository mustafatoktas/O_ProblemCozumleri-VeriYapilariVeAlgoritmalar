class Solution {
    fun filterGmailAddresses(emailList: List<String>): List<String> {
        return emailList.filter {
            it.endsWith("@gmail.com")
        }
    }
}


fun main() {
    val emailList1 = listOf("kimberley@yahoo.com", "john_3@gmail.com", "alan.turing@outlook.com", "melissa@gmail.com", "mike+gmail@gmx.net")
    val emailList2 = listOf("test1@gmail.com", "test2@gmail.com", "user@yahoo.com", "admin@outlook.com", "info@gmail.com")
    val emailList3 = listOf("example1@company.com", "example2@company.com", "no_gmail@gmail.com", "yes@gmail.com", "another@gmail.com")

    println(Solution().filterGmailAddresses(emailList1))
    println(Solution().filterGmailAddresses(emailList2))
    println(Solution().filterGmailAddresses(emailList3))
}