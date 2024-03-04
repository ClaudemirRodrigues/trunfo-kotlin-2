import java.io.File

val RESET: String = "\u001b[0m"

val BLACK: String = "\u001b[30m"
val RED: String = "\u001b[31m"
val GREEN: String = "\u001b[32m"
val YELLOW: String = "\u001b[33m"
val BLUE: String = "\u001b[34m"
val MAGENTA: String = "\u001b[35m"
val CYAN: String = "\u001b[36m"
val WHITE: String = "\u001b[37m"

val BRIGHT_BLACK: String = "\u001b[90m"
val BRIGHT_RED: String = "\u001b[91m"
val BRIGHT_GREEN: String = "\u001b[92m"
val BRIGHT_YELLOW: String = "\u001b[93m"
val BRIGHT_BLUE: String = "\u001b[94m"
val BRIGHT_MAGENTA: String = "\u001b[95m"
val BRIGHT_CYAN: String = "\u001b[96m"
val BRIGHT_WHITE: String = "\u001b[97m"

val BACKGROUND_BLACK: String = "\u001b[40m"
val BACKGROUND_RED: String = "\u001b[41m"
val BACKGROUND_GREEN: String = "\u001b[42m"
val BACKGROUND_YELLOW: String = "\u001b[43m"
val BACKGROUND_BLUE: String = "\u001b[44m"
val BACKGROUND_MAGENTA: String = "\u001b[45m"
val BACKGROUND_CYAN: String = "\u001b[46m"
val BACKGROUND_WHITE: String = "\u001b[47m"

val BACKGROUND_BRIGHT_BLACK: String = "\u001b[100m"
val BACKGROUND_BRIGHT_RED: String = "\u001b[101m"
val BACKGROUND_BRIGHT_GREEN: String = "\u001b[102m"
val BACKGROUND_BRIGHT_YELLOW: String = "\u001b[103m"
val BACKGROUND_BRIGHT_BLUE: String = "\u001b[104m"
val BACKGROUND_BRIGHT_MAGENTA: String = "\u001b[105m"
val BACKGROUND_BRIGHT_CYAN: String = "\u001b[106m"
val BACKGROUND_BRIGHT_WHITE: String = "\u001b[107m"

val BOLD: String = "\u001b[1m"
val UNDERLINE: String = "\u001b[4m"
val REVERSED: String = "\u001b[7m"//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

val coresAzulVerde: MutableMap<String, String> = mutableMapOf("BLUE" to "\u001b[34m", "CYAN" to "\u001b[36m", "GREEN" to "\u001b[32m",
    "BRIGHT_GREEN" to "\u001b[92m", "BRIGHT_BLUE" to "\u001b[94m", "BRIGHT_CYAN" to "\u001b[96m")


fun main() {
    menuPrincipal()
}


fun menuPrincipal() {
    println("$BACKGROUND_BRIGHT_BLACK                              $RESET")
    println("$BACKGROUND_BRIGHT_BLACK$BRIGHT_WHITE$BOLD  JOGO DE CARTAS MEGA TRUNFO  $RESET")
    println("$BACKGROUND_BRIGHT_BLACK$CYAN       Versão em Kotlin       $RESET")
    println("$BACKGROUND_BRIGHT_BLACK                              $RESET")

    println("$BACKGROUND_BRIGHT_BLACK $BRIGHT_WHITE${BACKGROUND_WHITE} 1 JOGAR    ${BRIGHT_BLACK}Digite uma das  $BACKGROUND_BRIGHT_BLACK $RESET")
    println("$BACKGROUND_BRIGHT_BLACK $BRIGHT_WHITE$BACKGROUND_BRIGHT_BLACK 2 CRIAR    ${WHITE}opções e aperte $BACKGROUND_BRIGHT_BLACK $RESET")
    println("$BACKGROUND_BRIGHT_BLACK $BRIGHT_WHITE$BACKGROUND_WHITE 3 EDITAR        ${BRIGHT_BLACK}ENTER      $BACKGROUND_BRIGHT_BLACK $RESET")
    println("$BACKGROUND_BRIGHT_BLACK $BRIGHT_WHITE$BACKGROUND_BRIGHT_BLACK 4 SAIR                     $BACKGROUND_BRIGHT_BLACK $RESET")
    println("$BACKGROUND_BRIGHT_BLACK        Menu Principal        $RESET")
    var opcao: String = readln()

    when(opcao) {
        "1" -> jogar()
        "2" -> criar()
        "3" -> editar()
        "4" -> println("Obrigado e até breve!")
        else -> menuPrincipal()
    }
}

fun jogar() {

    val arquivo = File("trunfos")
    val trunfo: String = arquivo.readText()

    println("$BACKGROUND_WHITE$BLACK$BOLD  ESCOLHA UM TRUNFO DA LISTA  $RESET")
    println("$BACKGROUND_WHITE$BRIGHT_WHITE        e vamos jogar!        $RESET\n")

    println("$BRIGHT_GREEN 0 VOLTAR")
    println("$RESET 1 $trunfo\n\n\n\n")
    var opcao: String = readln()

    when(opcao) {
        "0" -> menuPrincipal()
        else -> jogar()
    }
}

fun criar() {

    println("$BACKGROUND_WHITE                              $RESET")
    println("$BACKGROUND_WHITE$BLACK$BOLD  JOGO DE CARTAS MEGA TRUNFO  $RESET")
    println("$BACKGROUND_WHITE$BRIGHT_YELLOW  Crie Novos Jogos e Cartas   $RESET")
    println("$BACKGROUND_WHITE                              $RESET")

    println("$BACKGROUND_WHITE $BRIGHT_WHITE$BACKGROUND_BRIGHT_BLACK 1 CRIAR NOVO JOGO          $BACKGROUND_WHITE $RESET")
    println("$BACKGROUND_WHITE $BRIGHT_WHITE 2 CRIAR NOVA CARTA          $RESET")
    println("$BACKGROUND_WHITE $BRIGHT_WHITE$BACKGROUND_BRIGHT_BLACK 3 VOLTAR                   $BACKGROUND_WHITE $RESET")
    println("$BACKGROUND_WHITE                              $RESET")
    println("$BACKGROUND_BRIGHT_BLACK       Menu de Criação        $RESET")
    var opcao: String = readln()

    when(opcao) {
        "1" -> criarNovoJogo()
        "3" -> menuPrincipal()
        else -> criar()
    }
}

fun criarNovoJogo() {
    val arquivo = File("trunfos")

    println("${BRIGHT_RED}Modo de criação ativado\n${RESET}Digite o nome do novo jogo: (máximo 26 caracteres)")
    var nomeTrunfo: String = readln()
    arquivo.writeText(nomeTrunfo)

    println("Digite a quantidade de atributos: ")
    var quantAtributos: Int = readln().toInt()

    criar()
}

fun editar() {
    println("Modo de edição ativado")
    menuPrincipal()
}