object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] =
    for {
      (score, strings) <- scoreMap
      string <- strings
    } yield (string.toLowerCase(), score)
}
