package converters

import org.scalatest.{Matchers, FlatSpec}

class BerlinSecondsConverterSpec extends FlatSpec with Matchers {

  it should "convert five minutes into a single yellow" in {
    BerlinSecondsConverter(0) shouldBe "ON"
    BerlinSecondsConverter(1) shouldBe "OFF"
    BerlinSecondsConverter(2) shouldBe "ON"
    BerlinSecondsConverter(10) shouldBe "ON"
    BerlinSecondsConverter(5) shouldBe "OFF"
    BerlinSecondsConverter(59) shouldBe "OFF"
  }
}
