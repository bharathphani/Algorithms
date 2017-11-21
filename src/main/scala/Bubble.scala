object Bubble {
  def main(args: Array[String]): Unit = {
    val ip = Array(5, 1, 3, 6, 2, 8, 4)
    var temp = 0
    var j = 0
    var i=0
    for(j <- 0 to ip.length-2)
      {
        for(i <- 0 to ip.length-j-2)
          {
             if(ip(i) > ip(i+1))
              {
                temp=ip(i+1)
                ip(i+1)=ip(i)
                ip(i)=temp

              }
          }
        println(j+"th iteration")
        ip.foreach(x=>print(x))
        println()

      }
  }
}
