package com.example.makananjawatimur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createresep()
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = adapter_resep(data,{ resepItem : data_resep -> resepItemClicked(resepItem) })


    }
    private fun resepItemClicked(resepItem : data_resep) {
        val showDetailActivityIntent = Intent (this, detail_resep::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, resepItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, resepItem.gambar)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, resepItem.resep)
        startActivity(showDetailActivityIntent)
    }
    private fun createresep() : List<data_resep> {
        val rvlist = ArrayList<data_resep>()
        rvlist.add(
            data_resep(
            "Soto Madura","Bahan :\n" +
                "ayam kampung segar ± 500 gr\n" +
                "air 1 liter\n" +
                "bawang merah besar 1 buah, haluskan\n" +
                "bawang putih 4 buah, haluskan\n" +
                "daun jeruk 5 lembar\n" +
                "jahe ½ jari , keprek\n" +
                "merica bulat 10 butir, haluskan\n" +
                "sereh 1 buah\n" +
                "Pelengkap :\n" +
                "bawang goring\n" +
                "daun bawang\n" +
                "jeruk lemon\n" +
                "soun\n" +
                "sambel\n" +
                "Cara membuat :\n" +
                "Tumis bumbu halus sampai harum kemudian tambahkan daun jeruk, dan sereh\n" +
                "Masukkan potongan ayam dan tambahkan airnya, masak sampai ayam benar benar matang dan air berkurang hampir ½ .\n" +
                "Suwir ayam dalam kuah soto dan sajikan dengan pelengkapnya\n"
                ,"https://kuliner.ilmci.com/wp-content/uploads/2011/06/Soto-Madura-330x248.jpg"))
        rvlist.add(
            data_resep(
                "Getuk Lindri","Bahan : \n" +
                    "250 gr gula pasir\n" +
                    "150 ml air\n" +
                    "1 sdt vanilli\n" +
                    "1 kg singkong, dikupas dan dikukus, buang seratnya\n" +
                    "½ butir kelapa, parut\n" +
                    "Gula pasir secukupnya untuk taburan\n" +
                    "Garam secukupnya untuk taburan\n" +
                    "Pewarna merah, kuning dan hijau\n" +
                    "Cara membuat :\n" +
                        " Rebus air dan gula, masukkan vanilli, bagi menjadi 3 bagian masing-masing beri pewarna.\n" +
                        " Tumbuk atau giling singkong kukus yang masih panas bersama setengah bagian dari kelapa parut tadi hingga halus\n" +
                        " Sesudah halus, bagi adonan singkong menjadi 3 bagian, masing-masing bagian dituangi dengan larutan gula yang telah diberi pewarna sedikit demi sedikit hingga tercampur rata.\n" +
                        " Sesudah rata, masukkan adonan ke dalam gilingan daging. Giling dan potong-potong sepanjang kira-kira 5 cm.\n" +
                        " Hidangkan getuk lindri ini dengan sisa kelapa parut yang telah diberi sedikit gula pasir dan garam.\n"
                        ,"https://kuliner.ilmci.com/wp-content/uploads/2010/05/GetukLindri-253x300.jpg")
        )
        rvlist.add(
            data_resep("Weci (Khas Malang)","Bahan : \n" +
                    "175 gr tepung terigu\n" +
                    "2 butir telur ayam\n" +
                    "500 ml air\n" +
                    "3 buah wortel, parut kasar menggunakan parutan keju\n" +
                    "1 genggam kecambah\n" +
                    "¼ bagian kubis, iris panjang\n" +
                    "2 buah bawang perei\n" +
                    "1 batang seledri\n" +
                    "2 buah daun bawang\n" +
                    "2 siung bawang putih, dicincang halus\n" +
                    "Garam secukupnya\n" +
                    "Gula secukupnya\n" +
                    "Merica secukupnya\n" +
                    "Minyak untuk menggoreng.\n" +
                    "Cara Membuat : \n" +
                    "1.  Campur wortel, kecambah, kubis, bawang perei, daun bawang, seledri, bawang putih cincang, aduk kasar\n" +
                    "2.  Tambahkan tepung dan telur, aduk hingga rata\n" +
                    "3.  Tambahkan air, hingga adonan cukup kental\n" +
                    "4.  Beri gula, garam, dan merica secukupnya sesuai selera\n" +
                    "5.  Panaskan minyak, beri sedikit minyak pada cetakan lalu tuang adonan dan goreng\n" +
                    "6.  Angkat jika weci sudah bewarna kecoklatan\n" +
                    "7.  Weci siap disajikan.\n" +
                    ,"http://kuliner.ilmci.com/wp-content/uploads/2015/03/weci.jpg")
        )
        rvlist.add(
           data_resep("Sate Ayam Ponorogo","Bahan : \n "+
                   "ayam fillet 500 gram\n" +
                   "tusuk sate secukupnya\n" +

                    "Bumbu : \n" +
                   "kunyit 2 ruas\n" +
                   "bawang putih 5 siung\n" +
                   "bawang merah 5 butir\n" +
                   "ketumbar 1 sendok teh\n" +
                   "jahe 1 ruas, memarkan\n" +
                   "garam 1 sendok teh\n" +
                   "serai 1 batang, memarkan\n" +
                   "minyak goreng 25 ml\n" +
                    "Cara Membuat : \n" +
                   "Haluskan kunyit, bawang putih, bawang merah, dan ketumbar. Sisihkan.\n" +
                   "Tumis bumbu yang sudah dihaluskan. Masukkan jahe, garam, dan serai. Masak hingga matang.\n" +
                   "Masak daging ayam selama 10 menit, tiriskan.\n" +
                   "Tusukkan masing-masing daging ayam pada tusuk sate, lalu bakar di atas bara api.\n" +
                   "Sajikan dengan sambal kecap dan lontong.\n" +
               ,"http://kuliner.ilmci.com/wp-content/uploads/2011/04/Sate-Ayam-Ponorogo.jpg")
        )
        rvlist.add(
            data_resep("Lontong Kupang","Bahan : \n "+
                    "500 gr kupang (sejenis tiram / kerang kecil) yang telah dibersihkan\n" +
                    "Garam secukupnya\n" +
                    "Penyedap secukupnya\n" +
                    "Bahan Pelengkap Penyajian : \n" +
                    "15 buah Potongan lontong\n" +
                    "Irisan bawang putih goreng secukupnya\n" +
                    "Cabai rawit merah secukupnya\n" +
                    "Gula pasir secukupnya\n" +
                    "Jeruk nipis secukupnya\n" +
                    "Garam secukupnya\n" +
                    "Bawang merah goreng secukupnya\n" +
                    " 5 sdm Petis kupang\n" +
                    "Cara Membuat:\n" +
                    "Rebus kupang yang sudah bersih hingga matang, tambahkan garam dan penyedap secukupnya.\n" +
                    "Cara Penyajian:\n" +
                    "Irisan bawang putih goreng, cabai rawit merah, gula pasir, garam dan petis kupang dihaluskan atau digerus menggunakan sendok di atas piring saji. Lalu tambahkan sedikit air jeruk nipis. Ada baiknya petis dimasak ulang terlebih dulu, untuk menghindari hal-hal yang tak diinginkan (sakit perut bagi mereka yang sensitif).\n" +
                    "Setelah itu encerkan dengan membubuhi sedikit kuah kupang (air rebusan kupang).\n" +
                    "Setelah campuran bumbu selesai dibuat, tambahkan irisan lontong di atasnya, kemudian potongan lento.\n" +
                    "Siram dengan kupang di atasnya beserta kuahnya. Untuk toppingnya, taburi dengan bawang merah goreng.\n"
                ,"http://kuliner.ilmci.com/wp-content/uploads/2015/03/kupang-lontong.jpg")
        )
        return rvlist
    }
}