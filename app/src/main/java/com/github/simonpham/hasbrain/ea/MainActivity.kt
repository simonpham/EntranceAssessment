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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val lm1 = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.layoutManager = lm1
        recyclerView1.adapter = adapterSec1

        val lm2 = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = lm2
        recyclerView2.adapter = adapterSec2

        val lm3 = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        recyclerView3.layoutManager = lm3
        recyclerView3.adapter = adapterSec3

        val dataSec1 = ArrayList<SectionOne>()
        dataSec1.add(SectionOne("Introduction to Data Engineering", R.drawable.sec1_1))
        dataSec1.add(SectionOne("How to Become a Data Engineer", R.drawable.sec1_2))
        adapterSec1.setData(dataSec1)

        val dataSec2 = ArrayList<SectionTwo>()
        dataSec2.add(SectionTwo("Introduction to Data Engineering", R.drawable.sec1_1))
        dataSec2.add(SectionTwo("How to Become a Data Engineer", R.drawable.sec1_2))
        adapterSec2.setData(dataSec2)

        val dataSec3 = ArrayList<SectionThree>()
        dataSec3.add(SectionThree("Introduction to Data Engineering", R.drawable.sec1_1))
        dataSec3.add(SectionThree("How to Become a Data Engineer", R.drawable.sec1_2))
        adapterSec3.setData(dataSec3)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.action_bar, menu)
        return true
    }
}
