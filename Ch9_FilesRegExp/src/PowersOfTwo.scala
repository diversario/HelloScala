import java.io.PrintWriter

class PowersOfTwo(filename: String) {
  val max = 20
  val outFile = new PrintWriter(filename)

  for (i <- 0 to max) {
    outFile.printf("%1.5f\t%1.0f%n".format(Math.pow(2, -i), Math.pow(2, i)))
  }

  outFile.close()
}

object PowersOfTwo extends App {
  new PowersOfTwo("powersoftwo.txt")
}
