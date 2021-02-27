// Funções
fun main(){     // As entradas ficam entre parenteses e chamamos de parametros
    val n1= 5
    val n2=5

    fun somar(x: Int, y: Int):Int{   // Precisamos Declarar O Tipo de Retorno
        val soma= x + y
        println("A Soma entre $x e $y são $soma")
        return soma
    }

    somar(x = n1,y = n2)

    fun subitracao(n:Int, m:Int):Int{
        val sub = n - m
        println("A subtração entre $n e $m é igual a $sub")
        return sub
    }

    subitracao(n1,n2)

    // Quando a Função tem somente uma instrução usamos o retorno inline como no exemplo:
/*
                fun somar(x: Int, y:Int): Int = x + y

*/

    return      // As Saídas chamamos de Retorno
}