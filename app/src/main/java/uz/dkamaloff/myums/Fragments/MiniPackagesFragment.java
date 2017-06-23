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


public class MiniPackagesFragment extends Fragment {
	Constants mConstants;
	private AlertDialog.Builder builder;
	private Button shopMini100Package;
	private Button shopMini50Package;
	private Button trafficMiniBalance;

	public MiniPackagesFragment() {
		mConstants = new Constants();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_mini_packages, container, false);

		this.shopMini50Package = (Button) view.findViewById(R.id.shop50miniPackage);
		this.shopMini100Package = (Button) view.findViewById(R.id.shop100miniPackage);
		this.trafficMiniBalance = (Button) view.findViewById(R.id.trafficMiniBalance);
		View.OnClickListener onClickListener = new C02711();
		this.shopMini50Package.setOnClickListener(onClickListener);
		this.shopMini100Package.setOnClickListener(onClickListener);
		this.trafficMiniBalance.setOnClickListener(onClickListener);

		return view;
	}

	class C02711 implements View.OnClickListener {

		class C02671 implements DialogInterface.OnClickListener {
			C02671() {
			}

			public void onClick(DialogInterface dialog, int which) {
				MiniPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*204*50*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02682 implements DialogInterface.OnClickListener {
			C02682() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02693 implements DialogInterface.OnClickListener {
			C02693() {
			}

			public void onClick(DialogInterface dialog, int which) {
				MiniPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*204*100*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02704 implements DialogInterface.OnClickListener {
			C02704() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		C02711() {
		}

		public void onClick(View v) {
			switch (v.getId()) {
				case R.id.trafficMiniBalance /*2131558568*/:
					MiniPackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*019" + Uri.encode("#")))), 1);
					break;
				case R.id.shop50miniPackage /*2131558569*/:
					MiniPackagesFragment.this.builder = new AlertDialog.Builder(MiniPackagesFragment.this.getActivity());
					MiniPackagesFragment.this.builder.setTitle(MiniPackagesFragment.this.getString(R.string.shop_mini_50_package));
					MiniPackagesFragment.this.builder.setMessage(MiniPackagesFragment.this.getString(R.string.shop_button_alert));
					MiniPackagesFragment.this.builder.setCancelable(true);
					MiniPackagesFragment.this.builder.setPositiveButton(MiniPackagesFragment.this.getString(R.string.yes), new C02671());
					MiniPackagesFragment.this.builder.setNegativeButton(MiniPackagesFragment.this.getString(R.string.no), new C02682());
					MiniPackagesFragment.this.builder.create().show();
					break;
				case R.id.shop100miniPackage /*2131558570*/:
					MiniPackagesFragment.this.builder = new AlertDialog.Builder(MiniPackagesFragment.this.getActivity());
					MiniPackagesFragment.this.builder.setTitle(MiniPackagesFragment.this.getString(R.string.shop_mini_100_package));
					MiniPackagesFragment.this.builder.setMessage(MiniPackagesFragment.this.getString(R.string.shop_button_alert));
					MiniPackagesFragment.this.builder.setCancelable(true);
					MiniPackagesFragment.this.builder.setPositiveButton(MiniPackagesFragment.this.getString(R.string.yes), new C02693());
					MiniPackagesFragment.this.builder.setNegativeButton(MiniPackagesFragment.this.getString(R.string.no), new C02704());
					MiniPackagesFragment.this.builder.create().show();
					break;
				default:
			}
		}
	}
}
