//Couldnt run without errors:(
object Main {
    def main(args: Array[String]) = {
        println("Input the size of the array:")
        val n = scala.io.StdIn.readInt()

        var a = Array.ofDim[Int](n)
        var result = scala.collection.mutable.ArrayBuffer[Int]()

        println("Input the array:")
        for (i <- 0 to n) {
            a(i) = scala.io.StdIn.readInt()
        }

        for (i <- 0 to n) {
            if ((i == 0 && math.max(a(i), a(i + 1)) == a(i)) || (i == n - 1 && math.max(a(i), a(i - 1)) == a(i)) || (math.max(math.max(a(i), a(i + 1)), a(i - 1)) == a(i))) {
            result.append(a(i))
            }
        }

        println(result.toArray.mkString(", "))
    }    
}
