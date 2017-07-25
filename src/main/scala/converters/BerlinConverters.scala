package converters


trait BerlinConverters extends ((Int) => String) {
  def apply(i: Int): String
  val secondLine: Int => String
}
