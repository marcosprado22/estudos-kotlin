package capitulo2

fun eval2(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
           eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")

    }

fun main(){
    println (eval(Sum(Num(1), Num(2))))
}