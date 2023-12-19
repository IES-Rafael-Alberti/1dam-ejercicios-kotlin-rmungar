
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
    print("Ingresa el nombre: ")
    val nombre = readln().uppercase()
    print("Ingrese su sexo: ")
    val sexo = readln().uppercase()
    if (sexo == "MUJER" && nombre < "M" || sexo == "HOMBRE" && nombre > "N") print("Perteneces al gurpo A")
    else {
        print("Perteneces al grupo B")
    }
}