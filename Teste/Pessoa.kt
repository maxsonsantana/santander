package Teste

//Classe
class Pessoa { 
    var nome: String = "Abrovildo Pinto Roxo"    
    var cpf: String = "010.010.010.00"
    private set //private é somente para dentro da classe(atributo acima)
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
    
    fun thePeople() = "Nome: $nome\nCPF: $cpf\nIdade: $idade\n"

}

fun main() {
    val jether = Pessoa() //Instanciação da classe(Objeto)

    println(jether)//Imprime o objeto e referencia de memória
    jether.nome = "Josias" //Atribuição se o atributo não for private
    println("Nome: " +jether.nome)    
    println("Endereco: " + jether.Endereco().logradouro)
    println("Funcao: " + jether.thePeople())
}