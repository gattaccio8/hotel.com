package converters


object BerlinMinutesConverter extends BerlinConverters {

  override def apply(minutes: Int): String =
    (1 to minutes / 5).foldLeft(""){ (acc, curr) =>
      acc + redEveryFifteenMinutes(acc, curr) } + secondLine(minutes)

  private val redEveryFifteenMinutes: (String, Int) => String =
    (acc, minute) => if (minute % 3 == 0) "R" else "Y"

  override val secondLine: Int => String = minutes =>
    (1 to minutes % 5).foldLeft("\n")((acc, curr) => if(curr % 5 == 0) acc else acc + "Y")
}
