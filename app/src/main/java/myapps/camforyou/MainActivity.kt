package myapps.camforyou

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState==null){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container,FormFragment())
                    .commit()
        }
    }

}
