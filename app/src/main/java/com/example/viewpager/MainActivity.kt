package com.example.viewpager

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val Slide = IntroSliderAdapter(
        listOf(
            IntroSlider(
                "hola"
            ),

            IntroSlider(
                "chao"
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        introsliderviewpager.adapter = Slide

        /*private var progressBar: ProgressBar? = null
        private var i = 0
        private var txtView: TextView? = null
        private val handler = Handler()

        progressBar = findViewById<ProgressBar>(R.id.progressBar1) as ProgressBar
        txtView = findViewById(R.id.text_view) as TextView
        val btn = findViewById(R.id.show_button) as Button
        btn.setOnClickListener  {

            progressBar?.apply {
                max = 100

                progress = 40
            }

        }
    }
}




       /*  Thread(Runnable {
              while (i < 100) {
                   i += 5
                   handler.post(Runnable {
                     progressBar!!.progress = i
                      txtView!!.text = i.toString() + "/" + progressBar!!.max
                   })
                    try {
                       Thread.sleep(100)
                   } catch (e: InterruptedException) {
                       e.printStackTrace()
                   }

              }*/
        /*   }).start()
       }*/ /*if(Slider())else
   Toast.makeText(context, "debe responder todas las preguntas", Toast.LENGTH_SHORT).show()*/





