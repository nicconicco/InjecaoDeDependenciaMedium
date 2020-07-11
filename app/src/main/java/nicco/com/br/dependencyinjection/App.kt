package nicco.com.br.dependencyinjection

import android.app.Application
import nicco.com.br.dependencyinjection.dagger_android.di.AppComponent
import nicco.com.br.dependencyinjection.dagger_android.di.DaggerAppComponent


open class App : Application() {
    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent =
        DaggerAppComponent.factory().create(applicationContext)
}