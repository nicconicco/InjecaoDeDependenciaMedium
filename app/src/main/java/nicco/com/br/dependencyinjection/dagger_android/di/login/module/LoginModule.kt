package nicco.com.br.dependencyinjection.dagger_android.di.login.module

import dagger.Module

@Module(
    includes = [
        LoginViewModelModule::class,
        LoginRepositoryModule::class,
        LoginDataSourceModule::class
    ]
)
abstract class LoginModule