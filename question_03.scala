object question_03 extends App{

  def sum(n:Int):Int = n match{
    case n if (n>0)=> n+sum(n-1)
    case _ => n

  }


printf("%s %d\n","Sum of Numbers from 1 to 5 : ",sum(5))
printf("%s %d\n","Sum of Numbers from 1 to 20 : ",sum(20))

}
