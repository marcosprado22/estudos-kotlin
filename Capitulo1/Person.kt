package Capitulo1

data class Person(
    val name: String,
    val age: Int? = null
)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
        Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}

// fun findAlice() = findPerson { it.name == "Alice" } // 1 findPerson() contém a lógica geral para encontrar uma pessoa
// fun findBob() = findPerson { it.name == "Bob" } 2 O bloco entre chaves identifica a [esspa es[ecífica que você deve encontrar

