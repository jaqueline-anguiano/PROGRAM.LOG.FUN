//  3. Desarrollar una función que reciba una frase y devuelva un diccionario con
//  las palabras que contiene y su longitud.


fun diccionario(frase: String): Map<String, Int> {
    val palabras: MutableMap<String, Int> = mutableMapOf()
    val longitud = listOf(*frase.split(" ".toRegex()).toTypedArray())
    for (i in longitud.indices) {
        palabras[longitud[i]] = longitud[i].length
    }
    return palabras
}

fun main() {
    val frase = "Mi nombre completo es Jaqueline Anguiano Reyes"
    println(diccionario(frase))
}