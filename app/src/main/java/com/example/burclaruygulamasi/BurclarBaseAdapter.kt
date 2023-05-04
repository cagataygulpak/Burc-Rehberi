package com.example.burclaruygulamasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class BurclarBaseAdapter(context : Context, tumBurcBilgileri : ArrayList<Burc>) : BaseAdapter() {
    private var context : Context
    private var tumBurclar : ArrayList<Burc>
    init {
        this.context = context
        this.tumBurclar = tumBurcBilgileri
    }
    override fun getCount(): Int {
        return tumBurclar.size
    }

    override fun getItem(position: Int): Any {
        return tumBurclar[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
       /* var singleLineView = convertView
        var viewHolderSinifi: ViewHolderSinifi
        if (singleLineView == null) {
            // ilk çalıştığında burası çalışıcak
            var inflater = LayoutInflater.from(context)
            var singleLineView = inflater.inflate(R.layout.tek_satir_burc_ozellik, parent, false)
            viewHolderSinifi = ViewHolderSinifi(singleLineView)
            singleLineView.tag = viewHolderSinifi
        }else {
            viewHolderSinifi = singleLineView.tag as ViewHolderSinifi
        } */

        var inflater = LayoutInflater.from(context)
        var singleLineView = inflater.inflate(R.layout.tek_satir_burc_ozellik, parent, false)


       var burcAdi = singleLineView.findViewById<TextView>(R.id.burcAdi)
        burcAdi.text = tumBurclar[position].burcAdi
        var burcTarihi = singleLineView.findViewById<TextView>(R.id.burcTarihi)
        burcTarihi.text = tumBurclar[position].burcTarihi
        var burcResim = singleLineView.findViewById<ImageView>(R.id.burcResim)
        burcResim.setImageResource(tumBurclar[position].burcResmi)

      /*  viewHolderSinifi.burcAdi.text = tumBurclar[position].burcAdi
        viewHolderSinifi.burcTarih.text = tumBurclar[position].burcTarihi
        viewHolderSinifi.burcResim.setImageResource(tumBurclar[position].burcResmi) */

        return singleLineView
    }
}


class ViewHolderSinifi (tekSatirView : View){
     val burcAdi : TextView
     val burcTarih : TextView
     val burcResim : ImageView

    init {
        this.burcAdi = tekSatirView.findViewById(R.id.burcAdi)
        this.burcTarih =  tekSatirView.findViewById(R.id.burcTarihi)
        this.burcResim = tekSatirView.findViewById(R.id.burcResim)
    }
}