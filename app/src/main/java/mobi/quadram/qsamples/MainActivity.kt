package mobi.quadram.qsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import mobi.quadram.qsamples.dii.DaggerExampleComponent
import mobi.quadram.qsamples.dii.Info
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainInterface.View {

    @Inject
    lateinit var info: Info

    lateinit var presenter: MainInterface.Presenter
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerExampleComponent.create().inject(this)
        textView = findViewById(R.id.text)
        presenter = MainPresenterImplementation()
        textView.text = info.text
        findViewById<Button>(R.id.button).setOnClickListener {
            presenter.changeView()
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.setView(this)
    }

    override fun onViewChanged() {
        textView.text = info.secondText
    }
}
