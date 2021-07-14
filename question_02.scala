object question_02 extends App{
  
  def gcd(x:Int,y:Int):Int = y match{
    case 0 => x
    case y if(y>x) => gcd(y,x)
    case _ => gcd(y,x%y)
  }

  def isprime(p:Int,n:Int=2):Boolean = n match{
    case x if(p==x) => true
    case x if(gcd(p,x)>1) => false
    case x => isprime(p,x+1)
  }


 def primeseq(p:Int,n:Int=2):Any={
   if(p>=n){
    if(isprime(n)) println(n)
    primeseq(p,n+1)

   }

 }

  primeseq(15)
}
