package br.com.digitalhouse

class ProfessorTitular(
        override val nome: String,
        override val sobrenome: String,
        override var diasTempoDeCasa: Int,
        override val codigoDeProfessor: Int,
        val especialidade: String
) : Professor(nome, sobrenome, diasTempoDeCasa, codigoDeProfessor) {
}