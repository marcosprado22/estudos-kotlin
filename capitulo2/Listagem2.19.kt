package capitulo2


fun eval(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
       eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown Expression")
  }


fun main(){
    println (eval(Sum(Num(1), Num(2))))
}
