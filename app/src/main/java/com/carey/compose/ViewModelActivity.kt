package com.carey.compose

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.carey.compose.databinding.AcViewmodelBinding
import com.carey.compose.viewmodel.CViewModel

class ViewModelActivity : AppCompatActivity() {

    private lateinit var binding: AcViewmodelBinding
    private var count = 0

    private val viewModel by viewModels<CViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = AcViewmodelBinding.inflate(layoutInflater)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat_NoActionBar)
        setContentView(binding.root)
        initView();

    }

//    private fun initView() {
//        binding.oneTvCount.text = count.toString()
//        binding.oneBtnAdd.setOnClickListener {
//            count += 2
//            binding.oneTvCount.text = count.toString()
//        }
//    }

    private fun initView() {
        viewModel.count.observe(this) {
            binding.oneTvCount.text = it.toString()
        }
        binding.oneBtnAdd.setOnClickListener {
            val count = viewModel.count.value ?: 0
            viewModel.onCountChanged(count + 2)
        }
    }
}