object q3 {
  def main(args: Array[String]): Unit = {
    print(sum(6))
  }

  def sum(n:Int):Int =
    {
      if(n==0)
        {
          return 0
        }
      else
        {
          return n+sum(n-1)
        }
    }
}
