package nicco.com.br.dependencyinjection.dagger_android.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import nicco.com.br.dependencyinjection.dagger_android.di.login.LoginComponent
import nicco.com.br.dependencyinjection.dagger_android.di.login.module.LoginModule
import javax.inject.Singleton

@Singleton
// Definition of a Dagger component that adds info from the different modules to the graph
@Component(modules = [AppSubcomponents::class, LoginModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun loginComponent(): LoginComponent.Factory
}