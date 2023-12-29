import U1.*
import U2.*

fun menu1() {
    val lista = listOf("Ejercicio 4","Ejercicio 6", "Ejercicio 12", "Ejercicio 15", "Ejercicio 18", "Ejercicio 20", "Ejercicio 21", "Ejercicio 22", "Ejercicio 24", "Ejercicio 25", "Ejercicio 26", "Ejercicio 27")
    val ejercicios = listOf(4, 6, 12, 15, 18, 20, 21, 22, 24, 25, 26, 27)
    var querer = "s"

    while (querer != "n") {
        println("Lista de ejercicios de la unidad 1")
        println("----------------------------------")
        for (ejercicio in lista) println("- $ejercicio")
        println("----------------------------------")
        print("Introduce el número del ejercicio que quieras ver -> ")
        try {
            val valor = readln().toInt()
            if (valor == 4) U1_4()
            if (valor == 6) U1_6()
            if (valor == 12) U1_12()
            if (valor == 15) U1_15()
            if (valor == 18) U1_18()
            if (valor == 20) U1_20()
            if (valor == 21) U1_21()
            if (valor == 22) U1_22()
            if (valor == 24) U1_24()
            if (valor == 25) U1_25()
            if (valor == 26) U1_26()
            if (valor == 27) U1_27()
            if (!ejercicios.contains(valor)) throw NumberFormatException("aips")

        } catch (_: NumberFormatException) {
            println("Ese ejercicio no está aquí")
        }
        println("----------------------------------")
        print("¿Quieres buscar otro? (s/n) -> ")

        querer = readln().lowercase()
        if (querer != "n") limpiarconsola()
    }
}

fun menu2(){
    val condicionales = listOf("Ejercicio 2", "Ejercicio 3", "Ejercicio 6", "Ejercicio 8", "Ejercicio 10")
    val ejerciciosC = listOf(2, 3, 6, 8, 10)
    val iterativas = listOf("Ejercicio 2", "Ejercicio 4", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Ejercicio 13", "Ejercicio 15", "Ejercicio 18", "Ejercicio 19", "Ejercicio 25")
    val ejerciciosI = listOf(2, 4, 6, 7, 8, 13, 15, 18, 19, 25)
    val excepciones = listOf("Ejercicio 2", "Ejercicio 3", "Ejercicio 4")
    val ejerciciosE = listOf(2, 3, 4)
    var querer = "s"

    println("Que ejercicios quieres ver:")
    println("1 - Condicionales")
    println("2 - Iterativas")
    println("3 - Excepciones")
    print("-> ")
    val tipo = readln().toInt()
    if (tipo == 1) {
        while (querer != "n") {
            println("Lista de ejercicios de condicionales")
            println("------------------------------------")
            for (ejercicio in condicionales) println("- $ejercicio")
            println("------------------------------------")
            print("Introduce el número del ejercicio que quieras ver -> ")
            try {
                val valor = readln().toInt()
                if (valor == 2) U2_C_2()
                if (valor == 3) U2_C_3()
                if (valor == 6) U2_C_6()
                if (valor == 8) U2_C_8()
                if (valor == 10) U2_C_10()
                if (!ejerciciosC.contains(valor)) throw NumberFormatException("aips")
            } catch (_: NumberFormatException) {
                println("Ese ejercicio no está aquí")
            }
            println("------------------------------------")
            print("¿Quieres buscar otro? (s/n) -> ")
            querer = readln().lowercase()
            if (querer != "n") limpiarconsola()
        }
    }
     else if (tipo == 2) {
        while (querer != "n") {
            println("Lista de ejercicios de iterativas")
            println("---------------------------------")
            for (ejercicio in iterativas) println("- $ejercicio")
            println("---------------------------------")
            print("Introduce el número del ejercicio que quieras ver -> ")
            try {
                val valor = readln().toInt()
                if (valor == 2) U2_I_2()
                if (valor == 4) U2_I_4()
                if (valor == 6) U2_I_6()
                if (valor == 7) U2_I_7()
                if (valor == 8) U2_I_8()
                if (valor == 10) U2_C_10()
                if (valor == 13) U2_I_13()
                if (valor == 15) U2_I_15()
                if (valor == 18) U2_I_18()
                if (valor == 19) U2_I_19()
                if (valor == 25) U2_I_25()
                if (!ejerciciosI.contains(valor)) throw NumberFormatException("aips")
            } catch (_: NumberFormatException) {
                println("Ese ejercicio no está aquí")
            }
            println("----------------------------------")
            print("¿Quieres buscar otro? (s/n) -> ")
            querer = readln().lowercase()
            if (querer != "n") limpiarconsola()
        }
    }
    if (tipo == 3) {
        while (querer != "n") {
            println("Lista de ejercicios de excepciones")
            println("----------------------------------")
            for (ejercicio in excepciones) println("- $ejercicio")
            println("----------------------------------")
            print("Introduce el número del ejercicio que quieras ver -> ")
            try {
                val valor = readln().toInt()
                if (valor == 2) U2_E_2()
                if (valor == 3) U2_E_3()
                if (valor == 4) U2_E_4()
                if (!ejerciciosE.contains(valor)) throw NumberFormatException("aips")
            } catch (_: NumberFormatException) {
                println("Ese ejercicio no está aquí")
            }
            println("----------------------------------")
            print("¿Quieres buscar otro? (s/n) -> ")
            querer = readln().lowercase()
            if (querer != "n") limpiarconsola()
        }
    }
    else{
        print("Ese no es un tipo de ejercicios de esta unidad")
    }
}