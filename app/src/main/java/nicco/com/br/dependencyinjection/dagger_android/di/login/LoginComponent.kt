package nicco.com.br.dependencyinjection.dagger_android.di.login

import dagger.Subcomponent
import nicco.com.br.dependencyinjection.dagger_android.DaggerAndroidActivity

// Definition of a Dagger subcomponent
@Subcomponent
interface LoginComponent {

    // Factory to create instances of LoginComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: DaggerAndroidActivity)
}