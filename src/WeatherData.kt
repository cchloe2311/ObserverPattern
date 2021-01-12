class WeatherData: Subject {
    private val observers: MutableList<Observer> = mutableListOf()

    private var minTemp: Int = 0
    private var maxTemp: Int = 0

    override fun attachObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun dettachObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(minTemp, maxTemp)
        }
    }

    fun setDailyTemp(minTemp: Int, maxTemp: Int) {
        this.minTemp = minTemp
        this.maxTemp = maxTemp

        onDailyTempChanged()
    }

    private fun onDailyTempChanged() {
        notifyObservers()
    }
}