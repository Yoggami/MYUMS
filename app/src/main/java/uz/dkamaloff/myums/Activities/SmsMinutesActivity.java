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

import uz.dkamaloff.myums.Fragments.MinutesPackagesFragment;
import uz.dkamaloff.myums.Fragments.SmsPackagesFragment;
import uz.dkamaloff.myums.R;


public class SmsMinutesActivity extends AppCompatActivity {
	private TabLayout tabLayout;
	private Toolbar toolbar;
	private ViewPager viewPager;

	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.activity_sms_minutes);

		setTitle(getString(R.string.title_options_activity));
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		setupViewPager(this.viewPager);
		tabLayout = (TabLayout) findViewById(R.id.tabs);
		tabLayout.setupWithViewPager(this.viewPager);
	}

	private void setupViewPager(ViewPager viewPager) {
		ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
		adapter.addFragment(new MinutesPackagesFragment(), getString(R.string.title_minutes_packages_tabs));
		adapter.addFragment(new SmsPackagesFragment(), getString(R.string.title_sms_packages_tabs));
		viewPager.setAdapter(adapter);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case 16908332:
				finish();
				return true;
			case R.id.action_settings /*2131558625*/:
				String[] items = getResources().getStringArray(R.array.call_settings);
				AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper((Context) this, (int) R.style.AlertDialogCustom));
				builder.setItems(items, new C02431());
				builder.create().show();
				break;
		}
		return super.onOptionsItemSelected(item);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class ViewPagerAdapter extends FragmentPagerAdapter {
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

	class C02431 implements DialogInterface.OnClickListener {
		C02431() {
		}

		public void onClick(DialogInterface dialog, int item) {
			String encodedHash;
			switch (item) {
				case ItemTouchHelper.ACTION_STATE_IDLE /*0*/:
					SmsMinutesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*35*0000" + Uri.encode("#")))), 1);
					break;
				case ItemTouchHelper.UP /*1*/:
					encodedHash = Uri.encode("#");
					SmsMinutesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + (encodedHash + "35*0000" + encodedHash))), 1);
					break;
				case ItemTouchHelper.DOWN /*2*/:
					SmsMinutesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*33*0000" + Uri.encode("#")))), 1);
					break;
				case DrawerLayout.LOCK_MODE_UNDEFINED /*3*/:
					encodedHash = Uri.encode("#");
					SmsMinutesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + (encodedHash + "33*0000" + encodedHash))), 1);
					break;
				default:
			}
		}
	}
}
