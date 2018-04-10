package myapps.camforyou

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_user_details.*

class UserDetailsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_details,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString(FormFragment.KET_NAME) ?: ""
        val town = arguments?.getString(FormFragment.KET_HOMETOWN) ?: ""
        val age = arguments?.getInt(FormFragment.KET_AGE) ?: 0

        userdDetailsText.text="Welcome $name. You are in $town and your age is $age"

        startOverButton.setOnClickListener{
            fragmentManager?.popBackStack()


        }


    }
}