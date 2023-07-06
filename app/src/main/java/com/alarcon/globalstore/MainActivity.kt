package com.alarcon.globalstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alarcon.globalstore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtTexto.text = "Hola Kotlin"
        binding.fabAddProduct.setOnClickListener{
            val intent = Intent(this, AddProductActivity::class.java)
            startActivity(intent)

        }

    }
}
