fun main()
{
    try
    {
        println("Введите трехзначное число: ");
        val a = readln().toInt()

        if(a!= null && a in 100..999)
        {
            val d1 = a / 100
            val d2 = (a / 10) % 10
            val d3 = a % 10
            when
            {
                d1 < d2 && d2 < d3 -> println("цифры образуют возрастающую последовательность")
                d1> d2 && d2> d3 -> println("цифры образуют убывающую последовательность")
                else -> println("цифры не образуют последовательность")
            }
        }
        else
        {
            println("Введите трехзначное число")
        }
    }
    catch(E: Exception)
    {
        println("Введено не число")
    }
}
