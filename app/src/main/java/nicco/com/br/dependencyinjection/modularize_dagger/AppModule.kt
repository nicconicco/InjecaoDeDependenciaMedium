package nicco.com.br.dependencyinjection.modularize_dagger

import dagger.Module
import dagger.Provides
import nicco.com.br.core.OtherObject

@Module
class AppModule {
    @Provides
    fun provideOtherObject() = OtherObject()
}