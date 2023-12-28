fun U2_E_2() {
    var cadena = "1, "
    var cont = 1
    try {
        print("Dame un número: ")
        val num = readln().toInt()
        if (num < 1) throw Exception ("El número no puede ser menor que 1")
        else {
            if (num == 1 || num == 2) print("1")
            else {
                while (cont < num -1){
                    cont += 2
                    if (cont < num -1){
                        cadena += "$cont, "
                    }
                    else {
                        cadena += ""
                    }
                }
                print(cadena + num)
            }
        }
    }
    catch (_:NumberFormatException){
        print("--ERROR - FORMATO DE ENTRADA NO VÁLIDO--")
    }
    catch (e:Exception){
        print(e)
    }
}

fun U2_E_3(){
    print("Dame un número: ")
    var cadena = ""
    var num = readln().toInt()
    try {
        if (num < 1){
            throw Exception ("--ERROR - EL NÚMERO NO PUEDE SER MENOR QUE 1--")
        }
        else {
            while (num >= 0) {
                if (num != 0) {
                    cadena += "$num, "
                } else {
                    cadena += "$num"
                }
                num -= 1
            }
            print(cadena)
        }
    }
    catch (e:NumberFormatException){
        print("--ERROR - FORMATO DE ENTRADA NO VÁLIDO--")
    }
    catch (e:Exception){
        print(e)
    }
}

fun U2_E_4(){
    print("Dame un número: ")
    try {
        val num = readln().toInt()
        print(num+1)
    }
    catch (_:NumberFormatException){
        print("--ERROR - FORMATO DE ENTRADA NO VÁLIDO--")
    }
}