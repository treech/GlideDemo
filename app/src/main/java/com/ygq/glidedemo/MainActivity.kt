package com.ygq.glidedemo

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.iv)
        val url = "https://w.wallhaven.cc/full/md/wallhaven-md5z28.jpg"
//        val url = "https://github.com/yeguoqiang/PicRemote/blob/master/common/%E4%BA%BA%E8%84%B8%E5%B8%83%E6%8E%A7%E5%BA%93%E7%AE%A1%E7%90%86.png?raw=true"
        Glide.with(this) //返回RequestManager以调用RequestManager.load方法，默认为RequestManager<Drawable>
            .load(url) //加载指定url的图片，返回RequestBuilder（在into之前均返回RequestBuilder）,默认为RequestBuilder<Drawable>
            .into(imageView) //显示图片的ImageView，返回用于完成本次请求的Target
    }
}