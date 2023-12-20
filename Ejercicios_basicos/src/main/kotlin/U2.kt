
fun U2_C_2(){
    val contraseñaGuardada = "rmungar1209"
    var valido = false
    try {
        while (valido == false){
            println("Introduce la contraseña (PULSA ENTER PARA SALIR): ")
            println("--------------------------------------------------")
            val contraseñaIntroducida = readln()
            if (contraseñaIntroducida == contraseñaGuardada) {
                print("CONTRASEÑA CORRECTA")
                valido = true
            }
            if (contraseñaIntroducida == "") valido = true
            else {
                println("CONTRASEÑA INCORRECTA")
                print("--------------------------------------------------")
            }
    }}
    catch (_:Exception) {
        print("--ERROR--")
    }
}

fun U2_C_3(){
    try {
        print("Dame un número: ")
        val num1 = readln().toFloat()
        print("Dame otro número: ")
        val num2 = readln().toFloat()
        if (num2 == 0.toFloat()){
            print("Este número no puede ser 0")
        }
        else{
            print("Resultado = ${num1/num2}")
        }
    }
    catch (_:NumberFormatException) {
        print("--ERROR - FORMATO NO VÁLIDO--")
    }
}

fun U2_C_6(){
    try {
        print("Ingresa el nombre: ")
        val nombre = readln().uppercase()
        print("Ingrese su sexo: ")
        val sexo = readln().uppercase()
        if (sexo == "MUJER" && nombre < "M" || sexo == "HOMBRE" && nombre > "N") print("Perteneces al gurpo A")
        else {
            print("Perteneces al grupo B")
        }
    }
    catch (_:Exception) {
        print("--ERROR--")
    }
}

fun U2_C_8(){
    try {
        print("Ingresa la puntuación del empleado: ")
        val puntuacion = readln().toDouble()
        println("-------------------------------------")
        if (puntuacion == 0.0) print("Su nivel de rendimiento es Inaceptable, no recibirás dinero.")
        if (puntuacion == 0.4) print("Su nivel de rendimiento es Aceptable, recibirás: 960.0€")
        if (puntuacion >= 0.6) print("Su nivel de rendimiento es Meritorio, recibirás: ${2400*puntuacion}€")
    }
    catch (_:NumberFormatException){
        print("--ERROR - FORMATO NO VÁLIDO--")
    }
}

fun U2_C_10(){
    val bas = listOf("Tomate","Mozarella")
    val veganas = listOf("pimiento", "tofu")
    val noVeganas = listOf("peperoni", "jamon", "salmon")
    print("Ingresa el tipo de pizza que quieres (vegetariana o no vegetariana): ")
    val tipo = readln().lowercase()
    if (tipo == "vegetariana"){
        println("Elige uno de los siguientes ingredientes: Pimiento y Tofu ")
        print("¿Cuál de los ingredientes anteriores quieres? ")
        val ingrediente = readln().lowercase()
        if (!veganas.contains(ingrediente)) print("Ese ingrediente no vale")
        else{
            println("Tu pizza tiene: ${bas + ingrediente}")
        }
    }
    if (tipo == "no vegetariana") {
        println("Elige uno de los siguientes ingredientes: Peperoni, Jamon y Salmon")
        print("¿Cuál de los ingredientes anteriores quieres? ")
        val ingrediente = readln().lowercase()
        if (!noVeganas.contains(ingrediente)) print("Ese ingrediente no vale")
        else{
            print("Tu pizza tiene: ${bas + ingrediente}")
        }
    }
    else {
        print("Ese tipo de pizza no lo tenemos")
    }

    if (tipo != "vegetariana" && tipo != "no vegetariana"){
        print("Ese tipo de pizza no vale")
    }
}

fun U2_I_2(){
    print("Dime tu edad: ")
    val edad = readln().toInt()
    val años = listOf("0 ")
    for

}