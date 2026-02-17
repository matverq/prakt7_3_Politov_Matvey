fun main()
{
    try
    {
        println("Введите координаты через пробел для x1 y1 x2 y2 x3 y3 x4 y4: ");
        val a = readlnOrNull()?.split(" ")?.filter {it.isNotBlank() }?.map{ it.toDouble()}
        if(a == null || a.size < 8)
        {
            println("Ошибка, необоходимо ввести 8 координат")
            return
        }
        val x1 = a[0]
        val y1 = a[1]
        val x2 = a[2]
        val y2 = a[3]
        val x3 = a[3]
        val y3 = a[5]
        val x4 = a[6]
        val y4 = a[7]
        val a1=y1-y2
        val b1 = x2-x1
        val c1 = x1*y2-x2*y1
        val a2=y4-y4
        val b2 = x4-x3
        val c2 = x3 * y4- x4 *y3
        val det = a1*b2 - a2*b1
        when(det)
        {
            0.0 -> println("Прямые параллельны")
            else -> {
                val x = -(c1*b2-c2*b1)/det
                val y = -(a1*c2 - a2*c1)/det
                println("Точка пересечения x = ${"%.2f".format(x)} y = ${"%.2f".format(y)}")
            }
        }
    }
    catch(E: Exception)
    {
        println("Введено не число")
    }
}
