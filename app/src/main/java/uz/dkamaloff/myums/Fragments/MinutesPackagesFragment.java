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

import uz.dkamaloff.myums.Model.Constants;
import uz.dkamaloff.myums.R;


public class MinutesPackagesFragment extends Fragment {
	Constants mConstants;
	Button btnMinutesBalance;
	Button btnShop120Minutes;
	Button btnShop180Minutes;
	Button btnShop300Minutes;
	AlertDialog.Builder builder;

	public MinutesPackagesFragment() {
		mConstants = new Constants();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_minutes_packages, container, false);

		this.btnShop120Minutes = (Button) view.findViewById(R.id.shop120Minutes);
		this.btnShop180Minutes = (Button) view.findViewById(R.id.shop180Minutes);
		this.btnShop300Minutes = (Button) view.findViewById(R.id.shop300Minutes);
		this.btnMinutesBalance = (Button) view.findViewById(R.id.minutePackageBalance);
		View.OnClickListener onClickListener = new C02781();
		this.btnShop120Minutes.setOnClickListener(onClickListener);
		this.btnShop180Minutes.setOnClickListener(onClickListener);
		this.btnShop300Minutes.setOnClickListener(onClickListener);
		this.btnMinutesBalance.setOnClickListener(onClickListener);

		return view;
	}

	class C02781 implements View.OnClickListener {

		class C02721 implements DialogInterface.OnClickListener {
			C02721() {
			}

			public void onClick(DialogInterface dialog, int which) {
				MinutesPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*103*120*1*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02732 implements DialogInterface.OnClickListener {
			C02732() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02743 implements DialogInterface.OnClickListener {
			C02743() {
			}

			public void onClick(DialogInterface dialog, int which) {
				MinutesPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*103*180*1*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02754 implements DialogInterface.OnClickListener {
			C02754() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02765 implements DialogInterface.OnClickListener {
			C02765() {
			}

			public void onClick(DialogInterface dialog, int which) {
				MinutesPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*103*300*1*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02776 implements DialogInterface.OnClickListener {
			C02776() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		C02781() {
		}

		public void onClick(View v) {
			switch (v.getId()) {
				case R.id.minutePackageBalance /*2131558571*/:
					MinutesPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*103" + Uri.encode("#")))), 1);
					break;
				case R.id.shop120Minutes /*2131558572*/:
					MinutesPackagesFragment.this.builder = new AlertDialog.Builder(MinutesPackagesFragment.this.getActivity());
					MinutesPackagesFragment.this.builder.setTitle(MinutesPackagesFragment.this.getActivity().getString(R.string.minutes_package_120));
					MinutesPackagesFragment.this.builder.setMessage(MinutesPackagesFragment.this.getActivity().getString(R.string.shop_button_alert));
					MinutesPackagesFragment.this.builder.setCancelable(true);
					MinutesPackagesFragment.this.builder.setPositiveButton(MinutesPackagesFragment.this.getActivity().getString(R.string.yes), new C02721());
					MinutesPackagesFragment.this.builder.setNegativeButton(MinutesPackagesFragment.this.getActivity().getString(R.string.no), new C02732());
					MinutesPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop180Minutes /*2131558573*/:
					MinutesPackagesFragment.this.builder = new AlertDialog.Builder(MinutesPackagesFragment.this.getActivity());
					MinutesPackagesFragment.this.builder.setTitle(MinutesPackagesFragment.this.getActivity().getString(R.string.minutes_package_180));
					MinutesPackagesFragment.this.builder.setMessage(MinutesPackagesFragment.this.getActivity().getString(R.string.shop_button_alert));
					MinutesPackagesFragment.this.builder.setCancelable(true);
					MinutesPackagesFragment.this.builder.setPositiveButton(MinutesPackagesFragment.this.getActivity().getString(R.string.yes), new C02743());
					MinutesPackagesFragment.this.builder.setNegativeButton(MinutesPackagesFragment.this.getActivity().getString(R.string.no), new C02754());
					MinutesPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop300Minutes /*2131558574*/:
					MinutesPackagesFragment.this.builder = new AlertDialog.Builder(MinutesPackagesFragment.this.getActivity());
					MinutesPackagesFragment.this.builder.setTitle(MinutesPackagesFragment.this.getActivity().getString(R.string.minutes_package_300));
					MinutesPackagesFragment.this.builder.setMessage(MinutesPackagesFragment.this.getActivity().getString(R.string.shop_button_alert));
					MinutesPackagesFragment.this.builder.setCancelable(true);
					MinutesPackagesFragment.this.builder.setPositiveButton(MinutesPackagesFragment.this.getActivity().getString(R.string.yes), new C02765());
					MinutesPackagesFragment.this.builder.setNegativeButton(MinutesPackagesFragment.this.getActivity().getString(R.string.no), new C02776());
					MinutesPackagesFragment.this.builder.create().show();
					break;
				default:
			}
		}
	}
}
