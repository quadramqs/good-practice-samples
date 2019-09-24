package mobi.quadram.qsamples.ui.main

import mobi.quadram.qsamples.api.Repository
import mobi.quadram.qsamples.ui.BaseContract

interface MainContract {

    interface View: BaseContract.View {
        fun onDataLoad(str: String)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun clickOnButton()
    }

    interface Service {
        fun getData(callback: (string: String) -> Unit)
    }
}