package br.com.digitalhouse

class Aluno(val nomeDoAluno: String?, val sobrenome: String?, val codigoDeAluno: Int?) {
    override fun equals(other: Any?): Boolean {
        if (other !=  null && other is Aluno ) {
            return other.codigoDeAluno == this.codigoDeAluno
        }

        return false
    }
}
