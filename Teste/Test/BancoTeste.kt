package Teste.test

import Teste.Banco

fun main(){
    val maxBank = Banco( id=1, nome="Max Bank", numero=1)
    println(maxBank.nome)
    println(maxBank.numero)
}