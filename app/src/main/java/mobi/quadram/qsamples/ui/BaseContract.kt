package mobi.quadram.qsamples.ui

class BaseContract {

    interface Presenter<in T> {
        fun attach(view: T)
    }

    interface View {

    }
}