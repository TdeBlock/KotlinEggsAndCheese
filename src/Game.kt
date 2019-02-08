enum class Shape{Blank, Cross, Triangle, Circle, Square }

data class Player(var name: String = "", var shape: Shape = Shape.Blank, var isAndroid: Boolean = false)

fun main(){
    val player1 = Player().apply {
        name = "Tom"
        shape = Shape.Circle
        isAndroid = false}

    val player2 = Player().apply {
        name = "Dinges"
        shape = Shape.Cross
        isAndroid = true
    }

    var players: List<Player> = listOf(player1, player2)

    (0..players.lastIndex).forEach{
        println(players[it])
    }
}