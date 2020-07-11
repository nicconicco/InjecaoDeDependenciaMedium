package nicco.com.br.dependencyinjection.fake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nicco.com.br.dependencyinjection.R

class EspressoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espresso)
    }
}