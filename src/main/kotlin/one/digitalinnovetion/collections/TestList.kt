package one.digitalinnovetion.collections

fun main() {

    val Joao = Funcionario("João", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "PJ")
    val Maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(Joao, Pedro, Maria)

    funcionarios.forEach { println(it) }

    println("---------------------------")

    println(funcionarios.find { it.nome == "Maria"})

    println("---------------------------")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("---------------------------")

    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }

}