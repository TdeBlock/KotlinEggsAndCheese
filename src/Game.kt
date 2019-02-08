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
    var activePlayer = 0

    (0..players.lastIndex).forEach{
        println(players[it])
    }
    board.place(players[activePlayer], 0)
    activePlayer = 1
    board.place(players[activePlayer], 8)
    activePlayer = 0
    board.place(players[activePlayer], 1)
    activePlayer = 1
    board.place(players[activePlayer], 7)
    activePlayer = 0
    board.place(players[activePlayer], 3)
    println(checkForWinner(board.getPositions()))
}

fun checkForWinner(positions: List<Shape>): Player? {
    var winningShape: Shape
    var winningPlayer: Player? = null
    if(positions[0] == positions[1] && positions[1] == positions[2] ){winningShape = positions[0]}
    else winningShape = Shape.Blank

    (0..players.lastIndex).forEach {
        when (players[it].shape){
            winningShape -> winningPlayer = players[it]
            //else -> winningPlayer = null
        }
    }
    return winningPlayer
}


