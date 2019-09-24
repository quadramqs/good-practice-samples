package mobi.quadram.qsamples

import android.app.Application
import mobi.quadram.qsamples.dii.component.ApplicationComponent
import mobi.quadram.qsamples.dii.component.DaggerApplicationComponent
import mobi.quadram.qsamples.dii.module.ApplicationModule
import mobi.quadram.qsamples.dii.module.FakeRepositoryModule
import mobi.quadram.qsamples.dii.module.RepositoryModule

open class App: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        setup()
    }

    open fun setup() {

        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .repositoryModule(RepositoryModule())
            .build()

        component.inject(this)

    }

}

