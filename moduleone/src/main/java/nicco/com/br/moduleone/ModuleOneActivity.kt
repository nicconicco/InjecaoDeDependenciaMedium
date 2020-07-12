package nicco.com.br.moduleone

import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_module_one.*
import nicco.com.br.core.ExpensiveObject
import javax.inject.Inject


class ModuleOneActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    @Inject
    lateinit var text: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_one)

        textView.text = text

        val intent = Intent()
        intent.setClassName(this, "nicco.com.br.moduletwo.ModuleTwoActivity")
        startActivity(intent)
    }
}