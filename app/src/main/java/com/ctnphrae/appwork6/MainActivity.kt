package com.ctnphrae.appwork6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var foods = arrayOf(
        "Core i9-9900K",
        "Core i9-9980X",
        "Intel Core i9-9900",
        "Core i9-7980XE",
        "Core i7-6800K",
        "Core i7-7800X",
        "Core i5-8500",
        "Core i5-8600",
        "Celeron G3900",
        "A10-9700",
        "A12-9800",
        "Athlon 3000G",
        "Athlon X4 950",
        "Ryzen 3 2200G",
        "Ryzen 5 3400G",
        "Ryzen 7 3700X",
        "Ryzen 7 2700X GOLD EDITION",
        "Ryzen 9 3900X",
        "Ryzen 9 3950X",
        "Ryzen Threadripper 2990WX"
    )
    var arrImg = arrayOf(
        "https://notebookspec.com/web/pc/pic-pc/cpu/20181025-105211_small_i9.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20190410-205317_Intel_Core_i9-9860X.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20190814-152444_Intel_Core_i9-9900.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20170728-224227_small_i9xe.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20170324-203858_small_i7.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20170624-235123_small.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20170925-175443_small_i5-K.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20170925-175443_small_i5-K.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/celeron-g.jpg",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20170926-112025_AMD_AM4-A_small.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20170926-112025_AMD_AM4-A_small.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20191108-110033_AM4_Athlon_small.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20170926-114552_AMD_AM4-Athlon_small.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20180122-203623_small_AMD_Ryzen_2200G.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20190707-220502_AMD_Ryzen_5_3400G.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20190707-214835_AMD_Ryzen_7_3800X.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20190430-115047_Ryzen_7_2700X_Gold_Edition.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20190707-214051_AMD_Ryzen_9_3900X.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20190707-214051_AMD_Ryzen_9_3900X.png",
        "https://notebookspec.com/web/pc/pic-pc/cpu/20180807-103015_AMD_TR42_Small.png"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.setLayoutManager(GridLayoutManager(this, 2))
        val myAdapter = AdapterRecycleView(foods,arrImg,this)
        recyclerView!!.setAdapter(myAdapter)
    }
}
