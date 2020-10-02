package br.com.digitalhouse

fun main() {
    val dhm = DigitalHouseManager()
    val prof1 = ProfessorTitular("Ricardo", "Silva", 10, 1234, "Java")
    val prof2 = ProfessorTitular("Rita", "Salles", 27, 4321, "Kotlin")
    val prof3 = ProfessorAdjunto("Rebeca", "Soares", 14, 2143, 4)
    val prof4 = ProfessorAdjunto("Lucas", "Baião", 49, 5421, 13)
    dhm.registrarProfessorTitular(prof1)
    dhm.registrarProfessorTitular(prof2)
    dhm.registrarProfessorAdjunto(prof3)
    dhm.registrarProfessorAdjunto(prof4)
    println("\n")
    val curso1 = Curso("Full Stack", 20001, 3)
    val curso2 = Curso("Android", 20002, 2)
    dhm.registrarCurso(curso1)
    dhm.registrarCurso(curso2)
    println("\n")
    dhm.alocarProfessor(20001, 1234, 2143)
    dhm.alocarProfessor(20002, 4321, 5421)
    println("\n")
    val aluno1 = Aluno("Rodrigo", "Nogueira", 1026)
    val aluno2 = Aluno("Antônio", "Silva", 8936)
    val aluno3 = Aluno("Pedro", "Rocha", 3917)
    val aluno4 = Aluno("Maria", "Gonçalves", 6920)
    val aluno5 = Aluno("Priscila", "Mallva", 3469)
    dhm.registrarAluno(aluno1)
    dhm.registrarAluno(aluno2)
    dhm.registrarAluno(aluno3)
    dhm.registrarAluno(aluno4)
    dhm.registrarAluno(aluno5)
    println("\n")
    dhm.matricularAluno(8936, 20001)
    dhm.matricularAluno(3469, 20001)
    dhm.matricularAluno(1026, 20002)
    dhm.matricularAluno(3917, 20002)
    dhm.matricularAluno(6920, 20002)

}