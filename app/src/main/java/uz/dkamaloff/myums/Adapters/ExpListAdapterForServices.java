package uz.dkamaloff.myums.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import uz.dkamaloff.myums.R;

public class ExpListAdapterForServices extends BaseExpandableListAdapter{
	private Context _context;
	private HashMap<String, List<String>> _listDataChild;
	private List<String> _listDataHeader;

	public ExpListAdapterForServices(Context context, List<String> listDataHeader, HashMap<String, List<String>> listChildData) {
		this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
	}

	public Object getChild(int groupPosition, int childPosititon) {
		return ((List) this._listDataChild.get(this._listDataHeader.get(groupPosition))).get(childPosititon);
	}

	public long getChildId(int groupPosition, int childPosition) {
		return (long) childPosition;
	}

	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
		String childText = (String) getChild(groupPosition, childPosition);
		if (convertView == null) {
			convertView = ((LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.list_item_services, null);
		}
		((TextView) convertView.findViewById(R.id.lblListItem)).setText(childText);
		return convertView;
	}

	public int getChildrenCount(int groupPosition) {
		return ((List) this._listDataChild.get(this._listDataHeader.get(groupPosition))).size();
	}

	public Object getGroup(int groupPosition) {
		return this._listDataHeader.get(groupPosition);
	}

	public int getGroupCount() {
		return this._listDataHeader.size();
	}



	public long getGroupId(int groupPosition) {
		return (long) groupPosition;
	}

	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		String headerTitle = (String) getGroup(groupPosition);
		if (convertView == null) {
			convertView = ((LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.list_group_services, null);
		}
		TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader_serv);
		lblListHeader.setTypeface(null);
		lblListHeader.setText(headerTitle);
		TextView lblListContext = (TextView) convertView.findViewById(R.id.lblListContext_serv);
		lblListContext.setTypeface(null);
		switch (groupPosition) {
			case 0:
				lblListContext.setText(this._context.getString(R.string.service_qarz_dsc));
				break;
			case 1:
				lblListContext.setText(this._context.getString(R.string.service_2_line_dsc));
				break;
			case 2:
				lblListContext.setText(this._context.getString(R.string.service_vam_zvonili_dsc));
				break;
			case 3:
				lblListContext.setText(this._context.getString(R.string.service_anti_aon_dsc));
				break;
			case 4:
				lblListContext.setText(this._context.getString(R.string.service_4gLte_dsc));
				break;
			case 5:
				lblListContext.setText(this._context.getString(R.string.service_active_checks_dsc));
				break;
			case 6:
				lblListContext.setText(this._context.getString(R.string.service_rouming_calls_dsc));
				break;
			case 7:
				lblListContext.setText(this._context.getString(R.string.service_family_dsc));
				break;
			case 8:
				lblListContext.setText(this._context.getString(R.string.service_super_0_dsc));
				break;
		}
		return convertView;
	}

	public boolean hasStableIds() {
		return false;
	}

	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

}
