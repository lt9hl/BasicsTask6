import java.awt.List

/*Задача 6.
Создать приложение, в котором пользователь вводит две различных цифры.
На выходе приложение выдает, если это возможно, из введенных цифр,
нечетное число. Результат выводится в консоль. При невозможности создать
нечетное число выводится сообщение – «Создать нечетное число невозможно».
Каждое число вводится на отдельной строке
 */
fun main(){
println("Введите две различные цифры")
    try {
        var l:MutableList<Int> = mutableListOf(readln().toInt(), readln().toInt())
        if (l[0] % 10 < 0 || l[1] % 10 < 0 ){
            val num = l[0]*10 + l[1]
            if (num % 2 ==1) println("Нечетное число: ${num}")
            else println("Создать нечетное число невозможно")
        }
        else println("Введено число")
    }
    catch (e: Exception) {
        println("Ошибка")
    }


}