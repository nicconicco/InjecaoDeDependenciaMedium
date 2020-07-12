package nicco.com.br.moduleone

import dagger.Module
import dagger.Provides

@Module
class FeatureOneModule {
    @Provides
    fun provideString() = "Modulo 1 funcionando com dagger"
}