## Kotlin Perfect Number 6️⃣ 🌼 👹

![Kotlin Perfect Number](https://miro.medium.com/v2/resize:fit:4800/format:webp/1*TsSJhwB-3SJ6Df2CV_E7bQ.jpeg)

A `perfect` number is a positive integer that is equal to the sum of its proper divisors (excluding itself). For example, `6` is a perfect number because its proper divisors (1, 2, 3) add up to 6.

Here’s an example `Kotlin` program that finds perfect numbers:
```kotlin
fun main() {
    (1..1000).filter { isPerfectNumber(it) }.forEach { println("$it is a perfect number") }
}

fun isPerfectNumber(number: Int): Boolean {
    return (1..number / 2).filter { number % it == 0 }.sum() == number
}
```
This code defines two functions: `main()` and `isPerfectNumber()`. The `main()` function is responsible for printing all perfect numbers from 1 to 1000. A perfect number is a positive integer that is equal to the sum of its positive divisors. For example, 6 is a perfect number because 1 + 2 + 3 + 6 = 12.

The `isPerfectNumber()` function takes an integer number as input and returns `true` if number is a perfect number, and `false` otherwise. The function calculates the sum of the divisors of number and checks if it is equal to number.

When we run the program, it will output all the `perfect` numbers up to the limit we set:

```kotlin
6 is a perfect number
28 is a perfect number
496 is a perfect number
```
## Donation 💸

If this project help 💁 you, Can you give me a cup of coffee? ☕

[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/halilozel1903)

## License ℹ️
```
MIT License

Copyright (c) 2023 Halil OZEL

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```