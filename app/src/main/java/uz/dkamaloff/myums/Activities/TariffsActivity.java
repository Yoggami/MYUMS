package uz.dkamaloff.myums.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import uz.dkamaloff.myums.Adapters.RecyclerAdapterTariffs;
import uz.dkamaloff.myums.R;


public class TariffsActivity extends AppCompatActivity {
	private RecyclerAdapterTariffs mRecyclerAdapterTariffs;
	private RecyclerView mRecyclerView;
	private RecyclerView.LayoutManager mLayoutManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tariffs);
		setTitle(R.string.title_tariffs_activity);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_tariffs);
		mLayoutManager = new LinearLayoutManager(this);
		mRecyclerView.setLayoutManager(mLayoutManager);
		mRecyclerAdapterTariffs = new RecyclerAdapterTariffs(this);
		mRecyclerView.setAdapter(mRecyclerAdapterTariffs);
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
}
