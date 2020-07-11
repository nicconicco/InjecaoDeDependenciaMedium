package nicco.com.br.dependencyinjection.begin2

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CarStep2Test {

    private lateinit var car: Car

    @Test
    fun Car_ShowFerrariModel() {
        car = Car(Ferrari())
        assertEquals(car.showModelCar(), "Meu modelo é uma Ferrari")
    }

    @Test
    fun Car_ShowMercedes() {
        car = Car(Mercedes())
        assertEquals(car.showModelCar(), "Meu modelo é uma Mercedes")
    }
}