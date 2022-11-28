class Car: Vehicle(){
    override val wheels = 4

    override fun move() {
        println("accelerator pedal pressed")
    }
}