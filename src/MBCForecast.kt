class MBCForecast : Observer {
    override fun update(minTemp: Int, maxTemp: Int) {
        println("minTemp: $minTemp / maxTemp: $maxTemp -MBC Forcecast-")
    }
}