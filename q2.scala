object q2 {
  def main(args: Array[String]): Unit = {
    val t=11
    for(i<-2 to t)
      {
        if(prime(i)!=0)
        {
          print(prime(i)+" , ")
        }
      }

  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if (x > a) => GCD(x, a)
    case x => GCD(x, a % x)
  }

  def prime(p: Int, n: Int = 2): Int = n match {
    case x if (x == p) => p
    case x if (GCD(p, x) > 1) =>0
    case x => prime(p, x + 1)
  }
}
