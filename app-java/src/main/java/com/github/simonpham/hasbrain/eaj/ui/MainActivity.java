package com.github.simonpham.hasbrain.eaj.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.simonpham.hasbrain.eaj.R;
import com.github.simonpham.hasbrain.eaj.ui.adapter.SectionOneAdapter;
import com.github.simonpham.hasbrain.eaj.ui.adapter.SectionThreeAdapter;
import com.github.simonpham.hasbrain.eaj.ui.adapter.SectionTwoAdapter;
import com.github.simonpham.hasbrain.eaj.ui.model.Article;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private Toolbar toolbar;

    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;

    private List<Article> sectionOneArticles;
    private List<Article> sectionTwoArticles;
    private List<Article> sectionThreeArticles;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_explorer:
                    toolbar.setTitle(R.string.title_explore);
                    return true;
                case R.id.nav_saved:
                    toolbar.setTitle(R.string.title_saved);
                    return true;
                case R.id.nav_me:
                    toolbar.setTitle(R.string.title_me);
                    return true;
                case R.id.nav_quest:
                    toolbar.setTitle(R.string.title_quest);
                    return true;
                case R.id.nav_inbox:
                    toolbar.setTitle(R.string.title_inbox);
                    return true;
            }
            return false;
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        bindView();
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        addExampleData();
        initialize();
    }

    private void initialize() {
        LinearLayoutManager lm1 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(lm1);
        recyclerView1.setAdapter(new SectionOneAdapter(this, sectionOneArticles));

        LinearLayoutManager lm2 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(lm2);
        recyclerView2.setAdapter(new SectionTwoAdapter(this, sectionTwoArticles));

        LinearLayoutManager lm3 = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        recyclerView3.setLayoutManager(lm3);
        recyclerView3.setAdapter(new SectionThreeAdapter(this, sectionThreeArticles));
    }

    private void bindView() {
        toolbar = findViewById(R.id.toolbar);

        recyclerView1 = findViewById(R.id.recyclerView1);
        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerView3 = findViewById(R.id.recyclerView3);
    }

    private void addExampleData() {
        sectionOneArticles = new ArrayList<>();
        sectionTwoArticles = new ArrayList<>();
        sectionThreeArticles = new ArrayList<>();

        // Data Engineering from Scratch's articles
        sectionOneArticles.add(
                new Article(
                        "Introduction to Data Engineering",
                        R.drawable.sec1_1,
                        "https://github.com/hopelessoptimism/data-engineering-101"
                ));
        sectionOneArticles.add(
                new Article(
                        "How to Become a Data Engineer",
                        R.drawable.sec1_2,
                        "https://dzone.com/articles/how-to-become-a-data-engineer"
                ));
        sectionOneArticles.add(
                new Article(
                        "A Beginner’s Guide to Data Engineering — Part I",
                        R.drawable.sec1_3,
                        "https://medium.com/@rchang/a-beginners-guide-to-data-engineering-part-i-4227c5c457d7"
                ));
        sectionOneArticles.add(
                new Article(
                        "A Beginner’s Guide to Data Engineering — Part II",
                        R.drawable.sec1_4,
                        "https://medium.com/@rchang/a-beginners-guide-to-data-engineering-part-ii-47c4e7cbda71"
                ));
        sectionOneArticles.add(
                new Article(
                        "Functional Data Engineering — a modern paradigm for batch data processing",
                        R.drawable.sec1_5,
                        "https://medium.com/@maximebeauchemin/functional-data-engineering-a-modern-paradigm-for-batch-data-processing-2327ec32c42a"
                ));

        // Continue learning's articles
        sectionTwoArticles.add(
                new Article(
                        "GAN with Keras: Application to Image Deblurring",
                        R.drawable.sec2_1,
                        "https://blog.sicara.com/keras-generative-adversarial-networks-image-deblurring-45e3ab6977b5"
                ));
        sectionTwoArticles.add(
                new Article(
                        "What are Bloom filters?",
                        R.drawable.sec2_2,
                        "https://blog.medium.com/what-are-bloom-filters-1ec2a50c68ff"
                ));
        sectionTwoArticles.add(
                new Article(
                        "The Data Engineering Ecosystem: An Interactive Map",
                        R.drawable.sec2_3,
                        "https://blog.insightdatascience.com/the-data-engineering-ecosystem-an-interactive-map-b682627c2534"
                ));
        sectionTwoArticles.add(
                new Article(
                        "The Future of Data Engineering",
                        R.drawable.sec2_4,
                        "https://medium.com/dima-korolev/the-future-of-data-engineering-3e3cb5dc3293"
                ));
        sectionTwoArticles.add(
                new Article(
                        "Custom Data Analytics And Data Engineering",
                        R.drawable.sec2_5,
                        "https://medium.com/@SeattleDataGuy/custom-data-analytics-and-data-engineering-9d85c2033965"
                ));

        // Machine Learning's articles
        sectionThreeArticles.add(
                new Article(
                        "Understanding Machine Learning - with pictures of cats and dogs",
                        R.drawable.sec3_1,
                        "https://medium.com/velocity-vlcty/understanding-machine-learning-with-pictures-of-cats-and-dogs-536e1c712d52"
                ));
        sectionThreeArticles.add(
                new Article(
                        "Machine Learning for Humans \uD83E\uDD16\uD83D\uDC76",
                        R.drawable.sec3_2,
                        "https://medium.com/machine-learning-for-humans/why-machine-learning-matters-6164faf1df12"
                ));
        sectionThreeArticles.add(
                new Article(
                        "Cheat Sheets for AI, Neural Networks, Machine Learning, Deep Learning & Big Data",
                        "https://becominghuman.ai/cheat-sheets-for-ai-neural-networks-machine-learning-deep-learning-big-data-678c51b4b463"
                ));
        sectionThreeArticles.add(
                new Article(
                        "Machine Learning is Fun!",
                        R.drawable.sec3_3,
                        "https://medium.com/@ageitgey/machine-learning-is-fun-80ea3ec3c471"
                ));
    }

}
