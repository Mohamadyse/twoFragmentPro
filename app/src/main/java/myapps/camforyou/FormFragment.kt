package myapps.camforyou

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_form.*

class FormFragment : Fragment() {
    companion object {
        const val KET_NAME="name"
        const val KET_HOMETOWN="hormtown"
        const val KET_AGE="age"
    }




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_form,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        confirmButton.setOnClickListener {
            val name = nameField.text.toString()
            val hometown = homeTownField.text.toString()
            val age = ageField.text.toString().toInt()



            val arguments = Bundle()
            arguments.putString(KET_NAME, name)
            arguments.putString(KET_HOMETOWN, hometown)
            arguments.putInt(KET_AGE, age)


            val userDetailsFragment = UserDetailsFragment()
            userDetailsFragment.arguments=arguments


            fragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.container, userDetailsFragment)
                    ?.addToBackStack(null)
                    ?.commit()

        }

    }
}