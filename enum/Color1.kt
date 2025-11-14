package enum

enum class Color1 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color1) =
    when (color) {
        Color1.RED -> "Richard"
        Color1.ORANGE -> "Of"
        Color1.YELLOW -> "York"
        Color1.GREEN -> "Gave"
        Color1.BLUE -> "Battle"
        Color1.INDIGO -> "In"
        Color1.VIOLET -> "Vain"


}

fun main(){
    println(getMnemonic(Color1.BLUE))
}

