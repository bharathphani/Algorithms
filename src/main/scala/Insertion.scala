object Insertion {
  def main(args: Array[String]): Unit = {
    val ip = Array(5, 1, 3, 6, 2, 8, 4)
    var temp = 0
    var j = 0
    var i=0
    var k=0
    for(j <- 1 to ip.length-1)
    {
       i=j-1
       k=j
        while(i>=0 && ip(k)<ip(i))
        {

          temp=ip(k)
          ip(k)=ip(i)
          ip(i)=temp
          i=i-1
          k=k-1

        }
        println(j+"th iteration")
        ip.foreach(x=>print(x))
        println()



    }
  }

}
