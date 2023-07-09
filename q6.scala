object q6 {
  def main(args: Array[String]): Unit ={
    val x = 5
    for(i<-0 to x)
      {
        print(fibonacci(i)+", ")
      }
  }

  def fibonacci(n:Int):Int =
    {
      if(n==0)
        {
          return 0
        }
      else if(n==1)
        {
          return 1
        }
      else
        {
          return (fibonacci(n-1)+fibonacci(n-2))
        }
    }

}
