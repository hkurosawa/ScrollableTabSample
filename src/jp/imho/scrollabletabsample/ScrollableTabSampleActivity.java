package jp.imho.scrollabletabsample;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;

public class ScrollableTabSampleActivity extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ViewPager vp = (ViewPager)findViewById(R.id.myViewPager);
        PagerTabStrip pagerTabStrip = (PagerTabStrip) findViewById(R.id.pager_tab_strip);
        //pagerTabStrip.setDrawFullUnderline(true);
        pagerTabStrip.setTabIndicatorColor(Color.BLUE);
        FragmentManager fm = this.getSupportFragmentManager();
        FragmentPagerAdapter adapter = new MyFragmentPagerAdapter(fm);
        vp.setAdapter(adapter);
        //vp.setCurrentItem(50, true);
    }
}

