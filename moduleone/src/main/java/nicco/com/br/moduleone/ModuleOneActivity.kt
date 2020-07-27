package nicco.com.br.moduleone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.gaelmarhic.quadrant.QuadrantConstants.MODULE_TWO_ACTIVITY
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_module_one.*
import nicco.com.br.core.ExpensiveObject
import nicco.com.br.core.FragmentUtils
import nicco.com.br.moduleone.screentwo.ModuleOneFragment
import nicco.com.br.moduleone.screentwo.ModuleOneScreenTwoActivity
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

        button.setOnClickListener {
            val intent = Intent()
            intent.setClassName(this, MODULE_TWO_ACTIVITY)
            startActivity(intent)
        }

        button2.setOnClickListener {
            FragmentUtils.replaceFragment(
                R.id.container,
                supportFragmentManager.beginTransaction(),
                ModuleOneFragment.newInstance(),
                ModuleOneScreenTwoActivity::class.java.simpleName
            )
        }
    }
}