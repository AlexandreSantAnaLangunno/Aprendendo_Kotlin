// Aula 02 Oque são Variáveis

fun main(){
    println("Aula 02!")

    // Declarando um Variavel e Uma Constante

    var idade = 14
    val nome = "Alexandre"

    println(idade)

    idade = 15

    println(idade)

/* Var Muda e Val não
*
* Var = Variavel
* Val = Constante
*
*  */

    // Tipos Primitivos

    /* Inteiro */
    val Ano=2020
    val Proximo_Ano: Int=2022

    /* Float */
    val altura=1.60f
    val Açucar: Float=2.5f

    /* Double */
    //Double > Float

    val Pi: Float=3.14159265359f
    val PI: Double=3.14159265359

    println(Pi)  // O Float Arredonda
    println(PI)  // O Double ocupa mais espaço na memoria

    /* Char */
    // O Char é definido por uma Aspa

    val PrimeiraLetraDoAlfabeto: Char='A'

    /* Strings */
    // A String é definida por Aspas Duplas

    val NOME:String="Alexandre"

    /* Booleans */
    // True e False

    val Sim = true
    val Nao:Boolean = false
}