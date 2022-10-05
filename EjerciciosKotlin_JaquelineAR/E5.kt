// 5. Desarrollar  una función que calcule el módulo de un vector

import java.text.DecimalFormat
import kotlin.math.sqrt
import java.math.RoundingMode
import kotlin.math.pow

fun main() {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.HALF_UP

    val v1 = Triple(11.9, 8.3, -2.6)
    val v2 = Pair(650.8, -9.3)

    println("Vector 1, módulo3D: "+df.format(modulo3D(v1)))
    println("Vector 2, módulo2D: "+df.format(modulo2D(v2)))
}

fun modulo3D(v: Triple<Double, Double, Double>) = sqrt(v.first.pow(2.0) + v.second.pow(2.0) + v.third.pow(2.0))
fun modulo2D(v: Pair<Double, Double>) = sqrt(v.first.pow(2.0) + v.second.pow(2.0))