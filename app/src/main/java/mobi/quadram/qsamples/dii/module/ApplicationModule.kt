package mobi.quadram.qsamples.dii.module

import android.app.Application
import dagger.Module
import dagger.Provides
import mobi.quadram.qsamples.App
import javax.inject.Singleton

@Module
class ApplicationModule(private val baseApp: App) {

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return baseApp
    }
}