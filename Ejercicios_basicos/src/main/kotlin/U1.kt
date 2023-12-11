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
        print("--ERROR FORMATO NO VÁLIDO--")
    }
}

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
        print("--ERROR FORMATO NO VÁLIDO--")
    }
}

fun ej12(){
    try {
        print("Dime tu peso: ")
        val peso = readln().toFloat()
        println("Dime tu altura en cms: ")
        val altura = readln().toFloat() / 100
        val imc = (peso/altura)

    }
}