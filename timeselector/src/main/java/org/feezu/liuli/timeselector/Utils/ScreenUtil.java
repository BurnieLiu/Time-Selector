package org.feezu.liuli.timeselector.Utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by liuli on 2015/11/27.
 */
public class ScreenUtil {

	public static int height;
	public static int width;
	private Context context;

	private static ScreenUtil instance;

	private ScreenUtil(Context context) {
		this.context = context;
		WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics dm = new DisplayMetrics();
		manager.getDefaultDisplay().getMetrics(dm);
		width = dm.widthPixels;
		height = dm.heightPixels;
	}

	public static ScreenUtil getInstance(Context context) {
		if (instance == null) {
			instance = new ScreenUtil(context);
		}
		return instance;
	}





	/**
	 * 得到手机屏幕的宽度, pix单位
	 */
	public int getScreenWidth() {
		return width;
	}








}