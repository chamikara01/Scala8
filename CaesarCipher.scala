object CaesarCipher {
  private def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val start = if (char.isUpper) 'A' else 'a'
        ((char - start + shift) % 26 + start).toChar
      } else {
        char
      }
    }
  }

  private def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  private def cipher(text: String, shift: Int, isEncrypt: Boolean): String = {
    if (isEncrypt) encrypt(text, shift) else decrypt(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Chamikara"
    val shift = 3

    val encrypted = cipher(plaintext, shift, true)
    println(s"Encrypted: $encrypted")

    val decrypted = cipher(encrypted, shift, false)
    println(s"Decrypted: $decrypted")
  }
}
