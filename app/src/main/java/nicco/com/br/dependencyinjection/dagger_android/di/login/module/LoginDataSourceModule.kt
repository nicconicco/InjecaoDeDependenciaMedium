package nicco.com.br.dependencyinjection.dagger_android.di.login.module

import dagger.Binds
import dagger.Module
import nicco.com.br.dependencyinjection.dagger_android.data.RemoteLoginDataSource
import nicco.com.br.dependencyinjection.dagger_android.data.RemoteLoginDataSourceImp

@Suppress("unused")
@Module
internal abstract class LoginDataSourceModule {

    @Binds
    internal abstract fun bindLoyaltyDataSourceModule(remote: RemoteLoginDataSourceImp): RemoteLoginDataSource
}