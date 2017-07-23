package uz.dkamaloff.myums.Adapters;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import uz.dkamaloff.myums.R;


public class RecyclerAdapterTariffs extends Adapter<RecyclerAdapterTariffs.ViewHolder> {
	private static final int[] details;
	private static final int[] titles;
	private Context context;
	private int[] images;
	private int position;
	private Builder mBuilder;

	public RecyclerAdapterTariffs(Context context) {
		this.images = new int[]{R.drawable.icon_connect, R.drawable.icon_besh, R.drawable.icon_terminal, R.drawable.icon_333, R.drawable.icon_444, R.drawable.icon_555, R.drawable.icon_777, R.drawable.icon_maxi, R.drawable.icon_ultra, R.drawable.icon_perfect, R.drawable.icon_baraka};
		this.context = context;
	}

	static {
		titles = new int[]{R.string.tarif_connect_name, R.string.tarif_besh_name, R.string.tarif_start_name, R.string.tarif_optima_name, R.string.tarif_444_name, R.string.tarif_555_name, R.string.tarif_777_name, R.string.tarif_maxi_new_name, R.string.tarif_ultra_name, R.string.tarif_perfect_name, R.string.tarif_baraka_name};
		details = new int[]{R.string.tarif_connect_dsc, R.string.tarif_besh_dsc, R.string.tarif_start_dsc, R.string.tarif_optima_dsc, R.string.tarif_444_dsc, R.string.tarif_555_dsc, R.string.tarif_777_dsc, R.string.tarif_maxi_new_dsc, R.string.tarif_ultra_dsc, R.string.tarif_perfect_dsc, R.string.tarif_baraka_dcs};
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout_tarifs, parent, false));
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		holder.itemTitle.setText(titles[position]);
		holder.itemDetail.setText(details[position]);
		holder.itemImage.setImageResource(images[position]);
	}

	@Override
	public int getItemCount() {
		return titles.length;
	}

	class ViewHolder extends RecyclerView.ViewHolder {
		public TextView itemDetail;
		public ImageView itemImage;
		public TextView itemTitle;

		public ViewHolder(View itemView) {
			super(itemView);
			itemTitle = (TextView) itemView.findViewById(R.id.item_title_tarif);
			itemDetail = (TextView) itemView.findViewById(R.id.item_detail_tarif);
			itemImage = (ImageView) itemView.findViewById(R.id.item_image_tarif);
			itemView.setOnClickListener(new C02541(RecyclerAdapterTariffs.this));
		}

		class C02541 implements View.OnClickListener {
			final RecyclerAdapterTariffs val$this$0;

			class C02449 implements DialogInterface.OnClickListener {
				C02449() {

				}

				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*100*010900119*1" + Uri.encode("#")))), 1);
				}
			}

			class C02450 implements DialogInterface.OnClickListener {
				C02450() {
				}

				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*110*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}

			class C02451 implements DialogInterface.OnClickListener {
				C02451() {
				}

				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*112*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}

			class C02462 implements DialogInterface.OnClickListener {
				C02462() {
				}

				public void onClick(DialogInterface dialog, int which) {
					dialog.cancel();
				}
			}

			class C02473 implements DialogInterface.OnClickListener {
				C02473() {
				}

				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*333*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}

			class C02496 implements DialogInterface.OnClickListener {
				C02496() {
				}

				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*444*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}
			class C02495 implements DialogInterface.OnClickListener {
				C02495() {
				}

				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*555*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}



			class C02517 implements DialogInterface.OnClickListener {
				C02517() {
				}

				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*777*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}

			class C02539 implements DialogInterface.OnClickListener {
				C02539() {
				}

				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*105*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}

			class C02542 implements DialogInterface.OnClickListener {
				C02542() {
				}

				@Override
				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*103*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}

			class C02543 implements DialogInterface.OnClickListener {
				public C02543() {
				}

				@Override
				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*111*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}

			class C02544 implements DialogInterface.OnClickListener {
				public C02544() {
				}

				@Override
				public void onClick(DialogInterface dialog, int which) {
					((Activity) RecyclerAdapterTariffs.this.context).startActivityForResult(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ("*171*109*010900119*1" + Uri.encode("#")))), 1);
					dialog.dismiss();
				}
			}

			C02541(RecyclerAdapterTariffs recyclerAdapterTariffs) {
				this.val$this$0 = recyclerAdapterTariffs;
			}

			@Override
			public void onClick(View v) {
				RecyclerAdapterTariffs.this.position = ViewHolder.this.getAdapterPosition();
				switch (position) {
					case 0:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.change_tarif_connect_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02449());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 1:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_besh_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02450());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 2:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_start_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02451());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 3:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_optima_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02473());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 4:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_444_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02496());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 5:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_555_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02495());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 6:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_777_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02517());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 7:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_maxi_new_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02539());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 8:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_ultra_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02542());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 9:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_perfect_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02543());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					case 10:
						RecyclerAdapterTariffs.this.mBuilder = new Builder(RecyclerAdapterTariffs.this.context);
						RecyclerAdapterTariffs.this.mBuilder.setTitle(R.string.channge_tarif_alert);
						RecyclerAdapterTariffs.this.mBuilder.setMessage(R.string.channge_tarif_baraka_alert);
						RecyclerAdapterTariffs.this.mBuilder.setCancelable(true);
						RecyclerAdapterTariffs.this.mBuilder.setPositiveButton(R.string.yes, new C02544());
						RecyclerAdapterTariffs.this.mBuilder.setNegativeButton(R.string.no, new C02462());
						RecyclerAdapterTariffs.this.mBuilder.create().show();
						break;
					default:
				}
			}
		}
	}
}
