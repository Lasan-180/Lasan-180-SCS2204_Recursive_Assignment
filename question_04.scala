object question_04 extends App{

  def iseven (n:Int):Boolean = n match{
    case 0 => true
    case _ => isodd(n-1)

  }

  def isodd(n:Int):Boolean = !(iseven(n))

  printf("%s %b\n","Is 5 is a Odd Number : ",isodd(5))
  printf("%s %b\n","Is 5 is a even Number : ",iseven(5))

}
