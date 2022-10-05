// 1. Desarrollar una función que aplique un descuento a un precio y otra que aplique el IVA a un precio.
// Escribir una tercera función que reciba un diccionario con los precios y porcentajes de una cesta de
// la compra, y una de las funciones anteriores, y utilice la función pasada para aplicar los descuentos
// o el IVA a los productos de la cesta y devolver el precio final de la cesta.

import java.math.RoundingMode
import java.text.DecimalFormat


fun descuento(precio: Double, porcentaje: Double) = precio - (precio * porcentaje / 100)

fun iva(precio: Double) = precio + (precio * 0.16)

fun total(cesta: List<Pair<Double, Double>>, dis: (Double, Double) -> Double, iva: (Double) -> Double): Double {

    var total = 0.0
    for (i in cesta.indices) {
        total += iva(dis(cesta[i].first, cesta[i].second))
    }
    return total
}

fun main() {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.HALF_UP
    val cestaa = listOf(
        123.99 to 210.11, 200.0 to 15.50, 5000.99 to 84.0, 9273.35 to 1.0
    )
    println("Total: "+df.format(total(cestaa, { a, b -> descuento(a, b) }, { a -> iva(a) })))

}