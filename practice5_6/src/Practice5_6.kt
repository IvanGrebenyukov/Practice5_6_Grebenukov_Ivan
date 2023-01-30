fun main()
{
    /*Zadanie1()
    Zadanie2()
    Zadanie3()
    Zadanie4()
    Zadanie5()
    Zadanie6()*/
    Zadanie7()
}
fun Zadanie1()
{
    println("Задание 1")
    while(true)
    {
        try
        {
            print("Введите первое число: ")
            var first_number: Double = readLine()!!.toDouble()
            print("Введите второе число: ")
            var second_number: Double = readLine()!!.toDouble()
            if (first_number > second_number)
            {
                first_number += 1
                println(first_number)
            }
            else if (second_number > first_number)
            {
                second_number += 1
                println(second_number)
            }
            else {
                first_number = Math.pow(first_number, 3.0)
                println(first_number)
            }
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}

fun Zadanie2()
{
    println("Задание 2")
    while(true)
    {
        try
        {
            print("Введите число от 1 до 9: ")
            var first_number: Int  =  readLine()!!.toInt()
            while(first_number < 0 || first_number > 9)
            {
                print("Введите число от 1 до 9: ")
                first_number =  readLine()!!.toInt()
            }
            when (first_number)
            {
                1 -> println("Один")
                2 -> println("Два")
                3 -> println("Три")
                4 -> println("Четыре")
                5 -> println("Пять")
                6 -> println("Шесть")
                7 -> println("Семь")
                8 -> println("Восемь")
                9 -> println("Девять")

            }
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}
fun Zadanie3()
{
    println("Задание 3")
    while(true)
    {
        try
        {
            print("Введите возраст в диапазоне от 0 до 120: ")
            var age: Int  =  readLine()!!.toInt()
            while(age < 0 || age > 120)
            {
                print("Введите число в диапазоне от 0 до 120: ")
                age =  readLine()!!.toInt()
            }
            when(age)
            {
                in 0..2 -> println("Младенец")
                in 3..12 -> println("Ребенок")
                in 13..16 -> println("Подросток")
                in 17..20 -> println("Юноша")
                in 21..60 -> println("Взрослый")
                in 61..120 -> println("старый")

            }
            break
        }
        catch (e:Exception)
        {
            println("вы ввели не число")
        }
    }
}
// Индивидуальные задания
fun Zadanie4() // Вариант 4
{
    println("Задание 4")
    while(true)
    {
        try
        {
            print("Введите х: ")
            var x: Double = readLine()!!.toDouble()
            if(x<=7)
            {
                x = -3 * x + 9
                println("Ответ: " + x)
            }
            else if(x > 7)
            {
                x = 1 / (x -7)
                println("Ответ: " + x)
            }
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}
fun Zadanie5() //Вариант 4
{
    while(true)
    {
        try
        {
            print("Введите трехзначное число: ")
            var number: Int  =  readLine()!!.toInt()
            while(number < 100 || number > 999)
            {
                print("Введите трехзначное число: ")
                number =  readLine()!!.toInt()
            }
            if(number / 100 == number % 10)
            {
                println("Это палиндром!")
            }
            else
            {
                println("Это не палиндром!")
            }
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}
fun CheckingForAPositiveNumber(number: Double): Double //Функция проверки на положительное число
{
    while(number <= 0)
    {
        print("Введите число большее 0: ")
        var number: Double = readLine()!!.toDouble()
        if(number > 0)
        {
            return number
        }
    }
    return number

}
fun Zadanie6() //Вариант 4
{
    while(true)
    {
        try
        {
            println("Введите 1-ю сторону 1-го прямоугольника: ")
            var a: Double = readLine()!!.toDouble()
            a = CheckingForAPositiveNumber(a)
            println("Введите 2-ю сторону 1-го прямоугольника: ")
            var b: Double = readLine()!!.toDouble()
            b = CheckingForAPositiveNumber(b)
            println("Введите 1-ю сторону 2-го прямоугольника: ")
            var c: Double = readLine()!!.toDouble()
            c = CheckingForAPositiveNumber(c)
            println("Введите 2-ю сторону 2-го прямоугольника: ")
            var d: Double = readLine()!!.toDouble()
            d = CheckingForAPositiveNumber(d)
            if(((a < c) && (b < d)) || ((a < d) && (b < c)) || ((c < a) && (d < b)) || ((c < b) && (d < a)))
            {
                println("Один из конвертов можно вложить в другой")
            }
            else
            {
                println("Нельзя вложить один из конвертов в другой")
            }
            break
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}
fun Zadanie7() //Вариант 14 из самостоятельной №3(Угадай число!)
{
    println("Игра Угадай число!")
    while(true)
    {
        try
        {
            val rand_number: Int = (1..9).random()
            print("Введите число от 1 до 9: ")
            var number: Int = readLine()!!.toInt()
            if(number < 0 || number > 9)
            {
                print("Введите число от 1 до 9: ")
                number =  readLine()!!.toInt()
            }
            else
            {

                if(rand_number > number)
                {
                    println("Перебор")
                }
                else if(rand_number < number)
                {
                    println("Недобор")
                }
                else
                {
                    println("Вы угадали число!")

                }
            }
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
        }
    }
}