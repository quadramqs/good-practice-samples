package mobi.quadram.qsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import mobi.quadram.qsamples.dii.DaggerExampleComponent
import mobi.quadram.qsamples.dii.Info
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerExampleComponent.create().inject(this)
        val textView = findViewById<TextView>(R.id.text)
        textView.text = info.text
    }
}
