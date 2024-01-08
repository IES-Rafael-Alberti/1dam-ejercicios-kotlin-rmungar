package U3
import limpiarconsola

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
    try {
        var ingreso = true
        val diccionario = mutableMapOf<Any,Any>()
        while (ingreso){
            print("Ingrese la clave: ")
            val clave = readln()
            print("Ingrese el valor para la clave anterior: ")
            val valor = readln()
            diccionario[clave]=valor
            println(diccionario)
            print("¿Quieres seguir ampliando el diccionario? (s/n) -> ")
            val cont = readln().lowercase()
            if (cont == "n") ingreso = false
        }
    }
    catch (_:Exception){
        print("--ERROR--")
    }
}

fun U3_D_7(){
    val listaCompra = mutableMapOf("Articulo" to "precio")
    var ingreso = true
    var cont = 1
    var total = 0.00
    while (ingreso){
        print("Artículo $cont -> ")
        val clave = readln().lowercase()
        print("Ingrese el preico de $clave -> ")
        val valor = readln().toFloat()
        listaCompra[clave] = valor.toString()
        total += valor
        print("¿Terminar? (s/n) -> ")
        cont += 1
        val terminar = readln().lowercase()
        if (terminar == "s") {
            ingreso = false
            print("El total es: $total €")
        }
    }
}
fun U3_D_8(){
    val diccionario = mutableMapOf<String, String>()
    var resultado = ""
    print("Ingrese palabra:traduccion separados por comas -> ")
    val palabras = readln().lowercase()
    val ingresos = palabras.split(", ")
    for (item in ingresos){
        val palabra = item.split(":")
        diccionario[palabra[0]] = palabra[1]
    }

    print("Ahora ingrese una frase para traducir -> ")
    val frase = readln().lowercase()
    val Frase = frase.split(" ")
    for (palabra in Frase){
        if(!diccionario.contains(palabra)){
            resultado += "$palabra "
        }
        else{
            resultado += "${diccionario[palabra]} "
        }
    }
    print(resultado)
}


fun U3_D_10(){
    val funcionar = true
    val base_datos = mutableMapOf<Any, Any>()
    fun mostrarmenu(){
        println("-------------MENU-------------")
        println("1. Añadir cliente")
        println("2. Eliminar cliente")
        println("3. Mostrar cliente")
        println("4. Listar todos los clientes")
        println("5. Listar clientes preferentes")
        println("6. Terminar")
        println("------------------------------")
    }
    fun agregarcliente(){
        val cliente = mutableMapOf<Any, Any>()
        print("Ingrese el NIF del cliente: ")
        val nif = readln()
        print("Ingrese el nombre del cliente: ")
        val nombre = readln()
        print("Ingrese la dirección del cliente: ")
        val direccion = readln()
        print("Ingrese el telefono del cliente: ")
        val telefono = readln()
        print("Ingrese el correo del cliente: ")
        val correo = readln()
        print("¿Es cliente preferente? (s/n) -> ")
        var preferente = readln().lowercase()
        if (preferente == "s"){
            preferente = "Sí"
        }
        else {
            preferente = "No"
        }

        cliente["Nombre"]=nombre
        cliente["Dirección"]=direccion
        cliente["Telefono"]=telefono
        cliente["Correo"]=correo
        cliente["Preferente"]=preferente
        base_datos[nif]=cliente
        println("Cliente: $nombre añadido correctamente")
    }
    fun eliminarcliente(){
        print("Ingrese el NIF del cliente que desea eliminar -> ")
        val nif = readln()
        if (base_datos.contains(nif)) {
            base_datos.remove(nif)
            print("Cliente con nif $nif elminado correctamente")
        }
        else{
            print("No se encontró un cliente con NIF $nif en la base de datos")
        }
    }
    fun mostrarcliente(){
        print("Ingrese el NIF del cliente que desea mostrar -> ")
        val nif = readln()
        val cliente = base_datos.get(nif)
        if (base_datos.containsKey(nif)){
            print("---DATOS DEL CLIENTE---")
            print(nif)
            print(cliente)
        }
    }
    fun listarclientes(){
        print("--Listado de todos los clientes--")
        for (nif in base_datos){
            print(nif)
        }
    }

    while (funcionar) {
        mostrarmenu()
        print("Ingrese una opción -> ")
        val opcion = readln().toInt()
        if (opcion == 1) {
            agregarcliente()
            limpiarconsola()
        }
        if (opcion == 2) {
            eliminarcliente()
            limpiarconsola()
        }
        if (opcion == 3) {
            mostrarcliente()
            limpiarconsola()
        }
        if (opcion == 4) {
            listarclientes()
            limpiarconsola()
        }
        //if (opcion == 5) {
        //  listarclientespreferentes()
        //  limpiarconsola()
        //}
        if (opcion == 6) {
            print("--PROGRAMA FINALIZADO--")
            break
        }
    }
}

fun U3_D_11(){
    try {
        val lineas = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
        val datos = lineas.split("\n")
        val datosC = datos[0].split(";")
        val clientela = mutableMapOf<Any, Any>()
        for (i in datos){
            val cliente = mutableMapOf<Any, Any>()
            val info = i.split(";")
            for (j in 1..(datosC.size)){
                if (datosC[j]=="descuento"){
                    info[j].toFloat()
                }
                cliente[datosC[j]] = info[j]
            }
            clientela[info[0]] = cliente
            print(clientela)
        }
    }
    catch (_:NumberFormatException){
        print("--ERROR--")
    }
}