package nicco.com.br.dependencyinjection.modularize_dagger

import android.app.Application
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.BindsInstance
import nicco.com.br.core.di.CoreComponent
import nicco.com.br.dependencyinjection.App

@Component(modules = [AppModule::class,
    ActivityBindingModule::class,
    AndroidSupportInjectionModule::class],
    dependencies = [CoreComponent::class]
)
@AppScope
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): AppComponent
    }
}