package nicco.com.br.moduleone.screentwo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import nicco.com.br.core.FragmentUtils
import nicco.com.br.moduleone.R


class ModuleOneScreenTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_one_screen_two)

//        val host = NavHostFragment.create(R.navigation.nav_module_one)
//        supportFragmentManager.beginTransaction().replace(R.id.container, host).setPrimaryNavigationFragment(host).commit()

        FragmentUtils.replaceFragment(
            R.id.container,
            supportFragmentManager.beginTransaction(),
            ModuleOneFragment.newInstance(),
            ModuleOneScreenTwoActivity::class.java.simpleName
        )
    }
}