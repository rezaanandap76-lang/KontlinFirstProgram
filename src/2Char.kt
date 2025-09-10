fun main(args: Array<String>) {
    val charA: Char = 'A'

    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.lowercaseChar())   // toLowerCase() diganti dengan lowercaseChar()

    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = $strA")
}
