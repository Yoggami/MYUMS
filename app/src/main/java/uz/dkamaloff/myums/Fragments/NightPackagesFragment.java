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


public class NightPackagesFragment extends Fragment {
	Constants mConstants;
	private AlertDialog.Builder builder;
	private Button shopNight10000Package;
	private Button shopNight1000Package;
	private Button shopNight20000Package;
	private Button shopNight2000Package;
	private Button shopNight3000Package;
	private Button shopNight50000Package;
	private Button shopNight5000Package;
	private Button trafficNightBalance;

	public NightPackagesFragment() {
		mConstants = new Constants();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_night_packages, container, false);

		this.shopNight1000Package = (Button) view.findViewById(R.id.shop1000nightPackage);
		this.shopNight2000Package = (Button) view.findViewById(R.id.shop2000nightPackage);
		this.shopNight3000Package = (Button) view.findViewById(R.id.shop3000nightPackage);
		this.shopNight5000Package = (Button) view.findViewById(R.id.shop5000nightPackage);
		this.shopNight10000Package = (Button) view.findViewById(R.id.shop10000nightPackage);
		this.shopNight20000Package = (Button) view.findViewById(R.id.shop20000nightPackage);
		this.shopNight50000Package = (Button) view.findViewById(R.id.shop50000nightPackage);
		this.trafficNightBalance = (Button) view.findViewById(R.id.trafficNightBalance);
		View.OnClickListener onClickListener = new C02881();
		this.shopNight1000Package.setOnClickListener(onClickListener);
		this.shopNight2000Package.setOnClickListener(onClickListener);
		this.shopNight3000Package.setOnClickListener(onClickListener);
		this.shopNight5000Package.setOnClickListener(onClickListener);
		this.shopNight10000Package.setOnClickListener(onClickListener);
		this.shopNight20000Package.setOnClickListener(onClickListener);
		this.shopNight50000Package.setOnClickListener(onClickListener);
		this.trafficNightBalance.setOnClickListener(onClickListener);

		return view;
	}

	class C02881 implements View.OnClickListener {

		class C02791 implements DialogInterface.OnClickListener {
			C02791() {
			}

			public void onClick(DialogInterface dialog, int which) {
				NightPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*203*1000*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02802 implements DialogInterface.OnClickListener {
			C02802() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02813 implements DialogInterface.OnClickListener {
			C02813() {
			}

			public void onClick(DialogInterface dialog, int which) {
				NightPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*203*2000*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02824 implements DialogInterface.OnClickListener {
			C02824() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02835 implements DialogInterface.OnClickListener {
			C02835() {
			}

			public void onClick(DialogInterface dialog, int which) {
				NightPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*203*3000*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02846 implements DialogInterface.OnClickListener {
			C02846() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02857 implements DialogInterface.OnClickListener {
			C02857() {
			}

			public void onClick(DialogInterface dialog, int which) {
				NightPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*203*5000*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02868 implements DialogInterface.OnClickListener {
			C02868() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02879 implements DialogInterface.OnClickListener {
			C02879() {
			}

			public void onClick(DialogInterface dialog, int which) {
				NightPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*203*10000*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		C02881() {
		}

		public void onClick(View v) {
			switch (v.getId()) {
				case R.id.trafficNightBalance /*2131558575*/:
					NightPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*102" + Uri.encode("#")))), 1);
					break;
				case R.id.shop1000nightPackage /*2131558576*/:
					NightPackagesFragment.this.builder = new AlertDialog.Builder(NightPackagesFragment.this.getActivity());
					NightPackagesFragment.this.builder.setTitle(NightPackagesFragment.this.getString(R.string.shop_1000_night_package));
					NightPackagesFragment.this.builder.setMessage(NightPackagesFragment.this.getString(R.string.shop_button_alert));
					NightPackagesFragment.this.builder.setCancelable(true);
					NightPackagesFragment.this.builder.setPositiveButton(NightPackagesFragment.this.getString(R.string.yes), new C02791());
					NightPackagesFragment.this.builder.setNegativeButton(NightPackagesFragment.this.getString(R.string.no), new C02802());
					NightPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop2000nightPackage /*2131558577*/:
					NightPackagesFragment.this.builder = new AlertDialog.Builder(NightPackagesFragment.this.getActivity());
					NightPackagesFragment.this.builder.setTitle(NightPackagesFragment.this.getString(R.string.shop_2000_night_package));
					NightPackagesFragment.this.builder.setMessage(NightPackagesFragment.this.getString(R.string.shop_button_alert));
					NightPackagesFragment.this.builder.setCancelable(true);
					NightPackagesFragment.this.builder.setPositiveButton(NightPackagesFragment.this.getString(R.string.yes), new C02813());
					NightPackagesFragment.this.builder.setNegativeButton(NightPackagesFragment.this.getString(R.string.no), new C02824());
					NightPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop3000nightPackage /*2131558578*/:
					NightPackagesFragment.this.builder = new AlertDialog.Builder(NightPackagesFragment.this.getActivity());
					NightPackagesFragment.this.builder.setTitle(NightPackagesFragment.this.getString(R.string.shop_3000_night_package));
					NightPackagesFragment.this.builder.setMessage(NightPackagesFragment.this.getString(R.string.shop_button_alert));
					NightPackagesFragment.this.builder.setCancelable(true);
					NightPackagesFragment.this.builder.setPositiveButton(NightPackagesFragment.this.getString(R.string.yes), new C02835());
					NightPackagesFragment.this.builder.setNegativeButton(NightPackagesFragment.this.getString(R.string.no), new C02846());
					NightPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop5000nightPackage /*2131558579*/:
					NightPackagesFragment.this.builder = new AlertDialog.Builder(NightPackagesFragment.this.getActivity());
					NightPackagesFragment.this.builder.setTitle(NightPackagesFragment.this.getString(R.string.shop_5000_night_package));
					NightPackagesFragment.this.builder.setMessage(NightPackagesFragment.this.getString(R.string.shop_button_alert));
					NightPackagesFragment.this.builder.setCancelable(true);
					NightPackagesFragment.this.builder.setPositiveButton(NightPackagesFragment.this.getString(R.string.yes), new C02857());
					NightPackagesFragment.this.builder.setNegativeButton(NightPackagesFragment.this.getString(R.string.no), new C02868());
					NightPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop10000nightPackage /*2131558581*/:
					NightPackagesFragment.this.builder = new AlertDialog.Builder(NightPackagesFragment.this.getActivity());
					NightPackagesFragment.this.builder.setTitle(NightPackagesFragment.this.getString(R.string.shop_10000_night_package));
					NightPackagesFragment.this.builder.setMessage(NightPackagesFragment.this.getString(R.string.shop_button_alert));
					NightPackagesFragment.this.builder.setCancelable(true);
					NightPackagesFragment.this.builder.setPositiveButton(NightPackagesFragment.this.getString(R.string.yes), new C02879());
					NightPackagesFragment.this.builder.setNegativeButton(NightPackagesFragment.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					NightPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop20000nightPackage /*2131558583*/:
					NightPackagesFragment.this.builder = new AlertDialog.Builder(NightPackagesFragment.this.getActivity());
					NightPackagesFragment.this.builder.setTitle(NightPackagesFragment.this.getString(R.string.shop_20000_night_package));
					NightPackagesFragment.this.builder.setMessage(NightPackagesFragment.this.getString(R.string.shop_button_alert));
					NightPackagesFragment.this.builder.setCancelable(true);
					NightPackagesFragment.this.builder.setPositiveButton(NightPackagesFragment.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							NightPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*203*20000*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
							dialog.dismiss();
						}
					});
					NightPackagesFragment.this.builder.setNegativeButton(NightPackagesFragment.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					NightPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop50000nightPackage /*2131558585*/:
					NightPackagesFragment.this.builder = new AlertDialog.Builder(NightPackagesFragment.this.getActivity());
					NightPackagesFragment.this.builder.setTitle(NightPackagesFragment.this.getString(R.string.shop_50000_night_package));
					NightPackagesFragment.this.builder.setMessage(NightPackagesFragment.this.getString(R.string.shop_button_alert));
					NightPackagesFragment.this.builder.setCancelable(true);
					NightPackagesFragment.this.builder.setPositiveButton(NightPackagesFragment.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							NightPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*203*50000*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
							dialog.dismiss();
						}
					});
					NightPackagesFragment.this.builder.setNegativeButton(NightPackagesFragment.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					NightPackagesFragment.this.builder.create().show();
					break;
				default:
			}
		}
	}
}
