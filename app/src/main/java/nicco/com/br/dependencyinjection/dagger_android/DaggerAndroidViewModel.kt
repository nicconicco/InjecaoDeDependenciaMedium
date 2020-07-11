package nicco.com.br.dependencyinjection.dagger_android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import nicco.com.br.dependencyinjection.dagger_android.data.LoginRepository
import javax.inject.Inject

class DaggerAndroidViewModel @Inject constructor(private val repository: LoginRepository) : ViewModel() {
    private val _loginState = MutableLiveData<ViewState>()
    val loginState: LiveData<ViewState>
        get() = _loginState

    fun doLogin() {
        if (repository.doLogin()) {
            _loginState.value = ViewState.Success
        } else {
            _loginState.value = ViewState.Error
        }
    }
}

sealed class ViewState {
    object Success : ViewState()
    object Error : ViewState()
}