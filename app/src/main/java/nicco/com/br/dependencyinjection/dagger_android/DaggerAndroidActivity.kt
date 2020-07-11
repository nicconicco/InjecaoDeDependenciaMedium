package nicco.com.br.dependencyinjection.dagger_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import nicco.com.br.dependencyinjection.App
import nicco.com.br.dependencyinjection.R
import nicco.com.br.dependencyinjection.databinding.ActivityDaggerAndroidBinding
import nicco.com.br.dependencyinjection.fake.EspressoActivity
import javax.inject.Inject

class DaggerAndroidActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerAndroidBinding

    @Inject
    lateinit var loginViewModel: DaggerAndroidViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dagger_android)

        (application as App).appComponent.loginComponent().create()
            .inject(this)

        binding.viewmodel = loginViewModel

        loginViewModel.loginState.observe(this, Observer<ViewState> { state ->
            when (state) {
                is ViewState.Success -> {
                    //todo: faz alguma coisa
                }
                is ViewState.Error -> {
                    startActivity(Intent(this, EspressoActivity::class.java))
                }
            }
        })
    }
}