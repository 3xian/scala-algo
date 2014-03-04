import java.util

object Main {
  var st = new util.StringTokenizer("")

  def readToken() = {
    while (!st.hasMoreTokens) st = new java.util.StringTokenizer(readLine)
    st.nextToken
  }

  def main(args: Array[String]) {
  }
}
