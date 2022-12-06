fun main() {
    println(solution(101))
}

fun solution(n: Int): Int {
    val numberString = n.toString()
    var max = -1
    for (i in numberString.indices) {
        val tempString = numberString.removeRange(i, i + 1)
        println(tempString)
        if (tempString.toInt() > max)
            max = tempString.toInt()
    }
    return max
}