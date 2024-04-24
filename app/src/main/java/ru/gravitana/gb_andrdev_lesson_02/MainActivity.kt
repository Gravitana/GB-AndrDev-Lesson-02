package ru.gravitana.gb_andrdev_lesson_02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gravitana.gb_andrdev_lesson_02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.upperText.text = getString(R.string.upper_text, this.localClassName)
        binding.secondText.text = getString(R.string.second_text, this.localClassName)
    }
}