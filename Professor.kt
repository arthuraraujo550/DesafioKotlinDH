package br.com.digitalhouse

open class Professor(
        open val nome: String,
        open val sobrenome: String,
        open val diasTempoDeCasa: Int,
        open val codigoDeProfessor: Int
) {
    override fun equals(other: Any?): Boolean {
        if (other != null && other is Professor) {
            return other.codigoDeProfessor == this.codigoDeProfessor
        }

        return false
    }

}