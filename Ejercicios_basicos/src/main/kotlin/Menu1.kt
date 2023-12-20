fun menu1() {

    val lista = listOf("Ejercicio 4","Ejercicio 6", "Ejercicio 12", "Ejercicio 15", "Ejercicio 18", "Ejercicio 20", "Ejercicio 21", "Ejercicio 22", "Ejercicio 24", "Ejercicio 25", "Ejercicio 26", "Ejercicio 27")
    val ejercicios = listOf(4, 6, 12, 15, 18, 20, 21, 22, 24, 25, 26, 27)
    var querer = "s"

    while (querer != "n") {
        println("Lista de ejercicios de la unidad 1")
        println("----------------------------------")
        for (ejercicio in lista) println("- $ejercicio")
        println("----------------------------------")
        print("Introduce el número del ejercicio que quieras ver, Diego -> ")
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