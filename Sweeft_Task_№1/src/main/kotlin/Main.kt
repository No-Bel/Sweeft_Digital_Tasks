// 1.დაწერეთ ფუნქცია, რომელსაც გადაეცემა ტექსტი  და აბრუნებს პალინდრომია თუ არა.
// (პალინდრომი არის ტექსტი რომელიც ერთნაირად იკითხება ორივე მხრიდან).
//  Boolean isPalindrome(String text);

import java.util.*
fun isPalindromeStr(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)

    val reverseStr = sb.reverse().toString()

    return inputStr.equals(reverseStr,ignoreCase = true)
}
fun main() {

    val sc = Scanner(System.`in`)

    println("Enter String : ")

    val inString: String = sc.nextLine()

    if (isPalindromeStr(inString)){
        println("$inString is a Palindrome")
    } else {
        println("$inString is not Palindrome")
    }

}