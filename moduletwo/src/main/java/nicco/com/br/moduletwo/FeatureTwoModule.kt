package nicco.com.br.moduletwo

import dagger.Module
import dagger.Provides

@Module
class FeatureTwoModule {
    @Provides
    fun provideString() = "Modulo 2 funcionando com dagger"
}