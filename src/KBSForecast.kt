class KBSForecast : Observer {
    override fun update(minTemp: Int, maxTemp: Int) {
        println("$minTemp°C / $maxTemp°C from KBS")
    }
}