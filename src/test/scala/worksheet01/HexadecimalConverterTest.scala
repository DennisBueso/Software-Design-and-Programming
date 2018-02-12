package worksheet01

import org.scalatest.{FlatSpec, Matchers}

class HexadecimalConverterTest extends FlatSpec with Matchers {

  "A Hexadecimal Converter" should "handle empty" in {
    HexadecimalConverter.hexToInt("") should equal(0)
  }

  it should "handle zeros" in {
    pending
    HexadecimalConverter.hexToInt("00000000") should equal(0)
  }

  it should "handle single digit" in {
    pending
    HexadecimalConverter.hexToInt("1") should equal(1)
  }

  it should "handle single hex digit" in {
    pending
    HexadecimalConverter.hexToInt("c") should equal(12)
  }

  it should "handle upper case" in {
    pending
    HexadecimalConverter.hexToInt("C") should equal(12)
  }

  it should "handle multiple digits" in {
    pending
    HexadecimalConverter.hexToInt("10") should equal(16)
  }

  it should "handle multiple hex digits" in {
    pending
    HexadecimalConverter.hexToInt("AF") should equal(175)
  }

  it should "handle complex strings" in {
    pending
    HexadecimalConverter.hexToInt("19ace") should equal(105166)
    HexadecimalConverter.hexToInt("ffffff") should equal(16777215)
    HexadecimalConverter.hexToInt("ffff00") should equal(16776960)
  }

  it should "handle invalid strings" in {
    pending
    HexadecimalConverter.hexToInt("carrot") should equal(0)
    HexadecimalConverter.hexToInt("abczcba") should equal(0)
  }
}
