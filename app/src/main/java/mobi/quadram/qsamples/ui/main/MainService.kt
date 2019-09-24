package mobi.quadram.qsamples.ui.main

import mobi.quadram.qsamples.api.Repository

class MainService(private val repository: Repository): MainContract.Service {

    override fun getData(callback: (string: String) -> Unit) {
        callback.invoke(repository.getData())
    }

}