package nicco.com.br.core

import android.app.Activity
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

object FragmentUtils {
    fun replaceFragment(
        container: Int,
        transaction: FragmentTransaction,
        fragment: Fragment,
        tag: String
    ) {
        transaction.setCustomAnimations(
            android.R.animator.fade_in, android.R.animator.fade_out
        )
        transaction.replace(container, fragment)
        transaction.addToBackStack(tag)
        transaction.commit()
    }

}