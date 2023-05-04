package com.example.burclaruygulamasi

import android.R
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.palette.graphics.Palette
import com.example.burclaruygulamasi.databinding.ActivityDetayBurcBinding


class DetayBurc : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBurcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBurcBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val position = intent.getIntExtra("tıklanılanOgeDegeri", 0)

        val tumBurcBilgileri = intent.getSerializableExtra("burc") as ArrayList<Burc>


        binding.burcOzellikleri.text = tumBurcBilgileri[position].burcOzellik
        binding.header.setImageResource(tumBurcBilgileri[position].burcBuyukResim)


        setSupportActionBar(binding.animToolbar)
        binding.collapsingToolbar.title = tumBurcBilgileri[position].burcAdi
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val bitmap =
            BitmapFactory.decodeResource(resources, tumBurcBilgileri[position].burcBuyukResim)

        Palette.from(bitmap).generate { palette ->
            val vibrantColor = palette!!.getVibrantColor(R.attr.colorAccent)
            binding.collapsingToolbar.setContentScrimColor(vibrantColor)
            binding.collapsingToolbar.setStatusBarScrimColor(R.attr.colorAccent)

            window.statusBarColor = vibrantColor
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}