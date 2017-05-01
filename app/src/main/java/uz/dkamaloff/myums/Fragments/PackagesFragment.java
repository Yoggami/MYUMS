package uz.dkamaloff.myums.Fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import uz.dkamaloff.myums.Model.Constants;
import uz.dkamaloff.myums.R;


public class PackagesFragment extends Fragment {
	private Constants mConstants;
	private AlertDialog.Builder builder;
	private Button shop10000Package;
	private Button shop1000Package;
	private Button shop2000Package;
	private Button shop3000Package;
	private Button shop300Package;
	private Button shop5000Package;
	private Button shop500Package;
	private Button trafficBalance;

	public PackagesFragment() {
		mConstants = new Constants();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_packages, container, false);

		this.shop300Package = (Button) view.findViewById(R.id.shop300Package);
		this.shop500Package = (Button) view.findViewById(R.id.shop500Package);
		this.shop1000Package = (Button) view.findViewById(R.id.shop1000Package);
		this.shop2000Package = (Button) view.findViewById(R.id.shop2000Package);
		this.shop3000Package = (Button) view.findViewById(R.id.shop3000Package);
		this.shop5000Package = (Button) view.findViewById(R.id.shop5000Package);
		this.shop10000Package = (Button) view.findViewById(R.id.shop10000Package);
		this.trafficBalance = (Button) view.findViewById(R.id.trafficBalance);
		View.OnClickListener onClickListener = new C02981();
		this.shop300Package.setOnClickListener(onClickListener);
		this.shop500Package.setOnClickListener(onClickListener);
		this.shop1000Package.setOnClickListener(onClickListener);
		this.shop2000Package.setOnClickListener(onClickListener);
		this.shop3000Package.setOnClickListener(onClickListener);
		this.shop5000Package.setOnClickListener(onClickListener);
		this.shop10000Package.setOnClickListener(onClickListener);
		this.trafficBalance.setOnClickListener(onClickListener);

		return view;
	}

	private class C02981 implements View.OnClickListener {

		class C02891 implements DialogInterface.OnClickListener {
			C02891() {
			}

			public void onClick(DialogInterface dialog, int which) {
				PackagesFragment.this.startActivityForResult(new Intent(mConstants.getIntentId(), Uri.parse("tel:" + ("*171*019*1*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02902 implements DialogInterface.OnClickListener {
			C02902() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02913 implements DialogInterface.OnClickListener {
			C02913() {
			}

			public void onClick(DialogInterface dialog, int which) {
				PackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*019*7*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02924 implements DialogInterface.OnClickListener {
			C02924() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02935 implements DialogInterface.OnClickListener {
			C02935() {
			}

			public void onClick(DialogInterface dialog, int which) {
				PackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*019*2*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02946 implements DialogInterface.OnClickListener {
			C02946() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02957 implements DialogInterface.OnClickListener {
			C02957() {
			}

			public void onClick(DialogInterface dialog, int which) {
				PackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*019*5*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02968 implements DialogInterface.OnClickListener {
			C02968() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02979 implements DialogInterface.OnClickListener {
			C02979() {
			}

			public void onClick(DialogInterface dialog, int which) {
				PackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*019*3*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		C02981() {
		}

		public void onClick(View v) {
			switch (v.getId()) {
				case R.id.trafficBalance:
					PackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*102" + Uri.encode("#")))), 1);
					break;
				case R.id.shop300Package:
					PackagesFragment.this.builder = new AlertDialog.Builder(PackagesFragment.this.getActivity());
					PackagesFragment.this.builder.setTitle(PackagesFragment.this.getString(R.string.shop_300_package));
					PackagesFragment.this.builder.setMessage(PackagesFragment.this.getString(R.string.shop_button_alert));
					PackagesFragment.this.builder.setCancelable(true);
					PackagesFragment.this.builder.setPositiveButton(PackagesFragment.this.getString(R.string.yes), new C02891());
					PackagesFragment.this.builder.setNegativeButton(PackagesFragment.this.getString(R.string.no), new C02902());
					PackagesFragment.this.builder.create().show();
					break;
				case R.id.shop500Package:
					PackagesFragment.this.builder = new AlertDialog.Builder(PackagesFragment.this.getActivity());
					PackagesFragment.this.builder.setTitle(PackagesFragment.this.getString(R.string.shop_500_package));
					PackagesFragment.this.builder.setMessage(PackagesFragment.this.getString(R.string.shop_button_alert));
					PackagesFragment.this.builder.setCancelable(true);
					PackagesFragment.this.builder.setPositiveButton(PackagesFragment.this.getString(R.string.yes), new C02913());
					PackagesFragment.this.builder.setNegativeButton(PackagesFragment.this.getString(R.string.no), new C02924());
					PackagesFragment.this.builder.create().show();
					break;
				case R.id.shop1000Package:
					PackagesFragment.this.builder = new AlertDialog.Builder(PackagesFragment.this.getActivity());
					PackagesFragment.this.builder.setTitle(PackagesFragment.this.getString(R.string.shop_1000_package));
					PackagesFragment.this.builder.setMessage(PackagesFragment.this.getString(R.string.shop_button_alert));
					PackagesFragment.this.builder.setCancelable(true);
					PackagesFragment.this.builder.setPositiveButton(PackagesFragment.this.getString(R.string.yes), new C02935());
					PackagesFragment.this.builder.setNegativeButton(PackagesFragment.this.getString(R.string.no), new C02946());
					PackagesFragment.this.builder.create().show();
					break;
				case R.id.shop2000Package:
					PackagesFragment.this.builder = new AlertDialog.Builder(PackagesFragment.this.getActivity());
					PackagesFragment.this.builder.setTitle(PackagesFragment.this.getString(R.string.shop_2000_package));
					PackagesFragment.this.builder.setMessage(PackagesFragment.this.getString(R.string.shop_button_alert));
					PackagesFragment.this.builder.setCancelable(true);
					PackagesFragment.this.builder.setPositiveButton(PackagesFragment.this.getString(R.string.yes), new C02957());
					PackagesFragment.this.builder.setNegativeButton(PackagesFragment.this.getString(R.string.no), new C02968());
					PackagesFragment.this.builder.create().show();
					break;
				case R.id.shop3000Package:
					PackagesFragment.this.builder = new AlertDialog.Builder(PackagesFragment.this.getActivity());
					PackagesFragment.this.builder.setTitle(PackagesFragment.this.getString(R.string.shop_3000_package));
					PackagesFragment.this.builder.setMessage(PackagesFragment.this.getString(R.string.shop_button_alert));
					PackagesFragment.this.builder.setCancelable(true);
					PackagesFragment.this.builder.setPositiveButton(PackagesFragment.this.getString(R.string.yes), new C02979());
					PackagesFragment.this.builder.setNegativeButton(PackagesFragment.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					PackagesFragment.this.builder.create().show();
					break;
				case R.id.shop5000Package:
					PackagesFragment.this.builder = new AlertDialog.Builder(PackagesFragment.this.getActivity());
					PackagesFragment.this.builder.setTitle(PackagesFragment.this.getString(R.string.shop_5000_package));
					PackagesFragment.this.builder.setMessage(PackagesFragment.this.getString(R.string.shop_button_alert));
					PackagesFragment.this.builder.setCancelable(true);
					PackagesFragment.this.builder.setPositiveButton(PackagesFragment.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							PackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*019*4*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
							dialog.dismiss();
						}
					});
					PackagesFragment.this.builder.setNegativeButton(PackagesFragment.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					PackagesFragment.this.builder.create().show();
					break;
				case R.id.shop10000Package:
					PackagesFragment.this.builder = new AlertDialog.Builder(PackagesFragment.this.getActivity());
					PackagesFragment.this.builder.setTitle(PackagesFragment.this.getString(R.string.shop_10000_package));
					PackagesFragment.this.builder.setMessage(PackagesFragment.this.getString(R.string.shop_button_alert));
					PackagesFragment.this.builder.setCancelable(true);
					PackagesFragment.this.builder.setPositiveButton(PackagesFragment.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							PackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*019*6*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
							dialog.dismiss();
						}
					});
					PackagesFragment.this.builder.setNegativeButton(PackagesFragment.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					PackagesFragment.this.builder.create().show();
					break;
				default:
			}
		}
	}
}
