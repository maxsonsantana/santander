package Teste

//Classe
class Pessoa { 
    var nome: String = "Abrovildo Pinto Roxo"
    private set //private é somente para dentro da classe
    var cpf: String = "010.010.010.00"    
    var idade: Int = 18
    inner class Endereco {
        var logradouro: String = "Rua dos Bobos"
        var numero: Int = 0
        var bairro: String = "Centro"
        var cidade: String = "São Paulo"
        var uf: String = "SP"
    }

    var telefone: String = ""
    var email: String = ""
    var senha: String = ""
    var saldo: Double = 0.0
    
}

fun main() {
    val jether = Pessoa() //Instanciação da classe(Objeto)

    println(jether)//Imprime o objeto e referencia de memória
    //jether.nome = "Jether"
    println(jether.nome)
    println("CPF: " +jether.cpf)
    println("Endereco: " + jether.Endereco().logradouro)
}