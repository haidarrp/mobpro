package ac.id.telkomuniversity.praassessment;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import ac.id.telkomuniversity.praassessment.databinding.ActivityMainBinding
import ac.id.telkomuniversity.praassessment.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataBindingUtil.setContentView(R.layout.activity_main,)

        val navController = this.findNavController(R.id.frameLayout)
        NavigationUI.setupActionBarWithNavController(this, navController)
        }

        override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.frameLayout)
        return navController.NavigateUp()
        }


        }
