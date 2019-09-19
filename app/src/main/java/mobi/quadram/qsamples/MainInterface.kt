package mobi.quadram.qsamples

interface MainInterface {
    interface View {
        fun onViewChanged()
    }
    interface Presenter {
        fun changeView()
        fun setView(view: MainInterface.View)
    }
}