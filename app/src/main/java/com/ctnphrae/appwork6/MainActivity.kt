package com.ctnphrae.appwork6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var foods = arrayOf(
        "LF Yukinoshita Yukino อะนิเมะญี่ปุ่น Shouwu",
        "Alicization Alice Asuna รูป PVC ของเล่นแอ็คชันโมเดลอนิเมะ SAO Alice Figures",
        "ฟิกเกอร์ Anime Sword Art Online Figure Action Kirigaya Kazuto",
        "ฟิกเกอร์ Anime Model Figure hatsuse izuna No Game",
        "ฟิกเกอร์ Anime honkai Mise 3 Sakura yae heretic Miko Sexy",
        "Re:ZERO - Cu-poche Rem Posable Figure ",
        "ชมฟิกเกอร์ในบูธของ KOTOBUKIYA ที่งาน Anime Japan 2017",
        "ฟิกเกอร์ HobbyMoe : จำหน่าย ฟิกเกอร์ ฟิกม่า เนนโดรอยด์ ของแท้จากญี่ปุ่น",
        "ชมฟิกเกอร์ในบูธของ Good Smile Company ที่งาน Anime Japan 2017",
        "Figure Action จากเรื่อง Evangelion EVA อีวานเกเลียน Parfom Rei Ayanami อายานามิ เรย์ Ver แอ็คชั่น ฟิกเกอร์ Anime อนิเมะ",
        "No Game No Life - Shiro 1/7 Complete Figure",
        "1/7 Maki Nishikino Alter Ver. - Love Live! - TheHerotoys",
        "ฟิกเกอร์ Anime Naruto Hyuuga Hinata PVC Action Figure Model Doll Toy",
        "Kotobukiya Hibiki Anime Ver (PVC Figure)",
        "Re:ZERO - Emilia Tea Party Ver.",
        "Hot Japanese Famous Cartoon Character Naruto Action Figure",
        "Tronzo Action Figure Anime One Punch Man Genos PVC Action",
        "Tokyo Ghoul Anime Mask Ken Kaneki Action Figure",
        "Tronzo Original BANPRESTO Anime Demon Slayer",
        "Fate/Grand Order Lancer/Medusa 1/7 Scale Figure"
    )
    var arrImg = arrayOf(
        "https://my-live-01.slatic.net/p/fd059e72bd9ac00fdb2556a77930ba60.jpg",
        "https://th-live-02.slatic.net/p/0da2c902c650988c823782a0a72dd6d5.jpg",
        "https://cf.shopee.co.th/file/ea6df51e8a39c5966abed6266a841131",
        "https://cf.shopee.co.th/file/e923269cace0e79aa8df4629add98dc1",
        "https://cf.shopee.co.th/file/a679620180f1970b82cfb9f0eaca0ff6_tn",
        "https://fu.lnwfile.com/zeoroy.jpg",
        "https://hobbyfanclub.com/web/images/5fltwekhd13knhumf5ci2832017312231.jpg",
        "https://i.pinimg.com/originals/e3/af/6e/e3af6e944e349913cbf61813e6dad0a7.jpg",
        "http://hobbyfanclub.com/web/images/1ypzl4qi1zvf41d32piv2632017535038.jpg",
        "https://th-test-11.slatic.net/original/e8bc91519826691f1bca4cb08e28d778-product.jpg",
        "https://dw.lnwfile.com/4x7h6v.jpg",
        "https://th-live-03.slatic.net/p/4/figure-anime-new-collection-manga-1507111899-87515494-1bf2a57e624ea4a9c51dd61caa96e011-zoom.jpg",
        "https://cf.shopee.co.th/file/898d48e8b66793abde155103fd1c6dd5",
        "https://www.zenco.co.th/media/catalog/product/cache/1/image/6243734f1368474528c2e7f764f14c63/k/o/kotobukiya_hibiki_anime_ver_i.jpg",
        "https://anifigures.com/114-large_default/rezero-emilia-tea-party-ver-anime-figure.jpg",
        "https://image.made-in-china.com/202f0j00dEJGRjYMnAkQ/Hot-Japanese-Famous-Cartoon-Character-Naruto-Action-Figure-Anime-PVC-Figure.jpg",
        "https://ae01.alicdn.com/kf/HTB1vg3LSxYaK1RjSZFnq6y80pXaR/Tronzo-Action-Figure-Anime-One-Punch-Man-Genos-PVC-Action-Figure-Collection-Model-Toys-One-Punch.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSF4IrfR785uoyl3a9Tu_MiukbyrqKZtRpW2WoyRDP_l0Icbtr2&s",
        "https://sg-test-11.slatic.net/p/ce144b577fade5005810ba7c7acdc278.jpg",
        "https://d3ieicw58ybon5.cloudfront.net/exq/65/694.720/shop/product/5274b4f46e5642e2840a9b2836f92b78.jpg"
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
