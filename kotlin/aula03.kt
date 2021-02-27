// Estrutura de Decisão If e Else

// Operadores Lógicos

fun main() {

    fun Juninho() {


        // Juninho tem 17 anos e quer ir na festa
        val Idade: Int = 16

        // Mas so pode entrar...
        if (Idade == 18) {
            println(" Ben-Vindo ")
        }
        // Se não...
        else {
            println(" Pode Ir Para Casa ")
        }
/*
*
*    Mas só pode entrar se a idade for 18 ?
*
*/
        if (Idade == 18 || Idade > 18) {
            println("Pode Entrar")
        }

        if (Idade >= 18) {
            println("Bem Vindo! ")
        } else {
            println("Pode ir para Casa")
        }
    }
    Juninho()

    fun Bom_Dia(){
        val Hora:Int = 14
        // "Bom Dia" se Hora for menor que 12
        if (Hora < 12 ){
            println("Bom Dia!")
        }
        // "Boa Tarde" se Hora for maior que 12 e menor que 18
        else if (Hora >= 12 && Hora < 18) {
            println("Boa Tarde!")
        }
        // "Boa Noite" se Hora for maior ou igual a 18
        else if (Hora >= 18){
            println("Boa Noite!")
        }
    }
    Bom_Dia()
}
