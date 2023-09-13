// Aula 2
fun calculaDivisao(a: Int = 0, b: Int = 0) {
    try {
        val divisao = a/b
        println(divisao.toString())
    } catch(e: ArithmeticException) {
        println("Ocorreu uma excecao aritmetica.")
    } catch(e: Throwable) {
        println(e.message.toString())
    } finally {
        println("Terminou!")
    }
}

//Aula 3
fun calculaDivisaoMelhorada (a: Int, b: Int): Int {
    return try { a/b } catch(e: ArithmeticException) { 0 }
}

//Aula 5
class IllegalVoterException(message: String) : Throwable(message)

//Aula 5
@Throws(IllegalVoterException::class)
fun registraVoto(name: String, age: Int) {
    if(age < 16) {
        throw IllegalVoterException("$name nao pode votar.")
    }
    println("Voto de ${name} realizado com sucesso!")
}

// Aula 6
data class Person(val name: String?)

// Aula 6
fun fail(message : String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    //calculaDivisao(1,0)
    //println(calculaDivisaoMelhorada(4, 2))

    // Aula 5
    // var quantidadeVotos : Int = 0
    //     quantidadeVotos += try { registraVoto("Joao", 30); 1; } catch (e: IllegalVoterException) { 0 };
    //     quantidadeVotos += try { registraVoto("Marcos", 10); 1; } catch (e: IllegalVoterException) { 0 };
    //     quantidadeVotos += try { registraVoto("Renan", 50); 1; } catch (e: IllegalVoterException) { 0 };
    // println(quantidadeVotos)

    // Aula 6
    val person = Person(null)
    val s = person.name ?: fail("Nome requerido")
    println(s)
}