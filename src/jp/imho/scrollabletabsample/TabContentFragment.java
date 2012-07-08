package jp.imho.scrollabletabsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabContentFragment extends Fragment {
	private int pageIdx = -1;
	View v = null;
	public TabContentFragment() {
		super();
		Log.i(this.toString(), "CONSTRUCTOR:"+pageIdx);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i(this.toString(), "onCreateView:"+pageIdx);
		v = inflater.inflate(R.layout.tabcontentfragmentlayout, null);		
		return v;
	}

	@Override
	public void setArguments(Bundle args) {
		super.setArguments(args);
		this.pageIdx = args.getInt("pageIdx");
		Log.i(this.toString(), "setArguments:"+pageIdx);
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.i(this.toString(), "onPause:"+this.pageIdx);
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.i(this.toString(), "onResume:"+this.pageIdx);
		TextView tv = (TextView)v.findViewById(R.id.textView1);
		tv.setText("CONTENTS OF PAGE"+this.pageIdx);
	}

	@Override
	public void onStop() {
		super.onStop();
	}

}
