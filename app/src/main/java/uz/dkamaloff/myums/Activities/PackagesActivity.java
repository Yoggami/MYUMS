package uz.dkamaloff.myums.Activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import uz.dkamaloff.myums.Fragments.DrivePackagesFragment;
import uz.dkamaloff.myums.Fragments.MiniPackagesFragment;
import uz.dkamaloff.myums.Fragments.NightPackagesFragment;
import uz.dkamaloff.myums.Fragments.PackagesFragment;
import uz.dkamaloff.myums.R;

public class PackagesActivity extends AppCompatActivity{

	private Toolbar mToolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_packages);
		setTitle(R.string.title_packages_activity);

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
		setupViewPager(viewPager);

		TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
		tabLayout.setupWithViewPager(viewPager);
	}

	private void setupViewPager(ViewPager viewPager) {
		ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
		adapter.addFragment(new PackagesFragment(), getString(R.string.title_packages_tabs));
		adapter.addFragment(new NightPackagesFragment(), getString(R.string.title_night_packages_tabs));
		adapter.addFragment(new DrivePackagesFragment(), getString(R.string.title_night_drive_packages_tabs));
		adapter.addFragment(new MiniPackagesFragment(), getString(R.string.title_mini_packages_tabs));
		viewPager.setAdapter(adapter);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case 16908332:
				finish();
				return true;
			case R.id.action_settings /*2131558625*/:
				String[] items = getResources().getStringArray(R.array.settings_internet);
				AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper((Context) this, R.style.AlertDialogCustom));
				builder.setItems(items, new C02321());
				builder.create().show();
				break;
		}
		return super.onOptionsItemSelected(item);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private class ViewPagerAdapter extends FragmentPagerAdapter {
		private final List<Fragment> mFragmentList;
		private final List<String> mFragmentTitleList;

		public ViewPagerAdapter(FragmentManager manager) {
			super(manager);
			this.mFragmentList = new ArrayList();
			this.mFragmentTitleList = new ArrayList();
		}

		public Fragment getItem(int position) {
			return (Fragment) this.mFragmentList.get(position);
		}

		public int getCount() {
			return this.mFragmentList.size();
		}

		public void addFragment(Fragment fragment, String title) {
			this.mFragmentList.add(fragment);
			this.mFragmentTitleList.add(title);
		}

		public CharSequence getPageTitle(int position) {
			return (CharSequence) this.mFragmentTitleList.get(position);
		}
	}

	class C02321 implements DialogInterface.OnClickListener {
		C02321() {
		}

		public void onClick(DialogInterface dialog, int item) {
			switch (item) {
				case ItemTouchHelper.ACTION_STATE_IDLE /*0*/:
					PackagesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*021" + Uri.encode("#")))), 1);
					break;
				case ItemTouchHelper.UP /*1*/:
					PackagesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0011" + Uri.encode("#")))), 1);
					break;
				case ItemTouchHelper.DOWN /*2*/:
					PackagesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0010" + Uri.encode("#")))), 1);
					break;
				case DrawerLayout.LOCK_MODE_UNDEFINED /*3*/:
					PackagesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*202*0" + Uri.encode("#")))), 1);
					break;
				default:
			}
		}
	}
}
