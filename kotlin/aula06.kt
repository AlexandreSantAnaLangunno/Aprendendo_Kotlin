// Listas

fun main() {
    val pares = listOf(2,4,6,8,10)
    val seis = pares[2]   // ou pares.get(2)

    println(seis)
    println(pares)

    // Listas Nulas

    val nulo = listOf<Int>()          // ListOf é imutavel

    val nulos: MutableList<Int> = mutableListOf()    // mutableList é mutavel

    // Adicionando Itens na Lista

    nulos.add(1)
    println(nulos)

    // Removendo Itens na Lista

    nulos.remove(1)
    println(nulos)


    val nome = listOf("Alexandre", "Oswaldo", "Ana", "Katarina", "Irineu", "Franchesco", "Mario")

    println(nome.count())    // Quantas coisas tem na Lista

    println(nome.size)     // Tamanho da Lista

    println(nome.isEmpty())     // A Lista está vazia?

    println(nome.first())      // Ou get(0)

    println(nome.last())

    println(nome.contains("Ana"))    // A Lista Contem "Ana"

    println(nome.asReversed())   // Reverso

    println(nome.sorted())     // Ordena a Lista

    println(nome)
}