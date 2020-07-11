package nicco.com.br.dependencyinjection.dagger

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import io.mockk.every
import io.mockk.mockk
import nicco.com.br.dependencyinjection.dagger_android.DaggerAndroidViewModel
import nicco.com.br.dependencyinjection.dagger_android.ViewState
import nicco.com.br.dependencyinjection.dagger_android.data.LoginRepository
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class LoginViewModelTest {

    @get:Rule
    val instantTask = InstantTaskExecutorRule()

    private val loginRepository = mockk<LoginRepository>()

    private lateinit var viewModel: DaggerAndroidViewModel

    @Before
    fun setup() {
        viewModel = DaggerAndroidViewModel(loginRepository)
    }

    @Test
    fun whenViewModel_call_doLogin_asnwer_trueResponse() {
        prepareScenario(true)
        viewModel.doLogin()
        assert(viewModel.loginState.value is ViewState.Success)
    }

    @Test
    fun whenViewModel_call_doLogin_asnwer_falseResponse() {
        prepareScenario(false)
        viewModel.doLogin()
        assert(viewModel.loginState.value is ViewState.Error)
    }

    private fun prepareScenario(value: Boolean) {
        // Para ter como material de ajuda, quando algum método apenas você precisa passar.
//        every { loginRepository.someOtherMethodWithoutResponse() } just runs
        every { loginRepository.doLogin() } returns value
    }
}