class Board {

    private val positions: MutableList<Shape> = mutableListOf(
        Shape.Blank,
        Shape.Blank,
        Shape.Blank,
        Shape.Blank,
        Shape.Blank,
        Shape.Blank,
        Shape.Blank,
        Shape.Blank,
        Shape.Blank)

    fun place(player: Player, position: Int): List<Shape>{
        positions[position] =  player.shape
        println("$player set ${player.shape} to position $position")
        return positions
    }

    fun getPositions(): List<Shape>{
        return positions
    }
}