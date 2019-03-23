object Result {

  /*
   * Complete the 'getTriangleArea' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY x
   *  2. INTEGER_ARRAY y
   */

  def getTriangleArea(x: Array[Int], y: Array[Int]): Int = {

    val len = x.length

    var arr:Array[Array[Int]]= new  Array[Array[Int]](len)
    var h = 0
    var w = 0

    var area = 0

    for(i <- 1 until len)
      {
        if(i==1) {
          if (x(i) == y(i)) {
            h = x(i)
          }
          else if(y(i)==0)
          {
            w = x(i)
          }else if(x(i)==0)
          {
            w = y(i)
          }
        }
        if(i==2){

          if(y(i)==0)
          {
            w = x(i)
          }

          if(x(i)==0)
          {
            w = y(i)
          }
        }

      }

    area = w * (h/2)





    return area

  }

}