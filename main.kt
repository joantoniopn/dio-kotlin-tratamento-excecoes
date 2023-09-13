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

fun main() {
    //calculaDivisao(1,0)
    println(calculaDivisaoMelhorada(4, 2))
}