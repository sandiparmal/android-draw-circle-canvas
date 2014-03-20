package com.sandip.drawcircle;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new SampleCircle(this));
	}
 
	private static class SampleCircle extends View { 
		
		public SampleCircle(Context context) {
			super(context);
			setFocusable(true);
 
		}
 
		@Override
		protected void onDraw(Canvas canvas) {
			/** Canvas background color */
			canvas.drawColor(Color.TRANSPARENT);
			//canvas.drawColor(Color.CYAN);
			Paint p = new Paint();			
			p.setAntiAlias(true);
			/** border color for Circle*/
			p.setColor(Color.RED);
			p.setStyle(Paint.Style.STROKE); 
			/**
			 * want to set opacity then use
			 * p.setAlpha(0x50);
			 */
			p.setStrokeWidth(4.5f);
			/** first outer circle */
			canvas.drawCircle(200, 200, 100, p);			
			/** inner circle */
			canvas.drawCircle(202, 200, 80, p);
			
		}
 
	}
}