package nicco.com.br.dependencyinjection.begin2

class Car(private val model: Engine) {
    fun showModelCar() = model.getModel()
}