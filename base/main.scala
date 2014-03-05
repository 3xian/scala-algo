import java.util

object Main {
  var tokenizer = new util.StringTokenizer("")

  def readToken = {
    while (!tokenizer.hasMoreTokens) tokenizer = new util.StringTokenizer(readLine)
    tokenizer.nextToken
  }

  def readInt = readToken.toInt

  // >>>
  // >>>

  def main(args: Array[String]) {
  }
}
