package uz.dkamaloff.myums.Model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import java.util.Locale;

import uz.dkamaloff.myums.R;

public class DialogHelper {

	private static class LocaleItemsActions implements DialogInterface.OnClickListener {
		final Activity val$activity;
		String language;

		LocaleItemsActions(Activity activity) {
			this.val$activity = activity;
		}

		private void saveLocale(String lang) {
			SharedPreferences.Editor editor = val$activity.getApplicationContext().getSharedPreferences("Pref", Context.MODE_PRIVATE).edit();
			editor.putString("Language", lang);
			editor.apply();
		}

		private void loadLocale() {
			language = val$activity.getSharedPreferences("Pref", Context.MODE_PRIVATE).getString("Language", "");
			Resources resources = val$activity.getResources();
			Configuration configuration = resources.getConfiguration();
			configuration.locale = new Locale(language);
			resources.updateConfiguration(configuration, null);
			val$activity.recreate();
		}

		@Override
		public void onClick(DialogInterface dialog, int which) {
			switch (which) {
				case 0:
					saveLocale("ru");
					loadLocale();
					break;
				case 1:
					saveLocale("uz");
					loadLocale();
					break;
				default:
			}
		}
	}

	public static AlertDialog localeSettings(Activity activity) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setCancelable(true);
		builder.setItems(R.array.language_items, new LocaleItemsActions(activity));
		return builder.create();
	}
}
