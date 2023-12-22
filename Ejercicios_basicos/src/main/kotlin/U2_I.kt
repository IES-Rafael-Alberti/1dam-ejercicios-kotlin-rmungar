

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

//fun U2_I_8(){
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
//}

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