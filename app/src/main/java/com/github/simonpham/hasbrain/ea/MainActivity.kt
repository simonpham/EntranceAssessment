package com.github.simonpham.hasbrain.ea

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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

//        recyclerView.adapter =
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.action_bar, menu)
        return true
    }
}
