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

fun main() {
    calculaDivisao(1,0)
}