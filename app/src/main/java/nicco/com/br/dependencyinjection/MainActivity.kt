package nicco.com.br.dependencyinjection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import nicco.com.br.moduleone.ModuleOneActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            startActivity(Intent(this, ModuleOneActivity::class.java))
        }
    }
}