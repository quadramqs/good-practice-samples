package mobi.quadram.qsamples.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import mobi.quadram.qsamples.App
import mobi.quadram.qsamples.R
import mobi.quadram.qsamples.dii.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onDataLoad(str: String) {
        textView.text = str
    }

    @Inject
    lateinit var presenter: MainContract.Presenter

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text)
        findViewById<Button>(R.id.button).setOnClickListener {
            presenter.clickOnButton()
        }
        injectThis()
        presenter.attach(this)
    }

    private fun injectThis() {
        (application as App).component.plus(ActivityModule())
            .inject(this)

    }
}
