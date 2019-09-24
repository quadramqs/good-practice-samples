package mobi.quadram.qsamples.dii.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import mobi.quadram.qsamples.api.FakeRepositoryImpl
import mobi.quadram.qsamples.api.Repository
import mobi.quadram.qsamples.api.RepositoryImpl
import javax.inject.Singleton

@Module
open class RepositoryModule {

    @Provides
    @Singleton
    open fun provideRepository(app: Application): Repository {
        return RepositoryImpl(app)
    }
}

class FakeRepositoryModule: RepositoryModule() {

    override fun provideRepository(app: Application): Repository {
        return FakeRepositoryImpl()
    }
}