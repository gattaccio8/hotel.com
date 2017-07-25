package converters

import org.scalatest.{FlatSpec, Matchers}

class BerlinHoursConverterSpec extends FlatSpec with Matchers {

  it should "convert five hours into a single red light" in {
    BerlinHoursConverter(0) shouldBe "\n"
    BerlinHoursConverter(4) shouldBe "\nRRRR"
    BerlinHoursConverter(5) shouldBe "R\n"
    BerlinHoursConverter(10) shouldBe "RR\n"
    BerlinHoursConverter(15) shouldBe "RRR\n"
    BerlinHoursConverter(20) shouldBe "RRRR\n"
  }

  it should "convert five hours into a single red light for not multiple of 5" in {
    BerlinHoursConverter(0) shouldBe "\n"
    BerlinHoursConverter(4) shouldBe "\nRRRR"
    BerlinHoursConverter(9) shouldBe "R\nRRRR"
    BerlinHoursConverter(11) shouldBe "RR\nR"
    BerlinHoursConverter(21) shouldBe "RRRR\nR"
  }
}
