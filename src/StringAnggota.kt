fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))       // false, case-sensitive
    println(s.endsWith("tamus"))        // true
    println(s.contains("pot"))          // true
    println(s.contains("lol"))          // false

    // toUpperCase() and toLowerCase() -> gunakan versi modern
    var config = "Fullscreen shaDows autosave"
    config = config.lowercase()
    println("Will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on?")
    println(config.contains("shadows"))
    println("Will sound be turned off?")
    println(config.contains("nosound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))

    // replace()
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println(strJava)
    println("$strJava is ${strJava.length} characters long.")

    // substring()
    println("I would not banish all of these Internets.".substring(2, 7))

    // compareTo()
    println("alpha".compareTo("bravo"))
}
