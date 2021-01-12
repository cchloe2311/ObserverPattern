interface Subject {
    fun attachObserver(observer: Observer)
    fun dettachObserver(observer: Observer)
    fun notifyObservers()
}