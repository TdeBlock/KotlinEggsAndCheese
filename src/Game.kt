enum class Shape{Blank, Cross, Triangle, Circle, Square }

data class Player(var name: String = "", var shape: Shape = Shape.Blank, var isAndroid: Boolean = false)

val player1 = Player().apply {
    name = "Tom"
    shape = Shape.Circle
    isAndroid = false
}

val player2 = Player().apply {
    name = "Andy"
    shape = Shape.Cross
    isAndroid = true
}

val players: List<Player> = listOf(player1, player2)

val board = Board()

fun main(){
    var activePlayer: Int = 0

    (0..players.lastIndex).forEach{
        println(players[it])
    }
    board.place(players[activePlayer], 1)
    activePlayer = 1
    board.place(players[activePlayer], 2)
    activePlayer = 0
    board.place(players[activePlayer], 4)
    activePlayer = 1
    board.place(players[activePlayer], 8)

    when (checkForWinner()){
        Shape.Circle -> println("Player 1 wins!")
        Shape.Cross -> println("Player 2 wins!")
        else -> println("No one wins!")
    }
}

fun checkForWinner(): Shape{
    //Print all positions on the board
    val positions = board.getPositions()
    (0..positions.lastIndex).forEach {
        println("$it : ${positions[it]}")
    }
    return Shape.Triangle
}

