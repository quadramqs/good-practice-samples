package mobi.quadram.qsamples.api

import dagger.Provides

interface Repository {
    fun getData(): String
    fun setData(str: String)
}