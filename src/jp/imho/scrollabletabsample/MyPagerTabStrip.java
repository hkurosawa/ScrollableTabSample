package jp.imho.scrollabletabsample;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.view.PagerTabStrip;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

public class MyPagerTabStrip extends PagerTabStrip {
	private Context appContext = null;
	public MyPagerTabStrip(Context context) {
		super(context);
		this.appContext = context.getApplicationContext();
	}

	public MyPagerTabStrip(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.appContext = context.getApplicationContext();
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		Toast.makeText(this.appContext, ev.toString(), Toast.LENGTH_SHORT).show();
		Log.i(this.toString(), "onTouchEvent: " + ev.getX() + ", " + ev.getY());
		return super.onTouchEvent(ev);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Log.i(this.toString(), "onDraw: " + canvas.getWidth() + ", " + canvas.getHeight());
	}

	
}
