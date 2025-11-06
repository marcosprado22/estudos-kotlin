import java.util.*


class Rectangle(val height: Int, val width: Int ) {
    val isSquare: Boolean
        get() = height == width

}

fun createRamdomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}