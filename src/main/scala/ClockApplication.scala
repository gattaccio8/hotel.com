import converters.{BerlinMinutesConverter, BerlinHoursConverter, BerlinSecondsConverter}

import scala.io.StdIn


trait ClockConverter {
  def convertTime(hours: Int, minutes: Int, seconds: Int): String =
    BerlinSecondsConverter(seconds) + "\n" + BerlinHoursConverter(hours) + "\n" + BerlinMinutesConverter(minutes)
}


object ClockApplication extends App with ClockConverter {

  private val userInput: Array[Int] = StdIn.readLine().split(",").map(_.toInt)

  println(s"Converted to Berlin clock:\n${convertTime(userInput(0), userInput(1), userInput(2))}")
}
