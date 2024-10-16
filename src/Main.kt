import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Seleccione la escala de origen de la temperatura:")
    println("1. Celsius a Fahrenheit")
    println("2. Kelvin a Celsius")
    println("3. Fahrenheit a Kelvin")
    val opcion = scanner.nextInt()

    when (opcion) {
        1 -> { // Celsius a Fahrenheit
            print("Ingrese la temperatura en Celsius: ")
            val celsius = scanner.nextDouble()
            val fahrenheit = (9.0 / 5.0) * celsius + 32
            println("La temperatura en Fahrenheit es: ${String.format("%.2f", fahrenheit)} °F")
        }
        2 -> { // Kelvin a Celsius
            print("Ingrese la temperatura en Kelvin: ")
            val kelvin = scanner.nextDouble()
            val celsius = kelvin - 273.15
            println("La temperatura en Celsius es: ${String.format("%.2f", celsius)} °C")
        }
        3 -> { // Fahrenheit a Kelvin
            print("Ingrese la temperatura en Fahrenheit: ")
            val fahrenheit = scanner.nextDouble()
            val kelvin = (5.0 / 9.0) * (fahrenheit - 32) + 273.15
            println("La temperatura en Kelvin es: ${String.format("%.2f", kelvin)} K")
        }
        else -> {
            println("Opción no válida. Por favor, seleccione una opción correcta.")
        }
    }
}