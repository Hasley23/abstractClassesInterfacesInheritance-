abstract class Vehicle{
    abstract val wheels: Int

    open fun info(){
        println("Number of wheels - $wheels")
    }

    abstract fun move()
}