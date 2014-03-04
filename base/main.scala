import java.util

object Main {
  def main(args: Array[String]) {
  }

  var st = new util.StringTokenizer("")

  def readToken() = {
    while (!st.hasMoreTokens) st = new java.util.StringTokenizer(readLine)
    st.nextToken
  }
}
