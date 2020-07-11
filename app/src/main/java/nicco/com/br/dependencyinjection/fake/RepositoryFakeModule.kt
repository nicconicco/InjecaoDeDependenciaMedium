package nicco.com.br.dependencyinjection.fake

import dagger.Binds
import dagger.Module
import nicco.com.br.dependencyinjection.dagger_android.data.LoginRepository
import nicco.com.br.dependencyinjection.fake.LoginRepositoryFakeImp

// Overrides StorageModule in android tests
@Module
abstract class RepositoryFakeModule {

    // Makes Dagger provide FakeStorage when a Storage type is requested
    @Binds
    abstract fun provideRepositoryFake(repositoryFake: LoginRepositoryFakeImp): LoginRepository
}