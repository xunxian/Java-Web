package com.maxf.myutil;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;

public class ActivityCollects {
	private static List<Activity> activities = new ArrayList<Activity>();

	public static void addActivity(Activity activity) {
		activities.add(activity);
	}

	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}

	public static void finishAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}
		}
	}
	public static int getCount(){
		return activities.size();
	}
}
