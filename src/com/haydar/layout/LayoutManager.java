package com.haydar.layout;

import com.haydar.ccx.MainActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * layout管理类(单例)
 * 
 * @author gjy
 * 
 */
public class LayoutManager {

	private static class LayoutManagerHolder {
		private static LayoutManager instance = new LayoutManager();
	}

	private LayoutManager() {

	}

	public static LayoutManager getInstance() {

		return LayoutManagerHolder.instance;
	}

	public void switchLayout(MainActivity mainActivity,
			HayDarLayout hayDarLayout) {
		//if(map里面没有){map.add}
		//如果有
		
		mainActivity.setContentView(hayDarLayout.onCreateView());
	}

}
