package nicco.com.br.dependencyinjection.base

import nicco.com.br.dependencyinjection.App
import nicco.com.br.dependencyinjection.dagger_android.di.AppComponent
import nicco.com.br.dependencyinjection.fake.DaggerTestAppComponent

class MyTestApplication : App() {

    override fun initializeComponent(): AppComponent {
        // Creates a new TestAppComponent that injects fakes types
        return DaggerTestAppComponent.create()
    }
}