package U3

fun U3_LT_4(){
    val numeros = mutableListOf<Int>()
    var cont = 1
    println("Ingrese los 6 números:")
    try {
        while (cont <= 6){
            print("$cont -> ")
            var num = readln().toInt()
            if (0 < num && num < 50) {
                while (numeros.contains(num)) {
                    println("Ingresa un número no repetido")
                    print("$cont -> ")
                    num = readln().toInt()
                }
                numeros.add(num)
                cont += 1
            }
            else{
                while (0>= num || 50<=num){
                    println("Ingresa un número válido")
                    print("$cont -> ")
                    num = readln().toInt()
                }
                if (0 < num && num < 50){
                    while (numeros.contains(num)) {
                        println("Ingresa un número no repetido")
                        print("$cont -> ")
                        num = readln().toInt()
                    }
                    numeros.add(num)
                    cont += 1
                }
            }
        }
        numeros.sort()
        print("Ingrese el reintegro -> ")
        var reintegro = readln().toInt()
        while (0 > reintegro || 9 < reintegro){
            print("Ingrese un reintegro válido -> ")
            reintegro = readln().toInt()
        }
        numeros.add(reintegro)
        print("Sus númersos de la primitiva son: $numeros")
    }
    catch (_:NumberFormatException){
        print("--ERROR - FORMATO DE ENTRADA NO VÁLIDO--")
    }
}

fun U3_LT_6(){
    val materias = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val aprobadas = mutableListOf<String>()
        try {
            for (materia in materias){
                print("Dime que has sacado en $materia: ")
                val nota = readln().toFloat()
                if (nota >= 5.00) aprobadas.add(materia)
            }
            for (materia in aprobadas) materias.remove(materia)
            print("Tienes que recuperar: $materias")
        }
        catch (_:NumberFormatException){
            print("--ERROR - FORMATO DE ENTRADA NO VÁLIDO--")
        }
}

fun U3_LT_8(){
    print("Ingresa una palabra: ")
    val palabra = readln()
    val palabraR = palabra.reversed()
    if (palabra == palabraR){
        print("Es un palíndromo")
    }
    else{
        print("No es un palíndromo")
    }
}

fun U3_LT_9(){
    print("Dime una palabra: ")
    val palabra = readln().toList()
    val vocales = listOf("a", "e", "i", "o", "u")
    var a = 0
    var e = 0
    var i= 0
    var o = 0
    var u = 0
    for (letra in palabra){
        if (vocales.contains(letra.toString())) {
            if (letra.toString() == "a") a += 1
            if (letra.toString() == "e") e += 1
            if (letra.toString() == "i") i += 1
            if (letra.toString() == "o") o += 1
            if (letra.toString() == "u") u += 1
        }
    }
    println("a -> $a")
    println("e -> $e")
    println("i -> $i")
    println("o -> $o")
    println("u -> $u")
}

fun U3_LT_10(){
    val precios = mutableListOf<Int>(50, 72, 56, 22, 80, 65, 8)
    precios.sort()
    print("El menor precio es de ${precios[0]}€ y el mayor es de ${precios[6]}€")
}

fun U3_LT_13(){
    val lista = mutableListOf<Int>()
    print("¿Cuántos números vas a introducir? -> ")
    val numeros = readln().toInt()
    for (i in 0..numeros){
        print("Escriba el número -> ")
        var num = readln().toInt()
        lista.add(num)
    }
    var cont = 0
    val media = 0
    for (num in lista){
        cont+= num
        var media = cont / numeros
        print("La media es: $media")
    }
}
