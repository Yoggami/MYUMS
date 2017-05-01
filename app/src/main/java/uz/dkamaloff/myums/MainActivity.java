package uz.dkamaloff.myums;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uz.dkamaloff.myums.Fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

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
}