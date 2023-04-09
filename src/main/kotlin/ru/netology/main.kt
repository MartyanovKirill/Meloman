package ru.netology

fun main() {
    println("Введите имя покупателя: ")
    val name = readln().toString()    // Ввод имени покупателя
    println("Введите сумму покупки: ")
    val amount = readln().toDouble()    // Ввод суммы покупки
    val array  = arrayOf("Anya", "Alex", "Kolya", "Sergey") // список постоянных покупателей
    val found = array.contains(name)    // Переменная контроля нахождения пользователя в списке
    var discount : Double = 0.0                 // Переменная для значения скидки
    var discount2 : Double                      // Переменная для скидки постоянным покупателям

    // Расчет скидки по сумме покупки
    if (amount < 1000) {
        discount = 0.0
    } else if (amount > 1001 && amount < 10000) {
        discount = 100.0
    } else if (amount > 10001) {
        discount = 0.05 * amount
    }

    // Проверка наличия в списке постоянных покупателей
    if (found == true) {
        discount2 = 0.01 * (amount - discount)
    } else {
        discount2 = 0.0
    }

    var result = discount + discount2

    println("Суммарная скидка: " + result + " рублей")
}



