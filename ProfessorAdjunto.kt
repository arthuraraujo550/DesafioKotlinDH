package br.com.digitalhouse

class ProfessorAdjunto(
        override val nome: String,
        override val sobrenome: String,
        override var diasTempoDeCasa: Int,
        override val codigoDeProfessor: Int,
        val horasDeMonitoria: Int
) : Professor(nome, sobrenome, diasTempoDeCasa, codigoDeProfessor) {
}