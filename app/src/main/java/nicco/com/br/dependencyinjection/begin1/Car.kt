package nicco.com.br.dependencyinjection.begin1

class Car {
    private val engine =
        Engine()

    fun start() {
        engine.start()
    }
}