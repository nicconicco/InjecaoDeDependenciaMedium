package nicco.com.br.dependencyinjection.dagger_android.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteLoginDataSourceImp @Inject constructor() : RemoteLoginDataSource {
    override fun doLoginRemote(): Boolean {
        return true
    }
}