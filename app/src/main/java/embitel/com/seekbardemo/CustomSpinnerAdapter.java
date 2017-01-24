package embitel.com.seekbardemo;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by emb-sadabir on 19/10/16.
 */

public class CustomSpinnerAdapter extends ArrayAdapter<String> {

    private final Context mContext;
    private List<String> mSpinnerListItems;
    private int mSelectedIndex = -1;

    public CustomSpinnerAdapter(Context context, int textViewResourceId,
            List<String> spinnerListItems) {
        super(context, textViewResourceId, spinnerListItems);
        this.mSpinnerListItems = spinnerListItems;
        this.mContext = context;
        this.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }

    public void setSelection(int position) {
        mSelectedIndex = position;
        notifyDataSetChanged();
    }


    @Override
    public View getDropDownView(int position, View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.mood_spinner_dropdown, parent, false);
        }
        RelativeLayout spinnerLayout = (RelativeLayout) row.findViewById(
                R.id.spinner_dropdown_list);
        TextView label = (TextView) row.findViewById(R.id.tvSpinnerItem);
        View dividerView = row.findViewById(R.id.divider);
        label.setText(mSpinnerListItems.get(position));
        ImageView icon = (ImageView) row.findViewById(R.id.imgDropDown);
        if (position == 0) {
            icon.setVisibility(View.VISIBLE);
            icon.setImageResource(R.drawable.spinner_arrow_up);
            icon.setAlpha(0.8f);
            dividerView.setVisibility(View.VISIBLE);
            dividerView.setAlpha(0.8f);
        } else {
            dividerView.setVisibility(View.GONE);
            icon.setVisibility(View.GONE);
        }
        if (mSelectedIndex == position) {
            spinnerLayout.setBackgroundColor(Color.parseColor("#e7e9ee"));
        } else {
            spinnerLayout.setBackgroundColor(Color.WHITE);
        }
        return row;
    }
}