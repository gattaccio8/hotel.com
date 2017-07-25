package converters

import org.scalatest.{FlatSpec, Matchers}

class BerlinMinutesConverterSpec extends FlatSpec with Matchers {

  it should "convert five minutes into a single yellow 'Y'" in {
    BerlinMinutesConverter(0) shouldBe "\n"
    BerlinMinutesConverter(1) shouldBe "\nY"
    BerlinMinutesConverter(5) shouldBe "Y\n"
    BerlinMinutesConverter(9) shouldBe "Y\nYYYY"
    BerlinMinutesConverter(11) shouldBe "YY\nY"
    BerlinMinutesConverter(19) shouldBe "YYR\nYYYY"
    BerlinMinutesConverter(55) shouldBe "YYRYYRYYRYY\n"
    BerlinMinutesConverter(59) shouldBe "YYRYYRYYRYY\nYYYY"
  }

  it should "convert every quarter of a hour into red" in {
    BerlinMinutesConverter(15) shouldBe "YYR\n"
    BerlinMinutesConverter(30) shouldBe "YYRYYR\n"
    BerlinMinutesConverter(45) shouldBe "YYRYYRYYR\n"
  }
}
