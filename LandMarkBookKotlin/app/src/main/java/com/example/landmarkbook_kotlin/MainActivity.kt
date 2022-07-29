package com.example.landmarkbook_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook_kotlin.databinding.ActivityDetailsBinding
import com.example.landmarkbook_kotlin.databinding.ActivityMainBinding

import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landMarkList: ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        landMarkList= ArrayList<LandMark>()

        val cifteminare=LandMark("Çifte Minare","Erzurum",R.drawable.cifteminare)
        val efes=LandMark("Efes","İzmir",R.drawable.efes)
        val galata=LandMark("Galata Kulesi ","İstanbul",R.drawable.galata)
        val kapadokya=LandMark("Kapadokya","Nevşehir",R.drawable.kapadogya)



        landMarkList.add(cifteminare)
        landMarkList.add(efes)
        landMarkList.add(galata)
        landMarkList.add(kapadokya)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val landmarkAdaptor=LandmarkAdaptor(landMarkList)
        binding.recyclerView.adapter=landmarkAdaptor


            /*
      val adaptor=ArrayAdapter(this,android.R.layout.simple_list_item_1,landMarkList.map { landMark -> landMark.name })

        binding.listWiev.adapter=adaptor

        binding.listWiev.onItemClickListener=AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent=Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("landmark",landMarkList.get(i))
            startActivity(intent)
        }

            */

    }

}