package br.com.digitalhouse


class Curso(val nomeDoCurso: String, val codigoDeCurso: Int, var limiteAlunos: Int) {
    var professorTitular = ProfessorTitular("", "", 0, 0, "")
    var professorAdjunto = ProfessorAdjunto("", "", 0, 0, 0)
    var listaDeAlunos: MutableList<Aluno> = mutableListOf()

    constructor(
            nomeDoCurso: String,
            codigoDeCurso: Int,
            limiteAlunos: Int,
            professorTitular: ProfessorTitular,
            professorAdjunto: ProfessorAdjunto,
            listaDeAlunos: MutableList<Aluno>
    ) : this(nomeDoCurso, codigoDeCurso, limiteAlunos) {
        this.professorTitular; this.professorAdjunto; this.listaDeAlunos

    }


    override fun equals(other: Any?): Boolean {
        if (other != null && other is Curso) {
            return other.codigoDeCurso == this.codigoDeCurso
        }

        return false
    }


    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaDeAlunos.size < limiteAlunos) {
            listaDeAlunos.add(umAluno)
            println("Aluno matriculado")
            return true
        } else {
            println("Não há vagas")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaDeAlunos.remove(umAluno)
        println("Aluno removido")
    }
}
