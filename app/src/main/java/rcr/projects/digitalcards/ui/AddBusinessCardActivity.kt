package rcr.projects.digitalcards.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import rcr.projects.digitalcards.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {
    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener(){
        binding.btnConfirm.setOnClickListener {  }
        binding.btnClose.setOnClickListener { finish() }
    }
}