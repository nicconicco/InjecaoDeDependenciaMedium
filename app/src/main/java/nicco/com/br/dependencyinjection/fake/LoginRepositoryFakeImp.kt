package nicco.com.br.dependencyinjection.fake

import nicco.com.br.dependencyinjection.dagger_android.data.LoginRepository
import nicco.com.br.dependencyinjection.dagger_android.data.RemoteLoginDataSource
import javax.inject.Inject

class LoginRepositoryFakeImp @Inject constructor(
    private val remoteLoginDataSource: RemoteLoginDataSource
) : LoginRepository {
    override fun doLogin(): Boolean {
        return false
    }
}