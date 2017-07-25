package converters

object BerlinSecondsConverter {

  def apply(seconds: Int): String = if(seconds % 2 == 0) "ON" else "OFF"
}
