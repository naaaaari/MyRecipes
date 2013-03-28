package com.nrt.myrecipes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.graphics.*;


@SuppressLint("DrawAllocation")
class Image extends View {

	public Image(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void onDraw(Canvas c) {
		super.onDraw(c);
		Paint p = new Paint();
		Bitmap top, recipe01;
		
		Resources res = this.getContext().getResources();
		top      = BitmapFactory.decodeResource(res, R.drawable.top_300x300);
		recipe01 = BitmapFactory.decodeResource(res, R.drawable.recipes_02);
		
		c.drawBitmap(top,0,0,p);
		c.drawBitmap(recipe01,0,0,p);
	}
	
}
