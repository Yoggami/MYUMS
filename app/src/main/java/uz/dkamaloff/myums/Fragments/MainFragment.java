package uz.dkamaloff.myums.Fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import uz.dkamaloff.myums.Activities.PackagesActivity;
import uz.dkamaloff.myums.Activities.ServicesActivity;
import uz.dkamaloff.myums.Activities.SmsMinutesActivity;
import uz.dkamaloff.myums.Activities.TariffsActivity;
import uz.dkamaloff.myums.Model.Constants;
import uz.dkamaloff.myums.R;

public class MainFragment extends Fragment {
	private static final int REQUEST_PERMISSIONS = 123;
	private String permission;
	private ImageView btnBalance;
	private ImageView btnPackages;
	private ImageView btnTariffs;
	private ImageView btnServices;
	private ImageView btnOptions;
	private ImageView btnNews;

	private Intent intent;
	private Constants mConstants;

	public MainFragment() {
		mConstants = new Constants();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		setHasOptionsMenu(true);
		getActivity().setTitle(R.string.main_app_title);
		btnBalance = (ImageView) view.findViewById(R.id.btnBalance);
		btnPackages = (ImageView) view.findViewById(R.id.btnPackages);
		btnTariffs = (ImageView) view.findViewById(R.id.btnTariffs);
		btnServices = (ImageView) view.findViewById(R.id.btnServices);
		btnOptions = (ImageView) view.findViewById(R.id.btnOptions);
		btnNews = (ImageView) view.findViewById(R.id.btnCall);
		View.OnClickListener onClickListener = new C02651();
		btnBalance.setOnClickListener(onClickListener);
		btnPackages.setOnClickListener(onClickListener);
		btnTariffs.setOnClickListener(onClickListener);
		btnServices.setOnClickListener(onClickListener);
		btnOptions.setOnClickListener(onClickListener);
		btnNews.setOnClickListener(onClickListener);

		return view;
	}

	private void resultIntent(String ussd) {
		startActivityForResult(new Intent(mConstants.getIntentId(), Uri.parse("tel:" + ussd)), 1);
	}

	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		switch (requestCode) {
			case REQUEST_PERMISSIONS /*123*/:
				int i = 0;
				while (i < permissions.length) {
					if (mConstants.getIntentId().equals(permissions[i]) && grantResults[i] == 0) {
						showPermission();
						return;
					}
					i++;
				}
			default:
				super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		}
	}

	private void showPermission() {
	}

	private void requestPermission(boolean explain) {
		String permission = "android.permission.CALL_PHONE";
		if (ContextCompat.checkSelfPermission(getActivity(), permission) == 0) {
			return;
		}
		if (explain && ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), permission)) {
			showExplanation(permission);
			return;
		}
		ActivityCompat.requestPermissions(getActivity(), new String[]{permission}, REQUEST_PERMISSIONS);
	}

	private void showExplanation(String permission) {
		new AlertDialog.Builder(getActivity()).setTitle(getActivity().getString(R.string.request_title)).setMessage(getActivity().getString(R.string.request_title_message)).setPositiveButton("\u041e\u043a", new C02662()).show();
	}

	class C02651 implements View.OnClickListener {

		class C02621 implements DialogInterface.OnClickListener {
			C02621() {
			}

			public void onClick(DialogInterface dialog, int which) {
				MainFragment.this.resultIntent(MainFragment.this.mConstants.getCallCentre());
				dialog.dismiss();
			}
		}

		class C02632 implements DialogInterface.OnClickListener {
			C02632() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02643 implements DialogInterface.OnClickListener {
			C02643() {
			}

			public void onClick(DialogInterface dialog, int item) {
				switch (item) {
					case ItemTouchHelper.ACTION_STATE_IDLE /*0*/:
						MainFragment.this.resultIntent(MainFragment.this.mConstants.getBalanceUssdRu() + MainFragment.this.mConstants.getEncodeHash());
						break;
					case ItemTouchHelper.UP /*1*/:
						MainFragment.this.resultIntent(MainFragment.this.mConstants.getLatePayment() + MainFragment.this.mConstants.getEncodeHash());
						break;
					case ItemTouchHelper.DOWN /*2*/:
						MainFragment.this.resultIntent(MainFragment.this.mConstants.getMyPayments() + MainFragment.this.mConstants.getEncodeHash());
						break;
					case DrawerLayout.LOCK_MODE_UNDEFINED /*3*/:
						MainFragment.this.resultIntent(MainFragment.this.mConstants.getMyNumber() + MainFragment.this.mConstants.getEncodeHash());
						break;
					case ItemTouchHelper.LEFT /*4*/:
						MainFragment.this.resultIntent(MainFragment.this.mConstants.getAllMyNumbers() + MainFragment.this.mConstants.getEncodeHash());
						break;
					default:
				}
			}
		}

		C02651() {
		}

		public void onClick(View v) {
			AlertDialog.Builder builder;
			switch (v.getId()) {
				case R.id.btnCall /*2131558524*/:
					MainFragment.this.permission = "android.permission.CALL_PHONE";
					if (ContextCompat.checkSelfPermission(MainFragment.this.getActivity(), MainFragment.this.permission) == 0) {
						builder = new AlertDialog.Builder(MainFragment.this.getActivity());
						builder.setTitle(MainFragment.this.getActivity().getString(R.string.txt_support_call));
						builder.setMessage(MainFragment.this.getActivity().getString(R.string.btn_call_alert_title));
						builder.setCancelable(true);
						builder.setPositiveButton(MainFragment.this.getActivity().getString(R.string.yes), new C02621());
						builder.setNegativeButton(MainFragment.this.getActivity().getString(R.string.no), new C02632());
						builder.create().show();
						return;
					}
					MainFragment.this.requestPermission(true);
				case R.id.btnBalance /*2131558525*/:
					MainFragment.this.permission = "android.permission.CALL_PHONE";
					if (ContextCompat.checkSelfPermission(MainFragment.this.getActivity(), MainFragment.this.permission) == 0) {
						String[] items = MainFragment.this.getResources().getStringArray(R.array.balance_dialog_items);
						builder = new AlertDialog.Builder(new ContextThemeWrapper(MainFragment.this.getActivity(), null));
						builder.setItems(items, new C02643());
						builder.create().show();
						return;
					}
					MainFragment.this.requestPermission(true);
				case R.id.btnTariffs /*2131558527*/:
					MainFragment.this.permission = "android.permission.CALL_PHONE";
					if (ContextCompat.checkSelfPermission(MainFragment.this.getActivity(), MainFragment.this.permission) == 0) {
						MainFragment.this.intent = new Intent(MainFragment.this.getActivity(), TariffsActivity.class);
						MainFragment.this.startActivity(MainFragment.this.intent);
						return;
					}
					MainFragment.this.requestPermission(true);
				case R.id.btnPackages /*2131558528*/:
					MainFragment.this.permission = "android.permission.CALL_PHONE";
					if (ContextCompat.checkSelfPermission(MainFragment.this.getActivity(), MainFragment.this.permission) == 0) {
						MainFragment.this.intent = new Intent(MainFragment.this.getActivity(), PackagesActivity.class);
						MainFragment.this.startActivity(MainFragment.this.intent);
						return;
					}
					MainFragment.this.requestPermission(true);
				case R.id.btnServices /*2131558529*/:
					MainFragment.this.permission = "android.permission.CALL_PHONE";
					if (ContextCompat.checkSelfPermission(MainFragment.this.getActivity(), MainFragment.this.permission) == 0) {
						MainFragment.this.intent = new Intent(MainFragment.this.getActivity(), ServicesActivity.class);
						MainFragment.this.startActivity(MainFragment.this.intent);
						return;
					}
					MainFragment.this.requestPermission(true);
				case R.id.btnOptions /*2131558530*/:
					MainFragment.this.permission = "android.permission.CALL_PHONE";
					if (ContextCompat.checkSelfPermission(MainFragment.this.getActivity(), MainFragment.this.permission) == 0) {
						MainFragment.this.intent = new Intent(MainFragment.this.getActivity(), SmsMinutesActivity.class);
						MainFragment.this.startActivity(MainFragment.this.intent);
						return;
					}
					MainFragment.this.requestPermission(true);

				default:
			}
		}
	}

	class C02662 implements DialogInterface.OnClickListener {
		C02662() {
		}

		public void onClick(DialogInterface dialog, int which) {
			MainFragment.this.requestPermission(false);
		}
	}
}
