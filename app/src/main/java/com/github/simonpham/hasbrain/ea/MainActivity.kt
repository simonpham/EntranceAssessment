package com.github.simonpham.hasbrain.ea

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapterSec1: MixAdapter by lazy {
        MixAdapter.Builder {
            withModel<SectionOne> { ItemSectionOneViewHolder.Factory() }
        }.build()
    }

    private val adapterSec2: MixAdapter by lazy {
        MixAdapter.Builder {
            withModel<SectionTwo> { ItemSectionTwoViewHolder.Factory() }
        }.build()
    }

    private val adapterSec3: MixAdapter by lazy {
        MixAdapter.Builder {
            withModel<SectionThree> { ItemSectionThreeViewHolder.Factory() }
        }.build()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_explorer -> {
                toolbar.title = getString(R.string.title_explore)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_saved -> {
                toolbar.title = getString(R.string.title_saved)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_me -> {
                toolbar.title = getString(R.string.title_me)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_quest -> {
                toolbar.title = getString(R.string.title_quest)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_inbox -> {
                toolbar.title = getString(R.string.title_inbox)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.action_bar, menu)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        initialize()
        importSampleData()
    }

    private fun initialize() {
        val lm1 = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.layoutManager = lm1
        recyclerView1.adapter = adapterSec1

        val lm2 = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = lm2
        recyclerView2.adapter = adapterSec2

        val lm3 = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        recyclerView3.layoutManager = lm3
        recyclerView3.adapter = adapterSec3
    }

    private fun importSampleData() {
        val dataSec1 = ArrayList<SectionOne>()
        val dataSec2 = ArrayList<SectionTwo>()
        val dataSec3 = ArrayList<SectionThree>()

        // Data Engineering from Scratch's articles
        dataSec1.add(
                SectionOne("Introduction to Data Engineering",
                        R.drawable.sec1_1,
                        "https://github.com/hopelessoptimism/data-engineering-101"
                ))
        dataSec1.add(
                SectionOne(
                        "How to Become a Data Engineer",
                        R.drawable.sec1_2,
                        "https://dzone.com/articles/how-to-become-a-data-engineer"
                ))

        // Continue learning's articles
        dataSec2.add(
                SectionTwo(
                        "GAN with Keras: Application to Image Deblurring",
                        R.drawable.sec2_1,
                        "https://blog.sicara.com/keras-generative-adversarial-networks-image-deblurring-45e3ab6977b5"
                ))
        dataSec2.add(
                SectionTwo(
                        "What are Bloom filters?",
                        R.drawable.sec2_2,
                        "https://blog.medium.com/what-are-bloom-filters-1ec2a50c68ff"
                ))

        // Machine Learning's articles
        dataSec3.add(
                SectionThree(
                        "Understanding Machine Learning - with pictures of cats and dogs",
                        R.drawable.sec3_1,
                        "https://medium.com/velocity-vlcty/understanding-machine-learning-with-pictures-of-cats-and-dogs-536e1c712d52"
                ))
        dataSec3.add(
                SectionThree(
                        "Machine Learning for Humans \uD83E\uDD16\uD83D\uDC76",
                        R.drawable.sec3_2,
                        "https://medium.com/machine-learning-for-humans/why-machine-learning-matters-6164faf1df12"
                ))

        adapterSec1.setData(dataSec1)
        adapterSec2.setData(dataSec2)
        adapterSec3.setData(dataSec3)
    }
}
