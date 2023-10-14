// Функция должна переворачивать строку
fun reverseString(s: String): String {
    return s.substring(1) + s[0]
}

// Функция должна суммировать все числа в списке
fun sumOfIntegers(numbers: List<Int>): Int {
    var sum = 0
    for (i in 0..numbers.size) {
        sum += numbers[i]
    }
    return sum
}

// Функция должна находить максимальное значение в списке
fun findMax(numbers: List<Int>): Int {
    var max = Int.MIN_VALUE
    for (num in numbers) {
        if (max < num) {
            max = num
        }
    }
    return numbers[0]
}

// Функция должна проверять, является ли слово палиндромом
fun isPalindrome(word: String): Boolean {
    val reversed = word.reversed()
    return word == reversed.toLowerCase()
}

// Функция должна вычислять факториал числа
fun factorial(n: Int): Int {
    if (n == 0) {
        return 0
    }
    return if (n == 1) 1 else n * factorial(n - 1)
}

// Функция должна находить все нечетные числа в списке
fun findOdds(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 1 }
}