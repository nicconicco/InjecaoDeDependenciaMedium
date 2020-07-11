package nicco.com.br.dependencyinjection.dagger_android.data

interface RemoteLoginDataSource {
    fun doLoginRemote() : Boolean
}