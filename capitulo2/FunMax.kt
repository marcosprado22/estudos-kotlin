package capitulo2

//nome da função: max
//parâmetros: a e b do tipo Int
//tipo de retorno: Int
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b //corpo da função - retorna o maior valor
}

//Esse é um exemplo de declaraçào de função simples em Kotlin, e segue sempre essa estrutura:
// nome da função, parâmetros entre parênteses, tipo de retorno após os dois pontos e o corpo da função entre chaves.

//É possível também declarar funções de forma mais concisa quando o corpo da função é uma única expressão.
// Nesse caso, você pode usar o operador "=" para definir a função sem chaves, como mostrado abaixo:

fun maxConciso(a: Int, b: Int): Int = if (a > b) a else b

//Você pode simplificar ainda mais, removendo o tipo de retorno, já que o compilador pode inferi-lo automaticamente:
fun maxMaisConciso(a: Int, b: Int) = if (a > b) a else b

fun main() {
    val numero1 = 10
    val numero2 = 20

    val maior = max(numero1, numero2)
    println("O maior número entre $numero1 e $numero2 é: $maior")

    val maiorConciso = maxConciso(numero1, numero2)
    println("O maior número entre $numero1 e $numero2 (conciso) é: $maiorConciso")

    val maiorMaisConciso = maxMaisConciso(numero1, numero2)
    println("O maior número entre $numero1 e $numero2 (mais conciso) é: $maiorMaisConciso")
}