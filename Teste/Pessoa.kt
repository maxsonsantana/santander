package Teste

class Pessoa { 
    var nome: String = "Abrovildo Pinto Roxo"
    var cpf: String = "010.010.010.00"
    var endereco: String = "Copacabana Palace"
    var telefone: String = ""
    var email: String = ""
    var senha: String = ""
    var saldo: Double = 0.0    
}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
    println(jether.endereco)
}