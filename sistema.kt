fun main() {
    //Coleção para armazenar os alunos.
    val alunos = mutableListOf<String>();
    // Coleção para as notas.
    val notas = mutableMapOf<String, MutableList<Double>>();
    var opcao = ""

    while (opcao != "6") {
        mostrarMenu()
        opcao = readln()

        when(opcao) {
            "1" -> cadastrarAluno(alunos)
            "2" -> listarAlunos(alunos)
            "3" -> cadastrarNotas(alunos, notas)
        }
    }
}

fun mostrarMenu() {
    println("==================")
    println(" SISTEMA ACADÊMICO ")
    println("==================")
    println("1 - Cadastrar aluno")
    println("2 - Listar alunos")
    println("3 - Cadastrar notas")
    println("4 - Consultar aluno")
    println("5 - Ver média")
    println("6 - Ver situação")
    println("7 - Remover aluno")
    println("8 - Sair")
    println("Escolha uma opção")
}

fun cadastrarAluno(alunos: MutableList<String>){
    println("Digitar o nome do aluno: ")
    val nomeAluno = readln().trim().uppercase()

    if (nomeAluno.isEmpty()){

    } else if (alunos.contains(nomeAluno)) {
        println("Aluno $nomeAluno já está cadastrado")
    } else {
        alunos.add(nomeAluno)
        println("Aluno cadastrado! ")
    }
}

fun listarAlunos(alunos: MutableList<String>) {
    println("==================")
    println("Alunos cadastrados!")

    if (alunos.isEmpty()){
        println("Nenhum aluno cadastrado.")
    } else {
        for ((index, aluno) in alunos.withIndex()) {
            println("${index + 1} -- $aluno")
        }
    }
    println("==================")

}

fun cadastrarNotas(
    alunos: MutableList<String>,
      notas: MutableMap<String, MutableList<Double>>) {

    println("Digitar o nome do aluno: ")
    val nomeAluno = readln().trim().uppercase()

    if (!alunos.contains(nomeAluno)){
        println("Aluno não encontrado. Cadastre o aluno primeiro.")
        return
    }

    val nota1 = lerNota("Digite a primeira nota: ")
    val nota2 = lerNota("Digite a segunda nota: ")
    val nota3 = lerNota("Digite a terceira nota: ")

    notas[nomeAluno] = mutableListOf(nota1,nota2, nota3)
    println("Notas cadastradas!")
}

fun lerNota(msn: String): Double {
    while (true) {
        println(msn)
        val nota = readln().replace(oldChar = ',', newChar = '.').toDouble()

        if (nota in 0.0..10.0) {
            return nota
        }
    }

    println("Digite uma nota válida entre o 0 e 10.")
}