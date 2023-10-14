
fun main() {
val second = 180

val min = second / 60

val hour = min / 60

println(agoToText(second, min, hour))
}

fun agoToText(second: Int, min: Int, hour: Int): String {

    val ago = when (second) {

        in 0..60 -> "���(�) ������ ���"

        in 61..60*60 -> "���(�) � ���� $min ${calcMinute(min)} �����"

        in 60*60+1..24*60*60 -> "���(�) � ���� $hour ${calcHour(hour)} �����"

        in 24*60*60+1..24*60*60*2 -> "���(�) � ���� �����"

        in 24*60*60*2+1..24*60*60*3 -> "���(�) � ���� ���������"

        else -> "���(�) � ���� �����"
    }
    return ago
}

fun calcMinute(min: Int): String {

    val calcMin = when (min) {

        1, 21, 31, 41, 51 -> "������"

        in 2..4 -> "������"

        in 22..24 -> "������"

        in 32..34 -> "������"

        in 42..44 -> "������"

        in 52..54 -> "������"

        else -> "�����"
    }
    return calcMin
}

fun calcHour(hour: Int): String {

    val calcHours = when (hour) {

        2, 3, 4, 22, 23 -> "����"

        in 5..20 -> "�����"
        else -> "���"
    }
    return calcHours
}