fun main() {
    val weather = WeatherData()

    weather.attachObserver(KBSForecast())
    weather.attachObserver(SBSForecast())
    weather.attachObserver(MBCForecast())

    weather.setDailyTemp(-6, -4)
    weather.setDailyTemp(-9, 8)
    weather.setDailyTemp(-3, 5)
}