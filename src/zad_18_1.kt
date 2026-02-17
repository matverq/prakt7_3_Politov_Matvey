fun main()
{
    try
    {
        println("Введите сторону равностороннего треугольника: ");
        val a = readln().toDouble()



        if(a!= null && a >0)
        {
            val sqrt3 = Math.sqrt(3.0)
            val area = (sqrt3/4) * a * a
            val radout = (sqrt3 / 3) * a
            val radin = (sqrt3/6) * a
            println("Площадь треугольника ${"%.2f".format(area)}")
            println("радиус вписанной окружности ${"%.2f".format(radout)}")
            println("радиус описанной окружности ${"%.2f".format(radin)}")
        }
        else
        {
            println("Введите положительное число")
        }
    }
    catch(E: Exception)
    {
        println("Введено не число")
    }
}
