package nicco.com.br.dependencyinjection.dagger_android.di.login.module

import dagger.Binds
import dagger.Module
import nicco.com.br.dependencyinjection.dagger_android.data.LoginRepository
import nicco.com.br.dependencyinjection.dagger_android.data.LoginRepositoryImp

@Suppress("unused")
@Module
internal abstract class LoginRepositoryModule {

    @Binds
    internal abstract fun bindLoginRepositoryModule(repository: LoginRepositoryImp): LoginRepository
}