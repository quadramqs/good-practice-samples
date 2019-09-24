package mobi.quadram.qsamples.ui.main

import mobi.quadram.qsamples.api.Repository

class MainPresenter(val repository: Repository): MainContract.Presenter {

    private lateinit var view: MainContract.View
    private var service: MainContract.Service = MainService(repository)

    override fun clickOnButton() {
        service.getData {
            view.onDataLoad(it)
        }
    }


    override fun attach(view: MainContract.View) {
        this.view = view
    }

}