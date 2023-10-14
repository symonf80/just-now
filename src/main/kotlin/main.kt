
fun main() {
val second = 180

val min = second / 60

val hour = min / 60

println(agoToText(second, min, hour))
}

fun agoToText(second: Int, min: Int, hour: Int): String {

    val ago = when (second) {

       in 0..60 -> "был(а) только что"

        in 61..60*60 -> "был(а) в сети $min ${calcMinute(min)} назад"

        in 60*60+1..24*60*60 -> "был(а) в сети $hour ${calcHour(hour)} назад"

        in 24*60*60+1..24*60*60*2 -> "был(а) в сети вчера"

        in 24*60*60*2+1..24*60*60*3 -> "был(а) в сети позавчера"

        else -> "был(а) в сети давно"
    }
    return ago
}

fun calcMinute(min: Int): String {

    val calcMin = when (min) {

       1, 21, 31, 41, 51 -> "минуту"

        in 2..4 -> "минуты"

        in 22..24 -> "минуты"

        in 32..34 -> "минуты"

        in 42..44 -> "минуты"

        in 52..54 -> "минуты"

        else -> "минут"
    }
    return calcMin
}

fun calcHour(hour: Int): String {

    val calcHours = when (hour) {

        2, 3, 4, 22, 23 -> "часа"

        in 5..20 -> "часов"
        else -> "час"
    }
    return calcHours
}
