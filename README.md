## Kotlin Perfect Number 6️⃣ 🌼 👹

![Kotlin Perfect Number](https://miro.medium.com/v2/resize:fit:4800/format:webp/1*TsSJhwB-3SJ6Df2CV_E7bQ.jpeg)

A `perfect` number is a positive integer that is equal to the sum of its proper divisors (excluding itself). For example, `6` is a perfect number because its proper divisors (1, 2, 3) add up to 6.

Here’s an example `Kotlin` program that finds perfect numbers:
```kotlin
fun main() {
    for (i in 1..1000) {
        if (isPerfect(i)) {
            println("$i is a perfect number")
        }
    }
}

fun isPerfect(number: Int): Boolean {
    var sum = 0
    for (i in 1..number / 2) {
        if (number % i == 0) {
            sum += i
        }
    }
    return sum == number
}
```
In this program, we use a for loop to iterate through the numbers `1` to `1000`. For each number, we call the `isPerfect` function to determine if it's a perfect number. If isPerfect returns true, we print a message indicating that the number is a perfect number.

The `isPerfect` function takes an integer number as input and returns a boolean value indicating whether number is a perfect number or not. To determine this, we use another for loop to iterate through the possible divisors of number. If a divisor is found, we add it to the sum variable. Finally, we return `true` if sum is equal to number, and `false` otherwise.

Note that this program only finds perfect numbers up to `1000`. You can adjust the range in the for loop in main to find perfect numbers in a larger range.

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