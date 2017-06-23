package uz.dkamaloff.myums;

import android.app.Application;
import android.content.res.Configuration;

import java.util.Locale;

import uz.dkamaloff.myums.Model.LocaleUtils;


public class App extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		String lang = getSharedPreferences("Pref", MODE_PRIVATE).getString("Language", "uz");
		LocaleUtils.setLocale(new Locale(lang));
		LocaleUtils.updateConfig(this, getBaseContext().getResources().getConfiguration());
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

		LocaleUtils.updateConfig(this, newConfig);
	}

}
