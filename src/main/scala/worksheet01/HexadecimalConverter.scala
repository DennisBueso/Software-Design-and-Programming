package worksheet01

object HexadecimalConverter {

  def hexToInt(hexInput: String): Int = {
    hexInput.toLowerCase match {
      case hexString: String if hexString.forall(isValidChar) => hexString.foldLeft(0){(acc, char)
      => acc * 16 + toHexValue(char)}
      case _ => 0
    }
  }

  def isValidChar(hexChar: Char): Boolean = {('0' to '9') ++ ('a' to 'f')}.contains(hexChar)

  def toHexValue(char: Char): Int = if (char.isDigit) char.asDigit else char - 'a' + 10
}
