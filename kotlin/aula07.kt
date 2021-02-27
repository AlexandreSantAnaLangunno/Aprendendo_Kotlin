// For para Listas

fun main() {
    val nome = listOf("Alexandre", "Oswaldo", "Ana", "Katarina",
            "Irineu", "Franchesco", "Mario"
    )

    // Imprimindo Cada Item da Lista

    for (nomes in nome){
        println(nomes)
    }

    // Imprime Quantas coisas tem na lista
    for (index in nome.indices){
        println(index)

//             Ou

        println(nome[index])
    }

    // Ou os Dois ao Mesmo Tempo
    for ((index,nomes) in nome.withIndex()){
        println(nome[index])
    }

    // ForEach
    nome.forEach{ nomes ->
        println(nomes)
    }

    nome.forEachIndexed{ i, nomes: String ->
        println(i)
    }

    // for index in Range

    for(i in 0..10){
        println(i)
    }
    for(i in 0..nome.lastIndex){
        println(i)
    }

    for(i in 0..nome.lastIndex){
        println(nome[i])
    }

}