/* package com.example.burclaruygulamasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class BurclarArrayAdapter(
    private var gelenContext: Context,
    resource: Int,
    textViewResourceId: Int,
    private var burcAdlari: Array<String>,
    var burcTarihleri: Array<String>,
    var burcResimleri: Array<Int>
) : ArrayAdapter<String>(gelenContext, resource, textViewResourceId, burcAdlari) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tek_satir_view = convertView
        var viewHolder : ViewHolder? = null
        if (tek_satir_view == null) {
            var inflater = LayoutInflater.from(gelenContext)
            var tekSatirViewInflate = inflater.inflate(R.layout.tek_satir_burc_ozellik, parent , false)
            viewHolder = ViewHolder(tekSatirViewInflate)
            tekSatirViewInflate.tag = viewHolder
        }else {
                viewHolder = tek_satir_view.getTag() as ViewHolder
        }

        viewHolder.burcAdi.setText(burcAdlari[position])
        viewHolder.burcTarihi.setText(burcTarihleri[position])
        viewHolder.burcResim.setText



        return tek_satir_view!!

    }
}

class ViewHolder(tekSatirView : View){
    var burcAdi : TextView
    var burcTarihi : TextView
    var burcResim : ImageView

    init {
        this.burcAdi = tekSatirView.
        this.burcTarihi = tekSatirView.
        this.burcResim = tekSatirView.
    }
}   */