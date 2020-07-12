package nicco.com.br.core.di

import dagger.Module
import dagger.Provides
import nicco.com.br.core.ExpensiveObject
import javax.inject.Singleton

@Module
class CoreModule {
    @Provides
    @Singleton
    fun provideExpensiveObject(): ExpensiveObject = ExpensiveObject()
}