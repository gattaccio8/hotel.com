package converters


object BerlinHoursConverter extends BerlinConverters {

  override def apply(hours: Int): String =
    (1 to hours / 5).foldLeft("")((acc, curr) => acc + "R") + secondLine(hours)

  override val secondLine: Int => String =
    hours => (1 to hours % 5).foldLeft("\n")((acc, curr) => acc + "R")
}
