package mobi.quadram.qsamples.dii.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import mobi.quadram.qsamples.api.Repository
import mobi.quadram.qsamples.ui.main.MainContract
import mobi.quadram.qsamples.ui.main.MainPresenter

@Module
class ActivityModule {

    @Provides
    fun providePresenter(repository: Repository): MainContract.Presenter {
        return MainPresenter(repository)
    }

}