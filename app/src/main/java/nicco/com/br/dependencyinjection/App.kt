package nicco.com.br.dependencyinjection

import nicco.com.br.core.di.CoreComponentProvider
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import nicco.com.br.core.di.CoreComponent
import nicco.com.br.core.di.DaggerCoreComponent
import nicco.com.br.dependencyinjection.modularize_dagger.DaggerAppComponent


open class App : DaggerApplication(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .application(this)
            .coreComponent(provideCoreComponent())
            .build()
    }

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .build()
        }
        return coreComponent
    }
}