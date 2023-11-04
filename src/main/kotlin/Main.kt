fun main() {
    for (i in 1..1000) {
        if (isPerfectNumber(i)) {
            println("$i is a perfect number")
        }
    }
}

fun isPerfectNumber(number: Int): Boolean {
    var sum = 0
    for (i in 1..number / 2) {
        if (number % i == 0) {
            sum += i
        }
    }
    return sum == number
}