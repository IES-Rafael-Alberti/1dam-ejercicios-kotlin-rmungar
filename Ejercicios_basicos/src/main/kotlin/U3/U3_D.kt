package U3

fun U3_D_3(){
    val fruteria = mapOf("Platano" to 1.35, "Manzana" to 0.80, "Pera" to 0.85, "Naranja" to 0.70)
    print("Elija una fruta: ")
    val fruta = readln()
    if (fruteria.contains(fruta)){
        print("Dime cuantos kilos quieres: ")
        val kilos = readln().toFloat()
        print("Serían: ${kilos * fruteria[fruta]!!}€")
    }
    else{
        print("La fruta $fruta no está en la frutería")
    }
}

fun U3_D_5(){
    val curso = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)
    var creditosT = 0
    for (asignatura in curso) {
        println("${asignatura.key} tiene ${asignatura.value} créditos")
        creditosT += asignatura.value
    }
    print("Hacen un total de $creditosT créditos")
}

fun U3_D_6(){
    var ingreso = true
    var diccionario = mutableMapOf<Any,Any>()
    while (ingreso == true){
        print("Ingrese la clave: ")
        var clave = readln()
        print("Ingrese el valor para la clave anterior: ")
        var valor = readln()
        diccionario[clave]=valor
        println(diccionario)
        print("¿Quieres seguir ampliando el diccionario? (s/n) -> ")
        val cont = readln().lowercase()
        if (cont == "n") ingreso = false
    }
}
