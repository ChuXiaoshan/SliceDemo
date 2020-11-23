package com.cxsplay.slicedemo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.slice.widget.SliceView
import com.cxsplay.slicedemo.utils.bind

class MainActivity : AppCompatActivity() {

    private lateinit var sv: SliceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sv = findViewById(R.id.sv)
        sv.bind(this, this, Uri.parse("content://com.cxsplay.slicedemo/hello"))
        sv.mode = SliceView.MODE_LARGE
    }
}