package mobi.quadram.qsamples.dii

import dagger.Component
import mobi.quadram.qsamples.MainActivity

@Component
interface ExampleComponent {
    fun inject(app: MainActivity)
}