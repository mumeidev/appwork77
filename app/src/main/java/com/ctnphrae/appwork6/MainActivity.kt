package com.ctnphrae.appwork6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var foods = arrayOf(
        "Adidas NMD",
        "Adidas ULTRABOOST",
        "Adidas YEEZY Boost 350",
        "Nike AirMax 97",
        "Nike SB",
        "GUCCI",
        "GUCCI Slipper",
        "GUCCI",
        "Converse Jack Purcell",
        "Converse One star",
        "Converse All star",
        "Converse One star OX",
        "Lacoast CARNABY EVO",
        "PUMA Sued",
        "PUMA Muse Metal",
        "Fila ila disruptor",
        "Fila Ray Tracer",
        "Fila S.D",
        "Fila",
        "Fila Korea"
    )
    var arrImg = arrayOf(
        "https://i0.wp.com/www.central.co.th/e-shopping/wp-content/uploads/2016/12/%E0%B8%A3%E0%B8%AD%E0%B8%87%E0%B9%80%E0%B8%97%E0%B9%89%E0%B8%B2-adidas.jpg?resize=750%2C500&ssl=1",
        "https://www.adidas.co.th/dw/image/v2/bcbs_prd/on/demandware.static/-/Sites-adidas-products/default/dw91b89acb/zoom/G54006_04_standard.jpg?sh=840&strip=false&sw=840",
        "https://f.btwcdn.com/store-45301/product/40c7c665-e6fa-3d2a-6dc9-5d491a1c03e7.jpg",
        "https://th-test-11.slatic.net/p/29490769d8cf36c4f99f81a7d9f82333.jpg_340x340q80.jpg_.webp",
        "https://c.static-nike.com/a/images/t_PDP_1280_v1/f_auto/fbx9cipizoyps6j7yxn0/%E0%B8%A3%E0%B8%AD%E0%B8%87%E0%B9%80%E0%B8%97%E0%B9%89%E0%B8%B2%E0%B8%AA%E0%B9%80%E0%B8%81%E0%B9%87%E0%B8%95%E0%B8%9A%E0%B8%AD%E0%B8%A3%E0%B9%8C%E0%B8%94%E0%B8%9C%E0%B8%B9%E0%B9%89-sb-solarsoft-portmore-2-olTW0pBE.jpg",
        "https://cf.shopee.co.th/file/76e453d47470310da2633a9a8f3c7f4a",
        "https://cy.lnwfile.com/312u77.jpg",
        "https://fx.lnwfile.com/u7klj3.jpg",
        "https://cf.shopee.co.th/file/e2c53222c9284cfcc897c88794037aad",
        "https://th-test-11.slatic.net/p/f5f92f5be97b16d51c3aef8426e3da6e.jpg",
        "https://pbs.twimg.com/media/D6QNLe1UUAASTyi.jpg",
        "https://i.pinimg.com/originals/46/5a/e8/465ae826f8d3bb7e0d8fb552ec351fb9.jpg",
        "https://www.lacoste.co.th/pub/media/catalog/product/cache/c687aa7517cf01e65c009f6943c2b1e9/3/6/36spm0010_385_01.jpg",
        "https://cf.shopee.co.th/file/df6e05e6331e4a5a73e8375f6040d1aa",
        "https://img.jimmyjazz.com/images/f_auto/q_auto/t_1000/product/367047-01-black-4/Puma-Muse-Metal",
        "https://cf.shopee.co.th/file/f5fcf0abb6fe39dc00ff5a6f09ea161c",
        "https://images.jdsports.com/is/image/jdsports/1RM00807_422_P1?",
        "https://cf.shopee.co.th/file/f8091f2eee0658c0b38f5394a211c445",
        "https://www.akerufeed.com/wp-content/uploads/2018/01/40-4.jpg",
        "https://scontent-yyz1-1.cdninstagram.com/vp/cddacbf24a6794708a3c8daf698beab3/5E61A367/t51.2885-15/sh0.08/e35/s750x750/40337920_691401361193137_5565866186235759113_n.jpg?_nc_ht=scontent-yyz1-1.cdninstagram.com&_nc_cat=101&ig_cache_key=MTg2MzAzNjY5MjYwMjMyOTA5Ng%3D%3D.2"
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
