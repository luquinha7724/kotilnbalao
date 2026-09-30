fun main() {
    // Coleção para armazenar os alunos.
    val alunos = mutableListOf<String>();
    // Coleção para as notas.
    val notas = mutableMapOf<String, MutableList<Double>>();
    var opcao = ""

    while (opcao != "6"){
        println("================")
        println("Sistema Acadêmico")
        println("================")
        println("1 - Cadrastrar aluno")
        println("2 - Listar alunos")
        println("3 - Cadatrar notas")
        println("4 - Ver média")
        println("5 - Ver situação")
        println("6 - Sair")


        println("Escolha uma opção")
        opcao = readln()

        when (opcao) {
            "1" -> {
                println("Digitar nome do aluno: ")
                val nomeAluno = readln()

                alunos.add(nomeAluno)
                println("Aluno cadatrado! ")
            }
            "2" -> {
                println("Alunos cadatrados!")
                for (a in alunos) {
                    println(a)
                }
                println("================")
            }

            "3" -> {
                println("Digitar o nome aluno: ");
                val nomeAluno = readln()

                println("Digitar a primeira nota: ");
                val nota1 = readln().toDouble()

                println("Digitar a segunda nota: ");
                val nota2 = readln().toDouble()

                println("Digitar a terceira nota: ");
                val nota3 = readln().toDouble()

                notas[nomeAluno] = mutableListOf(nota1, nota2, nota3)

            }
            "4" -> {
                println("Digitar o nome aluno: ");
                val nomeAluno = readln()

                val lista = notas[nomeAluno]

                val média = (lista!![0] + lista[1] + lista[2]) / 3

                println("A média do aluno é: $média")
            }
        }
    }
}