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

    fun place(player: Player, position: Int){
        positions[position] =  player.shape
        println("$player set ${player.shape} to position $position")
    }

    fun getPositions(): List<Shape>{
        return positions
    }
}