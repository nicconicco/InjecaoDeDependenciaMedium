package nicco.com.br.moduleone.screentwo

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_module_one.view.*
import nicco.com.br.moduleone.R


class ModuleOneFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_module_one, container, false)

//        view.btn.setOnClickListener {
//            val uri = Uri.parse(getString(R.string.navigation_module_two))
//            findNavController().navigate(uri)
//        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ModuleOneFragment()
    }
}