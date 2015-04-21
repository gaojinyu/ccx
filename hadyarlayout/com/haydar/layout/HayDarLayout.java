package com.haydar.layout;


import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;

/**
 * layout抽象类
 * 
 * @author gjy
 * 
 */
public abstract class HayDarLayout {
	public static Context mContext;
	public static Activity mActivity;
	public abstract View onCreateView();
}
