enum class Shape{Blank, Cross, Triangle, Circle, Square }

data class Player(var name: String = "", var shape: Shape = Shape.Blank, var isAndroid: Boolean = false)

fun main(){
    val player1 = Player().apply {
        name = "Tom"
        shape = Shape.Circle
        isAndroid = false
    }

    val player2 = Player().apply {
        name = "Dinges"
        shape = Shape.Cross
        isAndroid = true
    }

    val players: List<Player> = listOf(player1, player2)

    (0..players.lastIndex).forEach{
        println(players[it])
    }

    val board = Board()

    board.place(players[0], 1)
    board.place(players[1], 2)
    val positions = board.getPositions()

    (0..positions.lastIndex).forEach {
        println("$it : ${positions[it]}")
    }

}