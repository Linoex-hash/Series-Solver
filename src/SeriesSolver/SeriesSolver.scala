package SeriesSolver

object SeriesSolver {
  def printNthTerm(function: Int=>Double, nthterm: Int): Unit = {
    var retVal: Double = 0.0
    for(i <- 1 to nthterm){
      retVal += function(i)
    }
    println(retVal)
  }
  def GCD(a: Int, b: Int): Int = {
    println(a)
    println(b)
    println("\n")
    if(a==0 && b!=0){
      b
    }
    else if(b==0 && a!=0){
      a
    }
    else{
      val remainder: Int = Math.max(a,b)%Math.min(a,b)
      GCD(Math.min(a,b),remainder)
    }
  }

  def main(args: Array[String]): Unit = {
    print(GCD(270,192))
  }
}