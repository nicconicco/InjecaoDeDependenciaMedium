package nicco.com.br.core.di

import dagger.Component
import nicco.com.br.core.ExpensiveObject
import javax.inject.Singleton

@Component(modules = [CoreModule::class])
@Singleton
interface CoreComponent {
    fun getExpensiveObject(): ExpensiveObject
}