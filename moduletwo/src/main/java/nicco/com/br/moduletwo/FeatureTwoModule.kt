package nicco.com.br.moduletwo

import dagger.Module
import dagger.Provides

@Module
class FeatureTwoModule {
    @Provides
    fun provide2String() = "Modulo 2 funcionando com dagger"
}