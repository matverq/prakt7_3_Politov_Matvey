fun main()
{
    try
    {
        println("Введите сторону а: ");
        val a = readln().toDouble()
        println("Введите сторону b: ");
        val b = readln().toDouble()
        println("Введите сторону c: ");
        val c = readln().toDouble()
        if( a+b > c && c > b && b + c > a)
        {
            val p = (a+b+c)/ 2.0
            val area = Math.sqrt(p * (p-a) * (p-b) * (p-c))
            println("Площадь треугольника ${"%.2f".format(area)}")
        }
        else
        {
            println("Треугольника с такими сторонами не существует")
        }
    }
    catch(E: Exception)
    {
       println("Введено не число")
    }
}
