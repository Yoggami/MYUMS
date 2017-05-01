package uz.dkamaloff.myums.Activities;

import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import uz.dkamaloff.myums.Adapters.ExpListAdapterForServices;
import uz.dkamaloff.myums.R;


public class ServicesActivity extends AppCompatActivity {
	Builder builder;
	ExpandableListView mListView;
	ExpListAdapterForServices mAdapter;
	HashMap<String, List<String>> listDataChild;
	List<String> listDataHeader;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_services);
		setTitle(R.string.title_services_activity);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		prepareListData();
		mListView = (ExpandableListView) findViewById(R.id.lvExpServices);
		mAdapter = new ExpListAdapterForServices(this, this.listDataHeader, this.listDataChild);
		mListView.setAdapter(mAdapter);
		mListView.setOnChildClickListener(new C02421());
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case 16908332:
				finish();
				return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void prepareListData() {
		listDataHeader = new ArrayList<>();
		listDataChild = new HashMap<>();
		String[] tariffNames = getResources().getStringArray(R.array.services_header_items);
		listDataHeader.add(tariffNames[0]);
		listDataHeader.add(tariffNames[1]);
		listDataHeader.add(tariffNames[2]);
		listDataHeader.add(tariffNames[3]);
		listDataHeader.add(tariffNames[4]);
		listDataHeader.add(tariffNames[5]);
		listDataHeader.add(tariffNames[6]);
		listDataHeader.add(tariffNames[7]);
		listDataHeader.add(tariffNames[8]);
		String[] child_btn_serv_tarif = getResources().getStringArray(R.array.child_buttons_serv_and_tarif);
		List<String> credit_pay = new ArrayList<>();
		credit_pay.add(child_btn_serv_tarif[0]);
		List<String> two_lines = new ArrayList<>();
		two_lines.add(child_btn_serv_tarif[1]);
		two_lines.add(child_btn_serv_tarif[2]);
		List<String> call_you = new ArrayList<>();
		call_you.add(child_btn_serv_tarif[1]);
		call_you.add(child_btn_serv_tarif[2]);
		List<String> anti_aon = new ArrayList<>();
		anti_aon.add(child_btn_serv_tarif[1]);
		anti_aon.add(child_btn_serv_tarif[2]);
		List<String> lte = new ArrayList<>();
		lte.add(child_btn_serv_tarif[1]);
		lte.add(child_btn_serv_tarif[2]);
		lte.add(child_btn_serv_tarif[3]);
		List<String> check_active_services = new ArrayList<>();
		check_active_services.add(child_btn_serv_tarif[4]);
		List<String> rouming_services = new ArrayList<>();
		rouming_services.add(child_btn_serv_tarif[1]);
		rouming_services.add(child_btn_serv_tarif[2]);
		List<String> family_services = new ArrayList<>();
		family_services.add(child_btn_serv_tarif[1]);
		family_services.add(child_btn_serv_tarif[2]);
		List<String> super_nol = new ArrayList<>();
		super_nol.add(child_btn_serv_tarif[6]);
		this.listDataChild.put(this.listDataHeader.get(0), credit_pay);
		this.listDataChild.put(this.listDataHeader.get(1), two_lines);
		this.listDataChild.put(this.listDataHeader.get(2), call_you);
		this.listDataChild.put(this.listDataHeader.get(3), anti_aon);
		this.listDataChild.put(this.listDataHeader.get(4), lte);
		this.listDataChild.put(this.listDataHeader.get(5), check_active_services);
		this.listDataChild.put(this.listDataHeader.get(6), rouming_services);
		this.listDataChild.put(this.listDataHeader.get(7), family_services);
		this.listDataChild.put(this.listDataHeader.get(8), super_nol);
	}

	class C02421 implements ExpandableListView.OnChildClickListener {

		class C02331 implements DialogInterface.OnClickListener {
			C02331() {
			}

			public void onClick(DialogInterface dialog, int which) {
				ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*32" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02342 implements DialogInterface.OnClickListener {
			C02342() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02353 implements DialogInterface.OnClickListener {
			C02353() {
			}

			public void onClick(DialogInterface dialog, int which) {
				ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0131" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02364 implements DialogInterface.OnClickListener {
			C02364() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02375 implements DialogInterface.OnClickListener {
			C02375() {
			}

			public void onClick(DialogInterface dialog, int which) {
				ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0130" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02386 implements DialogInterface.OnClickListener {
			C02386() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02397 implements DialogInterface.OnClickListener {
			C02397() {
			}

			public void onClick(DialogInterface dialog, int which) {
				ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0101" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		class C02408 implements DialogInterface.OnClickListener {
			C02408() {
			}

			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		}

		class C02419 implements DialogInterface.OnClickListener {
			C02419() {
			}

			public void onClick(DialogInterface dialog, int which) {
				ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0100" + Uri.encode("#")))), 1);
				dialog.dismiss();
			}
		}

		C02421() {
		}

		public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
			switch (groupPosition) {
				case 0:
					ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
					ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_qarz_name));
					ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.get_qarz_alert_title));
					ServicesActivity.this.builder.setCancelable(true);
					ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new C02331());
					ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new C02342());
					ServicesActivity.this.builder.create().show();
					break;
				case 1:
					if (childPosition != 0) {
						String encodedHash = Uri.encode("#");
						ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + (encodedHash + "43" + encodedHash))), 1);
						break;
					}
					ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*43" + Uri.encode("#")))), 1);
					break;
				case 2:
					if (childPosition != 0) {
						ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
						ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_vam_zvonili_name));
						ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.deactivate_service_alert_title));
						ServicesActivity.this.builder.setCancelable(true);
						ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new C02375());
						ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new C02386());
						ServicesActivity.this.builder.create().show();
						break;
					}
					ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
					ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_vam_zvonili_name));
					ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.activte_service_alert_title));
					ServicesActivity.this.builder.setCancelable(true);
					ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new C02353());
					ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new C02364());
					ServicesActivity.this.builder.create().show();
					break;
				case 3:
					if (childPosition != 0) {
						ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
						ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_anti_aon_name));
						ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.deactivate_service_alert_title));
						ServicesActivity.this.builder.setCancelable(true);
						ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new C02419());
						ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								dialog.cancel();
							}
						});
						ServicesActivity.this.builder.create().show();
						break;
					}
					ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
					ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_anti_aon_name));
					ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.activte_service_alert_title));
					ServicesActivity.this.builder.setCancelable(true);
					ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new C02397());
					ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new C02408());
					ServicesActivity.this.builder.create().show();
					break;
				case 4:
					if (childPosition != 0) {
						if (childPosition != 1) {
							ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*222" + Uri.encode("#")))), 1);
							break;
						}
						ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
						ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_4gLte_name));
						ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.deactivate_service_alert_title));
						ServicesActivity.this.builder.setCancelable(true);
						ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*222*0" + Uri.encode("#")))), 1);
								dialog.dismiss();
							}
						});
						ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								dialog.cancel();
							}
						});
						ServicesActivity.this.builder.create().show();
						break;
					}
					ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
					ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_4gLte_name));
					ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.activte_service_alert_title));
					ServicesActivity.this.builder.setCancelable(true);
					ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*222*1" + Uri.encode("#")))), 1);
							dialog.dismiss();
						}
					});
					ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					ServicesActivity.this.builder.create().show();
					break;
				case 5:
					if (childPosition == 0) {
						ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*140" + Uri.encode("#")))), 1);
						break;
					}
					break;
				case 6:
					if (childPosition != 0) {
						ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
						ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_rouming_calls_name));
						ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.deactivate_service_alert_title));
						ServicesActivity.this.builder.setCancelable(true);
						ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0020" + Uri.encode("#")))), 1);
								dialog.dismiss();
							}
						});
						ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								dialog.cancel();
							}
						});
						ServicesActivity.this.builder.create().show();
						break;
					}
					ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
					ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_rouming_calls_name));
					ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.activte_service_alert_title));
					ServicesActivity.this.builder.setCancelable(true);
					ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0021" + Uri.encode("#")))), 1);
							dialog.dismiss();
						}
					});
					ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					ServicesActivity.this.builder.create().show();
					break;
				case 7:
					if (childPosition != 0) {
						ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
						ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_family_name));
						ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.deactivate_service_alert_title));
						ServicesActivity.this.builder.setCancelable(true);
						ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0030" + Uri.encode("#")))), 1);
								dialog.dismiss();
							}
						});
						ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								dialog.cancel();
							}
						});
						ServicesActivity.this.builder.create().show();
						break;
					}
					ServicesActivity.this.builder = new AlertDialog.Builder(ServicesActivity.this);
					ServicesActivity.this.builder.setTitle(ServicesActivity.this.getString(R.string.service_family_name));
					ServicesActivity.this.builder.setMessage(ServicesActivity.this.getString(R.string.activte_service_alert_title));
					ServicesActivity.this.builder.setCancelable(true);
					ServicesActivity.this.builder.setPositiveButton(ServicesActivity.this.getString(R.string.yes), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*111*0031" + Uri.encode("#")))), 1);
							dialog.dismiss();
						}
					});
					ServicesActivity.this.builder.setNegativeButton(ServicesActivity.this.getString(R.string.no), new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.cancel();
						}
					});
					ServicesActivity.this.builder.create().show();
					break;
				case 8:
					if (childPosition == 0) {
						ServicesActivity.this.startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*166" + Uri.encode("#")))), 1);
						break;
					}
					break;
			}
			return false;
		}
	}
}
