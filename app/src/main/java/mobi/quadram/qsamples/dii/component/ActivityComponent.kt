package mobi.quadram.qsamples.dii.component

import dagger.Component
import dagger.Subcomponent
import mobi.quadram.qsamples.ui.main.MainActivity
import mobi.quadram.qsamples.dii.module.ActivityModule

@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)

}