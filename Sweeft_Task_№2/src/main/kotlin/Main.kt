//2. გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია,
// რომელსაც გადაეცემა თანხა (თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას,
// რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
// Int minSplit(Int amount);

fun main() {
    var sum = 1032
    var monets = 0
    var cvladi = 50
    var boolean = true

    while (boolean) {
        if (sum - cvladi >= 0) {
            sum -= cvladi
            monets++
        }
        if (sum - 50 < 0 ) {
            cvladi = 20
        }

        if (sum - 20 < 0 ) {
            cvladi = 10
        }

        if (sum - 10 < 0 ) {
            cvladi = 5
        }

        if (sum - 5 < 0 ) {
            cvladi = 1
        }

        if (sum == 0) {
            boolean = false
        }
    }

    println(monets)
    println(sum)
}