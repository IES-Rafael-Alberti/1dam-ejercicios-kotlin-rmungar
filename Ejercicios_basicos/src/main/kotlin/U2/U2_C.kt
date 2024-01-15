package U2
fun U2_C_2(){
    val contraseñaGuardada = "rmungar1209"
    var valido = false
    try {
        while (valido == false){
            println("Introduce la contraseña (PULSA ENTER PARA SALIR): ")
            println("--------------------------------------------------")
            val contraseñaIntroducida = readln()
            if (contraseñaIntroducida == contraseñaGuardada) {
                println("CONTRASEÑA CORRECTA")
                valido = true
            }
            else {
                println("CONTRASEÑA INCORRECTA")
                println("--------------------------------------------------")
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
            println("Este número no puede ser 0")
        }
        else{
            println("Resultado = ${num1/num2}")
        }
    }
    catch (_:NumberFormatException) {
        println("--ERROR - FORMATO NO VÁLIDO--")
    }
}

fun U2_C_6(){
    try {
        print("Ingresa el nombre: ")
        val nombre = readln().uppercase()
        print("Ingrese su sexo: ")
        val sexo = readln().uppercase()
        if (sexo == "MUJER" && nombre < "M" || sexo == "HOMBRE" && nombre > "N") println("Perteneces al gurpo A")
        else {
            println("Perteneces al grupo B")
        }
    }
    catch (_:Exception) {
        println("--ERROR--")
    }
}

fun U2_C_8(){
    try {
        print("Ingresa la puntuación del empleado: ")
        val puntuacion = readln().toDouble()
        println("-------------------------------------")
        if (puntuacion == 0.0) println("Su nivel de rendimiento es Inaceptable, no recibirás dinero.")
        if (puntuacion == 0.4) println("Su nivel de rendimiento es Aceptable, recibirás: 960.0€")
        if (puntuacion >= 0.6) println("Su nivel de rendimiento es Meritorio, recibirás: ${2400*puntuacion}€")
    }
    catch (_:NumberFormatException){
        println("--ERROR - FORMATO NO VÁLIDO--")
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
