package com.example.burclaruygulamasi

 import android.content.Intent
 import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.burclaruygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tumBurcBilgileri : ArrayList<Burc>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        veriKaynagiHazirla()

        val baseAdapter = BurclarBaseAdapter(this , tumBurcBilgileri)
        binding.listViewBurclar.adapter = baseAdapter

        binding.listViewBurclar.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this@MainActivity, DetayBurc::class.java)
            intent.putExtra("tıklanılanOgeDegeri" , position)
            intent.putExtra("burc" , tumBurcBilgileri)
            startActivity(intent)
        }


    }

    private fun veriKaynagiHazirla(){
        tumBurcBilgileri = ArrayList(12)
        val burclar = resources.getStringArray(R.array.burclar)
        val burcTarihi = resources.getStringArray(R.array.burcTarih)
        val burcResimleri = arrayOf(
            R.drawable.koc1,
            R.drawable.boga2,
            R.drawable.ikizler3,
            R.drawable.yengec4,
            R.drawable.aslan5,
            R.drawable.basak6,
            R.drawable.terazi7,
            R.drawable.akrep8,
            R.drawable.yay9,
            R.drawable.oglak10,
            R.drawable.kova11,
            R.drawable.balik12,
        )
        val burcBuyukResimler = arrayOf(
            R.drawable.koc_buyuk1,
            R.drawable.boga_buyuk2,
            R.drawable.ikizler_buyuk3,
            R.drawable.yengec_buyuk4,
            R.drawable.aslan_buyuk5,
            R.drawable.basak_buyuk6,
            R.drawable.terazi_buyuk7,
            R.drawable.akrep_buyuk8,
            R.drawable.yay_buyuk9,
            R.drawable.oglak_buyuk10,
            R.drawable.kova_buyuk11,
            R.drawable.balik_buyuk12,
        )
        val burcGenelOzellikler = resources.getStringArray(R.array.burcGenelOzellikler)

        for (index in 0..11){
            val eklenecekBurc = Burc(burclar[index] , burcTarihi[index] , burcResimleri[index],burcBuyukResimler[index],burcGenelOzellikler[index])
            tumBurcBilgileri.add(eklenecekBurc)
        }
    }
}










/*   var burclar = resources.getStringArray(R.array.burclar)
        var burcTarihi = resources.getStringArray(R.array.burcTarih)
        var burcResimleri =
            arrayOf(
                R.drawable.koc1,
                R.drawable.boga2,
                R.drawable.ikizler3,
                R.drawable.yengec4,
                R.drawable.aslan5,
                R.drawable.basak6,
                R.drawable.terazi7,
                R.drawable.akrep8,
                R.drawable.yay9,
                R.drawable.oglak10,
                R.drawable.kova11,
                R.drawable.balik12,
            )
        var myAdapter = BurclarArrayAdapter(
            this,
            R.layout.tek_satir_burc_ozellik,
            R.id.burcAdi,
            burclar,
            burcTarihi,
            burcResimleri
        )

        binding.listViewBurclar.adapter = myAdapter*/

/*
  private val burclar = arrayOf(
        "Ocak",
        "Şubat",
        "Mart",
        "Nisan",
        "Mayıs",
        "Haziran",
        "Temmuz",
        "Ağustos",
        "Eylül",
        "Ekim",
        "Kasım",
        "Aralık"
    )     /*   val burclarAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, burclar) */

        val burclarAdapter: ArrayAdapter<String> =   ArrayAdapter(this, R.layout.tek_satir,R.id.bursIsim ,burclar)

        binding.listViewBurclar.adapter = burclarAdapter

       /* binding.listViewBurclar.setOnItemClickListener { _, view, _, _ ->
            Toast.makeText(
                this@MainActivity,
                "Tıklanıldı$view",
                Toast.LENGTH_SHORT
            ).show()
        } */

        binding.listViewBurclar.setOnItemClickListener { _, view, _, _ ->

            Toast.makeText(this@MainActivity, "Tıklanıldı$view", Toast.LENGTH_SHORT ).show()
        }*/