package nicco.com.br.dependencyinjection.dagger_android.di.login.module

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import nicco.com.br.dependencyinjection.dagger_android.DaggerAndroidViewModel

@Suppress("unused")
@Module
internal abstract class LoginViewModelModule {

    @Binds
    internal abstract fun bindLoginViewModelModule(viewModel: DaggerAndroidViewModel): ViewModel
}