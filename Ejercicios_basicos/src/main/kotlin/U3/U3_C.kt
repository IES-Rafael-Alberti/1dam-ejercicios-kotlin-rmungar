package U3

fun U3_C_1(){
    val domicilio = mutableSetOf<Any>()
    //val factura = listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"), ("Jorge Russo", 7, 699, "Mirasol 218"), ("Nuria Costa", 7, 532.90, "Calle Las Flores 355"), ("Julián Rodriguez", 12, 5715.99, "La Mancha 761"), ("Jorge Russo", 15, 958, "Mirasol 218"))
}
fun U3_C_2(){
    val alumnosPrimaria = mutableSetOf<Any>()
    val alumnosSecundaria = mutableSetOf<Any>()
    fun pedirNombresPrimaria() {
        var ingreso = true
        while (ingreso) {
            print("Introduzca el nombre del alumno de primaria: ")
            val nombre = readln()
            alumnosPrimaria.add(nombre)
            if (nombre == "x" || nombre == "X") {
                ingreso = false
            }
        }
    }
    fun pedirNombresSecundaria(){
        var ingreso = true
        while (ingreso){
            print("Introduzca el nombre del alumno de secundaria: ")
            val nombre = readln()
            alumnosSecundaria.add(nombre)
            if (nombre == "x" || nombre == "X"){
                ingreso = false
            }
        }
    }
    fun mostrarTodo(){
        alumnosPrimaria.remove("x")
        alumnosSecundaria.remove("x")
        val totalAlumnos = mutableSetOf<Any>(alumnosPrimaria.union(alumnosSecundaria))
        print(totalAlumnos)
    }
}
fun U3_C_3(){}
fun U3_C_4(){}
fun U3_C_5(){}
fun U3_C_6(){}