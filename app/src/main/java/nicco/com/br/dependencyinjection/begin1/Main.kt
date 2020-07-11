package nicco.com.br.dependencyinjection.begin1

fun main(args: Array<String>) {
    // Sem injecao nativa
    val car = Car()
    car.start()

    // Com Injecao nativa
    val engine =
        Engine()
    val carInjected =
        CarInjectedNative(
            engine
        )
    carInjected.start()
}