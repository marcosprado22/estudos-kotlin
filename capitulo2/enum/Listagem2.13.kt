package capitulo2.enum


fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> " warn"
    Color.GREEN, -> " neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}


fun main(){
    println(getWarmth(Color.ORANGE))
}
