import kotlin.math.ceil

/**
 * La función ej4 nos va a pedir un número para convertirlo a fahrenheit y controla la excepción en caso de que el input
 * no sea un número
 */
fun ej4(){
    try {
        print("Ingrese un número: ")
        val num = readln().toFloat()
        val fahrenheit = (num * 9/5 +32)
        print("La temperatura sería $fahrenheit grados.")
    }
    catch (_:NumberFormatException){
        print("--ERROR > FORMATO NO VÁLIDO--")
    }
}

/**
 * La función ej6 nos pedirá un precio con IVA incluido y nos devolverá dos Floats, uno que indica el IVA y otro
 * que indica el precio sin IVA
 */
fun ej6(){
    try {
        print("Ingrese el precio con IVA: ")
        val precio = readln().toFloat()
        val iva = precio * 0.10
        val siniva = precio - iva
        println("El IVA es $iva")
        println("Precio sin iva: $siniva")
    }
    catch (_:NumberFormatException){
        print("--ERROR > FORMATO NO VÁLIDO--")
    }
}

/**
 * La función ej12 nos pide que ingresemos dos números para realizar opreaciones con ellos y devolver un float
 * redondeado hacía arriba.
 */
fun ej12(){
    try {
        print("Dime tu peso: ")
        val peso = readln().toFloat()
        print("Dime tu altura en cms: ")
        val altura = readln().toFloat() / 100
        val imc = ceil(peso/(altura*altura))
        println("Tu índice de masa corporal es: $imc")

    }
    catch (_:NumberFormatException){
        print("--ERROR > FORMATO NO VÁLIDO--")
    }
}

/**
 * La funcion ej15 pide que el usuario ingrese un número para que esta cantidad aumente por cada vez que se ejecute
 * un bucle.
 */
fun ej15() {
    try {
        print("Ingrese su capital: ")
        var capital = readln().toFloat()
        var cont = 1
        do {
            capital = (capital + (capital * 0.04)).toFloat()
            println("En el año $cont, el capital sería: $capital")
            cont += 1

        }
        while (cont != 4)
    }
    catch (_:NumberFormatException){
        print(("--ERROR > FORMATO NO VÁLIDO--"))
    }
}

/**
 * La función ej18 pedirá una cadena al usuario y la retornará de 3 formas distintas.
 */
fun ej18(){
    try {
        print("Introduce tu nombre: ")
        val nombre = readln().lowercase()
        println(nombre.lowercase())
        println(nombre.uppercase())
        println(nombre)
    }
    catch (e:Exception){
        println("--ERROR--")
    }
}

fun ej20(){
    try {
        print("Ingrese un número de teléfono con el siguiente formato +34-XXXXXXXXX-YY: ")
        val telf = readln().split("-")
        println(telf[1])

    }
    catch (_:Exception){
        println("--ERROR--")
    }
}

fun ej21(){
    try {
        print("Ingrese una frase: ")
        val frase = readln()
        print(frase.reversed())
    }
    catch (_:Exception){
        print("--ERROR--")
    }
}

fun ej22(){
    try {
        print("Ingrese una frase: ")
        val frase: String = readln().lowercase()
        print("Ingrese una vocal: ")
        val vocal: String = readln().lowercase()
        print(frase.replace(vocal, vocal.uppercase()))
    }
    catch (_:Exception){
        print("--ERROR--")
    }
}

fun ej24(){
    try {
        print("Ingrese el precio serparado por '.': ")
        val precio = readln().split(".")
        if (precio[1] != ""){
            print("Serían ${precio[0]} euros y ${precio[1]} céntimos")}
        else{
            print("Serían ${precio[0]} euros y 0 céntimos")
        }
    }
    catch (_:Exception){
        print("--ERROR--")
    }

}

fun ej25(){
    print("Ingrese su fecha de nacimiento con el formato dd/mm/aaaa: ")
    val fecha = readln().split("/")
    val dia: Int = fecha[0].toInt()
    val mes: Int = fecha[1].toInt()
    val año: Int = fecha[2].toInt()
    print("Día $dia del $mes del $año")
}