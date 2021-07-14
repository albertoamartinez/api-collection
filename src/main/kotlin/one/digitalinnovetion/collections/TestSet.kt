package one.digitalinnovetion.collections

fun main() {
    val Joao = Funcionario("João", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "PJ")
    val Maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(Joao, Pedro)
    val funcionarios2 = listOf(Maria)

    val resultUnion = funcionarios.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("----------------------")

    val funcionarios3 = listOf(Joao, Pedro, Maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("----------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}