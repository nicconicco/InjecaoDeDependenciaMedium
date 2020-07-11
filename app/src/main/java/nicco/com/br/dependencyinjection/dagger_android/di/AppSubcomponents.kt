package nicco.com.br.dependencyinjection.dagger_android.di

import dagger.Module
import nicco.com.br.dependencyinjection.dagger_android.di.login.LoginComponent

@Module(
    subcomponents = [
        LoginComponent::class
    ]
)
class AppSubcomponents