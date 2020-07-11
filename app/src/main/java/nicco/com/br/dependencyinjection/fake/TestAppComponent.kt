package nicco.com.br.dependencyinjection.fake

import dagger.Component
import nicco.com.br.dependencyinjection.dagger_android.di.AppComponent
import nicco.com.br.dependencyinjection.dagger_android.di.AppSubcomponents
import nicco.com.br.dependencyinjection.dagger_android.di.login.module.LoginDataSourceModule
import nicco.com.br.dependencyinjection.dagger_android.di.login.module.LoginViewModelModule
import nicco.com.br.dependencyinjection.fake.RepositoryFakeModule
import javax.inject.Singleton

@Singleton
// Includes RepositoryFakeModule that overrides objects provided in StorageModule
@Component(modules = [
    RepositoryFakeModule::class,
    AppSubcomponents::class,
    LoginViewModelModule::class,
    LoginDataSourceModule::class])
interface TestAppComponent : AppComponent