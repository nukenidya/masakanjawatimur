package com.example.makananjawatimur

import kotlinx.android.synthetic.main.resep.*

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_resep.*

class detail_resep : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_resep)

        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var gambar2 = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT,0)
            var judul2 = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var resep = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)

            gambar.setImageResource(gambar2)
            judul.text = judul2
            desk.text = resep
        }
    }

}