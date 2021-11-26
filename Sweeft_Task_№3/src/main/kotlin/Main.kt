//3.მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან.
// დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს,
// რომელიც 0-ზე მეტია და ამ მასივში არ შედის.


val num = arrayListOf(
    -54, 21, 0, 1, 14, 54, 342,
    35, -2, -54, -58
)

fun main() {
    minNumOutOfTheBounds()
}

fun minNumOutOfTheBounds() {
    val compareNum = ArrayList<Int>()
    val checkingNumber = checkNum(num)

    for (i in 1 until checkingNumber ) {
        if (!num.contains(i)) {
            compareNum.add(i)
            println(i)
            break
        }
    }

    if (compareNum.isEmpty()) {
        for (i in 1 until Int.MAX_VALUE) {
            if (!num.contains(i)) {
                compareNum.add(i)
                println(i)
                break
            }
        }
    }
}

fun checkNum(num: List<Int>) :Int {

    val newNum = arrayListOf<Int>()
    var one= 0
    var two = 0

    num.forEach {
        if (it > 0) {
            newNum.add(it)
        }
    }

    for (i in newNum) {
        if (newNum[one] > i) {
            two = i
            one = newNum.indexOf(i)
        } else {
            two = newNum[one]
        }
    }
    return two
}