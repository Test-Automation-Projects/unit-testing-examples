// Функция находит n-е число Фибоначчи
fun nthFibonacci(n: Int): Int {
    if (n <= 1) return n
    var a = 0
    var b = 1
    var count = 1
    while (count < n) {
        val temp = a
        a = b
        b += temp
        count++
    }
    return b
}

// Функция находит самое длинное слово в списке
fun findLongestWord(words: List<String>): String {
    var longestWord = ""
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }
    return longestWord
}

// Функция удваивает каждое число в списке
fun doubleNumbers(numbers: List<Int>): List<Int> {
    val doubledNumbers = mutableListOf<Int>()
    for (number in numbers) {
        doubledNumbers.add(number * 3) // Intentional bug: multiplying by 3 instead of 2
    }
    return doubledNumbers
}

// Функция проверяет, есть ли слово в строке
fun wordExistsInString(word: String, str: String): Boolean {
    return str.contains(word)
}

// Функция суммирует числа в списке до первого отрицательного числа
fun sumUntilNegative(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number < 0) {
            break
        }
        sum += number
    }
    return sum
}

// Функция подсчитывает, сколько раз определенное число появляется в списке
fun countOccurrences(target: Int, numbers: List<Int>): Int {
    var count = 0
    repeat(numbers.size) {
        if (numbers[it] == target) {
            count++
        }
    }
    return count
}


