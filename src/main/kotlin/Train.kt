class Train(override val wheels: Int) : Vehicle(), Moveable {
    override val speed: Double = 300.0

    override fun move() {
        println("charcoal ignites!")
    }

    override fun info() {
        TODO("Not yet implemented")
    }
}