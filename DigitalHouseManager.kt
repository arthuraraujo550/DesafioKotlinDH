package br.com.digitalhouse

import java.util.*

class DigitalHouseManager(
        var listaAluno: MutableList<Aluno> = mutableListOf(),
        var listaProfessores: MutableList<Professor> = mutableListOf(),
        var listaCurso: MutableList<Curso> = mutableListOf(),
        var listaMatricula: MutableList<Matricula> = mutableListOf()) {

    lateinit var umCurso: Curso
    lateinit var umAluno: Aluno

    override fun toString(): String {
        return super.toString()
    }

    fun registrarCurso(curso: Curso) {
        listaCurso.add(curso)
        println("Curso ${curso.nomeDoCurso} registrado com sucesso")
    }

    fun excluirCurso(codigoDeCurso: Int) {
        for (curso in listaCurso) {
            if (curso.codigoDeCurso == codigoDeCurso) {
                listaCurso.remove(curso)
                println("Curso ${curso.nomeDoCurso} removido com sucesso")
            }
        }


    }

    fun registrarProfessorAdjunto(profAdj: ProfessorAdjunto) {
        listaProfessores.add(profAdj)
        println("Professor(a) ${profAdj.nome} ${profAdj.sobrenome} registrado(a) com sucesso")
    }

    fun registrarProfessorTitular(profTit: ProfessorTitular) {
        listaProfessores.add(profTit)
        println("Professor(a) ${profTit.nome} ${profTit.sobrenome} registrado(a) com sucesso")
    }

    fun excluirProfessor(codigoDeProfessor: Professor) {
        for (profAdj in listaProfessores) {
            if (profAdj.codigoDeProfessor.equals(codigoDeProfessor)) {
                listaProfessores.remove(profAdj)
                println("Professor(a) ${profAdj.nome} ${profAdj.sobrenome} removido(a) com sucesso")
            }

        }
        for (profTit in listaProfessores) {
            if (profTit.codigoDeProfessor.equals(codigoDeProfessor)) {
                listaProfessores.remove(profTit)
                println("Professor ${profTit.nome} ${profTit.sobrenome} removido com sucesso")
            }
        }
    }

    fun registrarAluno(aluno: Aluno) {
        listaAluno.add(aluno)
        println("Aluno ${aluno.nomeDoAluno} ${aluno.sobrenome} registrado com sucesso")
    }

    fun matricularAluno(codigoDeAluno: Int, codigoDeCurso: Int) {
        var matricula: Matricula = Matricula(null, null, null)
        for (i in 0..listaCurso.size - 1) {
            for (j in 0..listaAluno.size - 1) {

                if (listaCurso[i].codigoDeCurso == codigoDeCurso && listaAluno[j].codigoDeAluno == codigoDeAluno) {
                    if (listaCurso.size - 1 < listaCurso[i].limiteAlunos) {
                        matricula.curso = listaCurso[i]
                        matricula.aluno = listaAluno[j]
                        listaMatricula.add(matricula)
                        println("Aluno ${listaAluno[j].nomeDoAluno} foi matriculado no curso ${listaCurso[i].nomeDoCurso} com sucesso")
                    } else {
                        println("Não foi possível realizar a matrícula porque não há vagas")
                    }
                }
            }
        }
    }


    fun alocarProfessor(codigoDeCurso: Int, codigoDeProfessorTitular: Int, codigoDeProfessorAdjunto: Int) {

        for (profTit in listaProfessores) {
            if (profTit.codigoDeProfessor == codigoDeProfessorTitular) {
                for (curso in listaCurso) {
                    if (curso.codigoDeCurso == codigoDeCurso) {
                        curso.professorTitular = profTit as ProfessorTitular
                        println("Professor(a) Titular ${profTit.nome} ${profTit.sobrenome} alocado(a) no curso ${curso.nomeDoCurso}")
                    }
                }
            }
        }
        for (profAdj in listaProfessores) {
            if (profAdj.codigoDeProfessor == codigoDeProfessorAdjunto) {
                for (curso in listaCurso) {
                    if (curso.codigoDeCurso == codigoDeCurso) {
                        curso.professorAdjunto = profAdj as ProfessorAdjunto
                        println("Professor(a) Adjunto(a) ${profAdj.nome} ${profAdj.sobrenome} alocado(a) no curso ${curso.nomeDoCurso}")
                    }
                }
            }
        }
    }
}

