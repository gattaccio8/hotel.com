import org.scalatest.{Matchers, FlatSpec}

class ApplicationSpec extends FlatSpec with Matchers {

  it should "convert a given time into Berlin clock" in {
    ClockApplication.convertTime(13, 4, 5) shouldBe s"OFF\nRR\nRRR\n\nYYYY"
    ClockApplication.convertTime(0, 4, 5) shouldBe s"OFF\n\n\n\nYYYY"
    ClockApplication.convertTime(1, 5, 6) shouldBe s"ON\n\nR\nY\n"
    ClockApplication.convertTime(24, 59, 59) shouldBe s"OFF\nRRRR\nRRRR\nYYRYYRYYRYY\nYYYY"
  }
}
