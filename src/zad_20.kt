fun main()
{
    try
    {
        println("Выберите график (а, б, в, г): ");
        val a = readln().lowercase()
        println("Введите значение x: ")
        val x = readln().toDouble()
        val y = when(a)
        {
            "а" -> when {
                x in 1.0..1.0 -> Math.sqrt(1-x*x)
                x > 1 && x <=2 -> x-1
                else -> null
            }
            "б" -> when {
                x in -1.0..0.0 -> x+1
                x > 0 && x <=3 -> 1.0
                x > 3 && x <= 4 -> -x+4
                else -> null
            }
            "в" -> when {
                x in -1.0..0.0 -> x+1
                x > 0 && x <=1 -> -x+1
                x > 1 && x <= 3 -> 0.5 * x - 0.5
                x > 3 -> 1.0
                else -> null
            }
            "г" -> when {
                x in -1.0..0.0 -> Math.sqrt(1-x*x)
                x > 0 && x <=2 -> 1.0
                x > 2 -> x-1
                else -> null
            }
            else -> {
                println("Неверный вариант")
                return
            }
        }
        if(y != null) {
            println("Для графика $a при х = $x, y = ${"%.3f".format((y))}")
        }
        else {
            println("Значение x = $x находится вне области определения графика $a")
        }
    }
    catch(E: Exception)
    {
        println("Введено не число")
    }
}
