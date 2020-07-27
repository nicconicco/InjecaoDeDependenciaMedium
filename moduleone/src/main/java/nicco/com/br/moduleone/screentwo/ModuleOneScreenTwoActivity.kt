package nicco.com.br.moduleone.screentwo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import nicco.com.br.core.FragmentUtils
import nicco.com.br.moduleone.R


class ModuleOneScreenTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_one_screen_two)

        FragmentUtils.replaceFragment(
            R.id.container,
            supportFragmentManager.beginTransaction(),
            ModuleOneFragment.newInstance(),
            ModuleOneScreenTwoActivity::class.java.simpleName
        )
    }
}