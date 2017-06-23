package uz.dkamaloff.myums;

import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import uz.dkamaloff.myums.Fragments.MainFragment;
import uz.dkamaloff.myums.Model.DialogHelper;

public class MainActivity extends AppCompatActivity {

	AlertDialog mDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager fragmentManager = getSupportFragmentManager();
		Fragment fragment = fragmentManager.findFragmentByTag("fragment");

		if (fragment == null) {
			fragment = new MainFragment();
			fragmentManager.beginTransaction()
					.add(R.id.fragment_container, fragment, "fragment")
					.commit();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_settings:
				this.mDialog = DialogHelper.localeSettings(this);
				this.mDialog.show();
		}
		return super.onOptionsItemSelected(item);
	}
}