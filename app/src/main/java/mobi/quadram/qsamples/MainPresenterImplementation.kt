package mobi.quadram.qsamples

class MainPresenterImplementation: MainInterface.Presenter {


    lateinit var mainView: MainInterface.View

    override fun changeView() {
        mainView.onViewChanged()
    }

    override fun setView(view: MainInterface.View) {
       this.mainView = view
    }

}