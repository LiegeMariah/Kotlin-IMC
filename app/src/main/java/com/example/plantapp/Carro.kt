package com.example.plantapp

class Carro (
    val nome: String,
    val ano: Int,
    val cor: String
    )

{
fun acelerar() {
    println("nome acelerando....")
}

private fun frear () {
    println("fre" )
}

fun buscardescricaocompleta (): String {
    return " $nome -----$ano ----- $cor"
    frear()

}
}