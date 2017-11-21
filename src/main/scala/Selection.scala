object Selection {
  def main(args: Array[String]): Unit = {
    val ip = Array(5, 1, 3, 6, 2, 8, 4)
    var temp = 0
    var j = 0
    var i=0
    var k=0
    var smallest=0
    for(j <- 0 to ip.length-1)
    { smallest=ip(j)
      temp=smallest
      k=j
      for(i <- j to ip.length-1)
        {

          if(smallest>ip(i))
            {k=i
             smallest=ip(k)
            }
        }
      temp=ip(j)
      ip(j)=ip(k)
      ip(k)=temp
      println(j+"th iteration")
      ip.foreach(x=>print(x))
      println()



    }
  }

}
