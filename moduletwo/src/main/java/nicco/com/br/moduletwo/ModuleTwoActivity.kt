package nicco.com.br.moduletwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_module_two.*
import nicco.com.br.core.ExpensiveObject
import javax.inject.Inject

class ModuleTwoActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    @Inject
    lateinit var text: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_two)

        textView2.text = text

        button2.setOnClickListener {
            val intent = Intent()
            intent.setClassName(this, "nicco.com.br.moduleone.ModuleOneActivity")
            startActivity(intent)
        }
    }
}