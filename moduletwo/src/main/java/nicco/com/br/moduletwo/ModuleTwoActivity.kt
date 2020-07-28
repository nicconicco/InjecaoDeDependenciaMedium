package nicco.com.br.moduletwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaelmarhic.quadrant.QuadrantConstants.MODULE_ONE_ACTIVITY
import com.gaelmarhic.quadrant.QuadrantConstants.MODULE_ONE_SCREEN_TWO_ACTIVITY
import com.gaelmarhic.quadrant.QuadrantConstants.MODULE_TWO_ACTIVITY
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

        button.setOnClickListener {
            val intent = Intent()
            intent.setClassName(this, MODULE_ONE_ACTIVITY)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent()
            intent.setClassName(this, MODULE_ONE_SCREEN_TWO_ACTIVITY)
            startActivity(intent)
        }
    }
}