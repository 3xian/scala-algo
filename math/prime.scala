def getPrimes(n: Int): (Array[Int], Array[Int]) = {
  val primes = ArrayBuffer.empty[Int]
  val maxFact = Array.ofDim[Int](n + 1)

  for (i <- 2 to n; if maxFact(i) == 0) {
    (i to n by i).foreach(maxFact(_) = i)
    primes += i
  }

  (primes.toArray, maxFact)
}
