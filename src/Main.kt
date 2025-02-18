fun main() {

    var age: Int = 0
    var cityName: String? = "New York"
    cityName = null
    println(cityName?.length)
    val nameLength = cityName?.length ?: 0
    println(nameLength)
    var score = null
    printScoreDec(score)

}

fun printScoreDec(score: Double?) {
    val length = score?.dec() ?: "No score provided"
    if (score != null) {
        println("The score is ${score.dec()}")
    }
}
