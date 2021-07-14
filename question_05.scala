
object question_05 extends App{

  def evensum(n:Int):Int = n match{
    case 0 => n  
    case n if(n%2==0)=> n+evensum(n-1)
    case n if(n%2==1)=>evensum(n-1)

  }

printf("%s %d\n","The sum of even Numbers up to 10 is : ",evensum(10))
printf("%s %d\n","The sum of even Numbers up to 9 is : ",evensum(9))
  
}
