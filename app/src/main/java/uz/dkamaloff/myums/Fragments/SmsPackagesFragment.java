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


public class SmsPackagesFragment extends Fragment {
	Constants mConstants;
	Button btnShop100sms;
	Button btnShop300sms;
	Button btnSmsPackageBalance;
	AlertDialog.Builder builder;

	public SmsPackagesFragment() {
		mConstants = new Constants();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_sms_packages, container, false);

		this.btnShop100sms = (Button) view.findViewById(R.id.shop100sms);
		this.btnShop300sms = (Button) view.findViewById(R.id.shop300sms);
		this.btnSmsPackageBalance = (Button) view.findViewById(R.id.smsPackageBalance);
		View.OnClickListener onClickListener = new C03031();
		this.btnShop100sms.setOnClickListener(onClickListener);
		this.btnShop300sms.setOnClickListener(onClickListener);
		this.btnSmsPackageBalance.setOnClickListener(onClickListener);

		return view;
	}

	class C03031 implements View.OnClickListener {

		class C02991 implements DialogInterface.OnClickListener {
			C02991() {
			}

			public void onClick(DialogInterface dialog, int which) {
				SmsPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*018*100*1*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C03002 implements DialogInterface.OnClickListener {
			C03002() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C03013 implements DialogInterface.OnClickListener {
			C03013() {
			}

			public void onClick(DialogInterface dialog, int which) {
				SmsPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*018*300*1" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C03024 implements DialogInterface.OnClickListener {
			C03024() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		C03031() {
		}

		public void onClick(View v) {
			switch (v.getId()) {
				case R.id.smsPackageBalance:
					SmsPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*018" + Uri.encode("#")))), 1);
					break;
				case R.id.shop100sms:
					SmsPackagesFragment.this.builder = new AlertDialog.Builder(SmsPackagesFragment.this.getActivity());
					SmsPackagesFragment.this.builder.setTitle(SmsPackagesFragment.this.getActivity().getString(R.string.sms_packages_100));
					SmsPackagesFragment.this.builder.setMessage(SmsPackagesFragment.this.getActivity().getString(R.string.shop_button_alert));
					SmsPackagesFragment.this.builder.setCancelable(true);
					SmsPackagesFragment.this.builder.setPositiveButton(SmsPackagesFragment.this.getActivity().getString(R.string.yes), new C02991());
					SmsPackagesFragment.this.builder.setNegativeButton(SmsPackagesFragment.this.getActivity().getString(R.string.no), new C03002());
					SmsPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop300sms:
					SmsPackagesFragment.this.builder = new AlertDialog.Builder(SmsPackagesFragment.this.getActivity());
					SmsPackagesFragment.this.builder.setTitle(SmsPackagesFragment.this.getActivity().getString(R.string.sms_packages_300));
					SmsPackagesFragment.this.builder.setMessage(SmsPackagesFragment.this.getActivity().getString(R.string.shop_button_alert));
					SmsPackagesFragment.this.builder.setCancelable(true);
					SmsPackagesFragment.this.builder.setPositiveButton(SmsPackagesFragment.this.getActivity().getString(R.string.yes), new C03013());
					SmsPackagesFragment.this.builder.setNegativeButton(SmsPackagesFragment.this.getActivity().getString(R.string.no), new C03024());
					SmsPackagesFragment.this.builder.create().show();
					break;
				default:
			}
		}
	}
}
