package ru.netology

fun main() {
    println("Введите имя покупателя: ")
    val name = readln().toString()    // Ввод имени покупателя
    println("Введите сумму покупки: ")
    val amount = readln().toDouble()    // Ввод суммы покупки
    val array  = arrayOf("Anya", "Alex", "Kolya", "Sergey") // данные постоянных покупателей
    val found = array.contains(name)
    var discount : Double = 0.0
    var discount2 : Double

    if (amount < 1000) {
        discount = 0.0
    } else if (amount > 1001 && amount < 10000) {
        discount = 100.0
    } else if (amount > 10001) {
        discount = 0.05 * amount
    }

    if (found == true) {
        discount2 = 0.01 * amount
    } else {
        discount2 = 0.0
    }

    var result = discount + discount2

    println("Суммарная скидка: " + result + " рублей")
}



