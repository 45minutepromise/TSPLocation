package uditgupta.tsplocation;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by udigupta on 9/13/15.
 */
public class TSPLocationApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "IF7m1lvlDcDRueKjYUg8RnfyTNAKVh35tJKyKKHp", "uzKrUwoWXNJ6Otb5mdQIlxXc5jmed1cdSB8R15ZX");
		ParseInstallation.getCurrentInstallation().saveInBackground();
	}
}
