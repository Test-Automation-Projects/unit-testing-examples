// Функция проверяет, является ли число четным
fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    } else {
        return false
    }
}

// Функция выводит обратный отсчет от заданного числа до 0
fun countdown(start: Int) {
    repeat(start) {
        println(start - it)
    }
}

// Функция возведения числа в степень
fun power(base: Int, exponent: Int): Int {
    var result = base
    var count = 1
    while (count < exponent) {
        result *= base
        count++
    }
    return result
}

// Функция ищет положительные числа в списке
fun findPositives(numbers: List<Int>): List<Int> {
    val positives = mutableListOf<Int>()
    for (number in numbers) {
        if (number >= 0) {
            positives.add(number)
        }
    }
    return positives
}