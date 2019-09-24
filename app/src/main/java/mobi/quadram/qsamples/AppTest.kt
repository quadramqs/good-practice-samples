package mobi.quadram.qsamples

import mobi.quadram.qsamples.dii.component.DaggerApplicationComponent
import mobi.quadram.qsamples.dii.module.ApplicationModule
import mobi.quadram.qsamples.dii.module.FakeRepositoryModule

class AppTest: App() {
    /*
    Este es el módulo de Application que reemplazamos para testing.
    En el, hemos cambiado el repositoryModule por uno fake para tener los datos
    que queramos estáticos.
     */

    override fun setup() {
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .repositoryModule(FakeRepositoryModule())
            .build()

        component.inject(this)
    }


}