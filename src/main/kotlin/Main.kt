fun main() {
    (1..1000).filter { isPerfectNumber(it) }.forEach { println("$it is a perfect number") }
}

fun isPerfectNumber(number: Int): Boolean {
    return (1..number / 2).filter { number % it == 0 }.sum() == number
}