package nicco.com.br.dependencyinjection.begin1

class CarInjectedNative(private val engine: Engine) {
    fun start() {
        engine.start()
    }
}