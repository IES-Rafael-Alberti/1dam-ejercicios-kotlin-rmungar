package U2

fun U2_I_2(){
    try {
        var cont = 0
        print("Dime tu edad: ")
        val edad = readln().toInt()

        var cadena = "0 "
        while (cont < edad){
            cont += 1
            cadena += ("$cont ")
        }
        print(cadena)
    }
   catch (_:NumberFormatException){
        print("--ERROR - FORMATO NO VÁLIDO--")
   }
}

fun U2_I_4(){
    var cadena = ""
    print("Dame un número: ")
    try {
        var num = readln().toInt()
        while (num >= 0){
            if (num != 0){
                cadena += ("$num, ")
            }
            else{
                cadena += num
            }
            num -= 1
        }
        print(cadena)
    }
    catch (_:NumberFormatException){
        print("--ERROR - FORMATO NO VÁLIDO--")
    }
}

fun U2_I_6(){
    print("Dame un número: ")
    try {
        val num = readln().toInt()
        if (num == 0) print("El número no puede ser 0")
        else{
            for (i in 1..num ){
                for (j in 1..i){
                    print("* ")
                }
                println()
            }
        }
    }
    catch (_:NumberFormatException){
        print("--ERROR - FORMATO NO VÁLIDO--")
    }
}

fun U2_I_7(){
    var cont = 1
    while (cont <= 10){
        for (numero in 1..10)
            println("$numero * $cont = ${numero * cont}")
        cont += 1
    }
}

fun U2_I_8(){
//  print("Dame un número: ")
//  try {
//      val num = readln().toInt()
//      for (i in 1 until num+1 step 2){
//          for (j in i until 0 step 2){
//              print("${num + j} ")
//          }
//          println()
//      }
//  }
//  catch (_:NumberFormatException){
//      print("--ERROR - FORMATO NO VÁLIDO--")
//  }
}

fun U2_I_13(){
    var vali = 0
    while (vali == 0) {
        print("Dime algo: ")
        val eco = readln()
        if (eco != "") println(eco)
        else{
            vali = 1
        }
    }
}


fun U2_I_15() {
    var positivos = 0
    print("Dame un número: ")
    try {
        var entrada = readln().toInt()
        while (entrada != 0) {
            if (entrada > 0) {
                positivos += 1
                print("Dame otro número: ")
                entrada = readln().toInt()
            } else {
                print("Dame otro número: ")
                entrada = readln().toInt()
            }
        }
        print("Números positivos introducidos: $positivos")
    }
    catch (_:NumberFormatException){
        println("--ERROR - FORMATO NO VÁLIDO--")
        print("Números positivos introducidos: $positivos")
    }
}

fun U2_I_18(){
//    print("Dame un número (-1 finaliza el programa): ")
//    val num = readln().toInt()
//    var pares = 0
//    while (num != -1){
//      var total = 0
//      if (num%2 == 0) pares += 1
//      while (num != 0) {
//          val d1 = num%10
//          total += d1
//      }
//  }
}

fun U2_I_19(): String {
    print(" 1 - COMENZAR PROGRAMA")
    println(" 2 - IMPRIMIR TEXTO")
    println(" 3 - FINALIZAR PROGRAMA")
    print("Ingrese una opcion: ")
    try {
        var opcion = readln().toInt()
        while (opcion != 3){
            if (opcion == 1){
                print("INICIO")
                print("Ingrese ua opcion: ")
                opcion = readln().toInt()
            }
            else {
                print("Spiderman 2 GOTY")
                print("Ingrese ua opcion: ")
                opcion = readln().toInt()
            }
        }
        return ("FIN")
    }
    catch (_:NumberFormatException){
        return ("--ERROR - OPCIÓN NO VÁLIDA--")
    }
}

fun U2_I_25(){
    print("Ingrese la frase: ")
    val frase = readln().split(" ")
    var Lmayor = 0
    var Pmayor = ""
    var cont = 0
    for (palabra in frase){
        if (palabra != "") cont += 1
        if (palabra.length > Lmayor) {
            Lmayor = palabra.length
            Pmayor = palabra
        }
    }
    println("La palabra más larga es: $Pmayor con $Lmayor caracteres.")
    print("Se ingresaron $cont palabras.")

}


