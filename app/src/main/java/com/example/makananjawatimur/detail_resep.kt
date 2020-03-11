package com.example.makananjawatimur

package com.example.makananjawatimur

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
            var judul1 = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)

            var resep = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)

            judul.text = judul1=
            Picasso.get().load(intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)).into(gambar)
            desk.text = resep
        }
    }

}