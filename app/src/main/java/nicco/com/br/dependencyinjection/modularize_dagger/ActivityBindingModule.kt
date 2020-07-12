package nicco.com.br.dependencyinjection.modularize_dagger

import dagger.Module
import dagger.android.ContributesAndroidInjector
import nicco.com.br.dependencyinjection.MainActivity
import nicco.com.br.moduleone.FeatureOneModule
import nicco.com.br.moduleone.ModuleOneActivity
import nicco.com.br.moduletwo.FeatureTwoModule
import nicco.com.br.moduletwo.ModuleTwoActivity

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [FeatureOneModule::class])
    abstract fun moduleOneActivity(): ModuleOneActivity

    @ContributesAndroidInjector(modules = [FeatureTwoModule::class])
    abstract fun moduleTwoActivity(): ModuleTwoActivity
}