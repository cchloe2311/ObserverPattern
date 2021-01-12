class SBSForecast : Observer {
    override fun update(minTemp: Int, maxTemp: Int) {
        println("This is SBS. Min Temperature is $minTemp ans max temperature is $maxTemp")
    }
}