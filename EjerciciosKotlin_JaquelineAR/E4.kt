// 4. Desarrollar una función reciba un diccionario con las asignaturas y las notas
// de un alumno y devuelva otro diccionario con las asignaturas en mayúsculas y las
// calificaciones correspondientes a las notas: 95-100(excelente), 85-94(Notable),
// 75-84(Bueno), 70-74(Suficiente)  <70(Desempeño insuficiente).

fun main() {
    val materias: Map<String, Double> = mapOf(
        "ingles" to 90.0, "programación movil" to 50.0, "programación web i" to 80.7,
        "taller de investigación" to 94.1, "act complementaria v" to 70.0,
        "programación lógica" to 69.9, "estructura de datos" to 88.0, "gestion proyectos software" to 100.0
    )
    println(calificaciones(materias))

}

fun calificaciones(calif: Map<String, Double>): Map<String, String> {
    val desemp: MutableMap<String, String> = mutableMapOf()
    for ((i, j) in calif) {
        val a = when (j) {
            in 0.0..69.0 -> "Desempeño insuficiente"
            in 70.0..74.0 -> "Suficiente"
            in 75.0..84.0 -> "Bueno"
            in 85.0..94.0 -> "Notable"
            in 95.0..100.0 -> "Excelente"
            else -> " "
        }
        desemp[i.uppercase()] = a
    }
    return desemp
}


