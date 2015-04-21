package com.haydar.ccx.view;

import com.haydar.ccx.MainActivity;
import com.haydar.ccx.R;
import com.haydar.layout.HayDarLayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * tab布局（单例） 创建view
 * 
 * @author gjy
 * 
 */

public class MainLayout extends HayDarLayout {

	private View view;
	private static Context mContext;

	private static class MainLayoutHolder {
		private static MainLayout instance = new MainLayout();
	}

	private MainLayout() {

	}

	public static MainLayout getInstance(Context context) {
		mContext = context;
		return MainLayoutHolder.instance;
	}

	@Override
	public View onCreateView() {
		view = LayoutInflater.from(mContext).inflate(R.layout.dd, null);
		init();
		return view;
	}

	private void init() {

	}

}
