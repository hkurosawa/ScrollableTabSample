package jp.imho.scrollabletabsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.ViewGroup;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		Log.i(this.toString(), "instantiateItem: "+position);
		return super.instantiateItem(container, position);
	}
	

	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Log.i(this.toString(), "getItem: " + arg0);
		TabContentFragment f = new TabContentFragment();
		Bundle b = new Bundle();
		b.putInt("pageIdx", arg0);
		f.setArguments(b);
		return f;
	}

	@Override
	public int getCount() {
		return 100;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return "PAGE"+position;
	}

}
