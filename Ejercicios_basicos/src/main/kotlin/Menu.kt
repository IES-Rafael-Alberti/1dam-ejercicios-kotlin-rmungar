import U1.*
import U2.*
import U3.*

fun menu1() {
    val lista = listOf("Ejercicio 4","Ejercicio 6", "Ejercicio 12", "Ejercicio 15", "Ejercicio 18", "Ejercicio 20", "Ejercicio 21", "Ejercicio 22", "Ejercicio 24", "Ejercicio 25", "Ejercicio 26", "Ejercicio 27")
    val ejercicios = listOf(0, 4, 6, 12, 15, 18, 20, 21, 22, 24, 25, 26, 27)
    var querer = "s"

    while (querer != "n") {
        println("Lista de ejercicios de la unidad 1")
        println("----------------------------------")
        for (ejercicio in lista) println("- $ejercicio")
        println("----------------------------------")
        print("Introduce el número del ejercicio que quieras ver -> ")
        try {
            val valor = readln().toInt()
            if (valor == 0) break
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
    val ejerciciosC = listOf(0, 2, 3, 6, 8, 10)
    val iterativas = listOf("Ejercicio 2", "Ejercicio 4", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Ejercicio 13", "Ejercicio 15", "Ejercicio 18", "Ejercicio 19", "Ejercicio 25")
    val ejerciciosI = listOf(0, 2, 4, 6, 7, 8, 13, 15, 18, 19, 25)
    val excepciones = listOf("Ejercicio 2", "Ejercicio 3", "Ejercicio 4")
    val ejerciciosE = listOf(0, 2, 3, 4)
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
                if (valor == 0) break
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
                if (valor == 0) break
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
                if (valor == 0) break
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

fun menu3(){
    val listas_y_tuplas = listOf("Ejercicio 4", "Ejercicio 6", "Ejercicio 8", "Ejercicio 9", "Ejercicio 10", "Ejercicio 13")
    val ejerciciosLT = listOf(0, 4, 6, 8, 9, 10, 13)
    val diccionarios = listOf("Ejercicio 3", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Ejercicio 10", "Ejercicio 11")
    val ejerciciosD = listOf(0, 3, 5, 6, 7, 8, 10, 11)
    val conjuntos = listOf("Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6")
    val ejerciciosC = listOf(0, 1, 2, 3, 4, 5, 6)
    var querer = "s"

    println("Que ejercicios quieres ver:")
    println("1 - Listas y Tuplas")
    println("2 - Diccionarios")
    println("3 - Conjuntos")
    print("-> ")
    val tipo = readln().toInt()
    if (tipo == 1) {
        while (querer != "n") {
            println("Lista de ejercicios de listas y tuplas")
            println("--------------------------------------")
            for (ejercicio in listas_y_tuplas) println("- $ejercicio")
            println("--------------------------------------")
            print("Introduce el número del ejercicio que quieras ver -> ")
            try {
                val valor = readln().toInt()
                if (valor == 0) break
                if (valor == 4) U3_LT_4()
                if (valor == 6) U3_LT_6()
                if (valor == 8) U3_LT_8()
                if (valor == 9) U3_LT_9()
                if (valor == 10) U3_LT_10()
                if (valor == 13) U3_LT_13()
                if (!ejerciciosLT.contains(valor)) throw NumberFormatException("aips")
            } catch (_: NumberFormatException) {
                println("Ese ejercicio no está aquí")
            }
            println("--------------------------------------")
            print("¿Quieres buscar otro? (s/n) -> ")
            querer = readln().lowercase()
            if (querer != "n") limpiarconsola()
        }
    }
    else if (tipo == 2) {
        while (querer != "n") {
            println("Lista de ejercicios de diccionarios")
            println("-----------------------------------")
            for (ejercicio in diccionarios) println("- $ejercicio")
            println("-----------------------------------")
            print("Introduce el número del ejercicio que quieras ver -> ")
            try {
                val valor = readln().toInt()
                if (valor == 0) break
                if (valor == 3) U3_D_3()
                if (valor == 5) U3_D_5()
                if (valor == 6) U3_D_6()
                if (valor == 7) U3_D_7()
                if (valor == 8) U3_D_8()
                if (valor == 10) U3_D_10()
                if (valor == 11) U3_D_11()
                if (!ejerciciosD.contains(valor)) throw NumberFormatException("aips")
            } catch (_: NumberFormatException) {
                println("Ese ejercicio no está aquí")
            }
            println("------------------------------------")
            print("¿Quieres buscar otro? (s/n) -> ")
            querer = readln().lowercase()
            if (querer != "n") limpiarconsola()
        }
    }
    if (tipo == 3) {
        while (querer != "n") {
            println("Lista de ejercicios de conjuntos")
            println("--------------------------------")
            for (ejercicio in conjuntos) println("- $ejercicio")
            println("--------------------------------")
            print("Introduce el número del ejercicio que quieras ver -> ")
            try {
                val valor = readln().toInt()
                if (valor == 0) break
                if (valor == 1) U3_C_1()
                if (valor == 2) U3_C_2()
                if (valor == 3) U3_C_3()
                if (valor == 4) U3_C_4()
                if (valor == 5) U3_C_5()
                if (valor == 6) U3_C_6()
                if (!ejerciciosC.contains(valor)) throw NumberFormatException("aips")
            } catch (_: NumberFormatException) {
                println("Ese ejercicio no está aquí")
            }
            println("--------------------------------")
            print("¿Quieres buscar otro? (s/n) -> ")
            querer = readln().lowercase()
            if (querer != "n") limpiarconsola()
        }
    }
    else{
        print("Ese no es un tipo de ejercicios de esta unidad")
    }
}

fun general(){
    val ingreso = true
    println("------Menú------")
    println("----UNIDADES----")
    println("1 - Unidad 1")
    println("2 - Unidad 2")
    println("3 - Unidad 3")
    println("0 - Salir")
    println("----------------")
    while (ingreso) {
        try {
            print("¿Qué unidad deseas ver? -> ")
            val ud = readln().toInt()
            if (ud == 1) {
                menu1()
            }
            if (ud == 2) {
                menu2()
            }
            if (ud == 3) {
                menu3()
            }
            if (ud == 0){
                break
            }
            else {
                print("Esa unidad no está")
            }
        } catch (_: NumberFormatException) {
            println("Esa unidad no está aquí")
        }
    }
}