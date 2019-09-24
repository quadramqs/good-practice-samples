package mobi.quadram.qsamples.dii.component

import dagger.Component
import mobi.quadram.qsamples.App
import mobi.quadram.qsamples.dii.module.ActivityModule
import mobi.quadram.qsamples.dii.module.ApplicationModule
import mobi.quadram.qsamples.dii.module.FakeRepositoryModule
import mobi.quadram.qsamples.dii.module.RepositoryModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, RepositoryModule::class])
interface ApplicationComponent {

    fun inject(application: App)
    fun plus(activityModule: ActivityModule): ActivityComponent

}
