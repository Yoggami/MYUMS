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


public class DrivePackagesFragment extends Fragment {
	Constants mConstants;
	private AlertDialog.Builder builder;
	private Button shop1dayDrive;
	private Button shop30dayDrive;
	private Button shop7dayDrive;

	public DrivePackagesFragment() {
		mConstants = new Constants();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_drive_packages_fragement, container, false);

		this.shop1dayDrive = (Button) view.findViewById(R.id.shopDrive1day);
		this.shop7dayDrive = (Button) view.findViewById(R.id.shopDrive7day);
		this.shop30dayDrive = (Button) view.findViewById(R.id.shopDrive30day);
		View.OnClickListener onClickListener = new C02611();
		this.shop1dayDrive.setOnClickListener(onClickListener);
		this.shop7dayDrive.setOnClickListener(onClickListener);
		this.shop30dayDrive.setOnClickListener(onClickListener);

		return view;
	}

	class C02611 implements View.OnClickListener {

		class C02551 implements DialogInterface.OnClickListener {
			C02551() {
			}

			public void onClick(DialogInterface dialog, int which) {
				DrivePackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*200*1*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02562 implements DialogInterface.OnClickListener {
			C02562() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02573 implements DialogInterface.OnClickListener {
			C02573() {
			}

			public void onClick(DialogInterface dialog, int which) {
				DrivePackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*200*7*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02584 implements DialogInterface.OnClickListener {
			C02584() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02595 implements DialogInterface.OnClickListener {
			C02595() {
			}

			public void onClick(DialogInterface dialog, int which) {
				DrivePackagesFragment.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*200*30*" + mConstants.getDealerId() + "*1" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02606 implements DialogInterface.OnClickListener {
			C02606() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		C02611() {
		}

		public void onClick(View v) {
			switch (v.getId()) {
				case R.id.shopDrive1day:
					DrivePackagesFragment.this.builder = new AlertDialog.Builder(DrivePackagesFragment.this.getActivity());
					DrivePackagesFragment.this.builder.setTitle(DrivePackagesFragment.this.getString(R.string.shop_drive_1_day_package));
					DrivePackagesFragment.this.builder.setMessage(DrivePackagesFragment.this.getString(R.string.shop_button_alert));
					DrivePackagesFragment.this.builder.setCancelable(true);
					DrivePackagesFragment.this.builder.setPositiveButton(DrivePackagesFragment.this.getString(R.string.yes), new C02551());
					DrivePackagesFragment.this.builder.setNegativeButton(DrivePackagesFragment.this.getString(R.string.no), new C02562());
					DrivePackagesFragment.this.builder.create().show();
					break;
				case R.id.shopDrive7day:
					DrivePackagesFragment.this.builder = new AlertDialog.Builder(DrivePackagesFragment.this.getActivity());
					DrivePackagesFragment.this.builder.setTitle(DrivePackagesFragment.this.getString(R.string.shop_drive_7_day_package));
					DrivePackagesFragment.this.builder.setMessage(DrivePackagesFragment.this.getString(R.string.shop_button_alert));
					DrivePackagesFragment.this.builder.setCancelable(true);
					DrivePackagesFragment.this.builder.setPositiveButton(DrivePackagesFragment.this.getString(R.string.yes), new C02573());
					DrivePackagesFragment.this.builder.setNegativeButton(DrivePackagesFragment.this.getString(R.string.no), new C02584());
					DrivePackagesFragment.this.builder.create().show();
					break;
				case R.id.shopDrive30day:
					DrivePackagesFragment.this.builder = new AlertDialog.Builder(DrivePackagesFragment.this.getActivity());
					DrivePackagesFragment.this.builder.setTitle(DrivePackagesFragment.this.getString(R.string.shop_drive_30_day_package));
					DrivePackagesFragment.this.builder.setMessage(DrivePackagesFragment.this.getString(R.string.shop_button_alert));
					DrivePackagesFragment.this.builder.setCancelable(true);
					DrivePackagesFragment.this.builder.setPositiveButton(DrivePackagesFragment.this.getString(R.string.yes), new C02595());
					DrivePackagesFragment.this.builder.setNegativeButton(DrivePackagesFragment.this.getString(R.string.no), new C02606());
					DrivePackagesFragment.this.builder.create().show();
					break;
				default:
			}
		}
	}
}
