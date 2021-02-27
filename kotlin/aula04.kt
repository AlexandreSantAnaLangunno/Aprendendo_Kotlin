// When ''' Quando '''
fun main() {

    val numero:Int = 8

    when{                  // Quando
        numero > 0 -> {
            println("O Numero é Positivo ")

        }

        numero < 0 ->  println("O Numero é Negativo ") // Não precisa de Chaves Caso a Instrução seja somente uma

        else -> { println("O Numero é Zero") }
    }

}