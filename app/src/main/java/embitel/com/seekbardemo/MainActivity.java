package embitel.com.seekbardemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import com.appyvet.rangebar.RangeBar;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private float mDensity;
    private CustomSpinnerAdapter mSpinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mSpinner = (Spinner) findViewById(R.id.spInfluenceType);
        List<String> dataset = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        mSpinnerAdapter = new CustomSpinnerAdapter(this,
                R.layout.spinner_item, dataset);
        mSpinner.setAdapter(mSpinnerAdapter);
        mSpinnerAdapter.setSelection(mSpinner.getSelectedItemPosition());

        mDensity = getResources().getDisplayMetrics().density;

        // Gets the RangeBar
        RangeBar rangeBar1 = (RangeBar) findViewById(R.id.rangebar1);
        // modify range bar as per our design
        rangeBar1.setRangeBarEnabled(false);
        rangeBar1.setDrawTicks(false);
        rangeBar1.setConnectingLineColor(Color.parseColor("#f14f66"));
        rangeBar1.setSelectorColor(Color.parseColor("#ffffff"));
        rangeBar1.setPinColor(Color.parseColor("#f14f66"));
        rangeBar1.setTickStart(0f);
        rangeBar1.setTickEnd(5f);
        rangeBar1.setTickInterval(1f);
        rangeBar1.setTemporaryPins(false);
        rangeBar1.setSeekPinByIndex(0);
        rangeBar1.setBarColor(Color.parseColor("#2F333C"));
        if (mDensity <= 1.5) { // hdpi and below
            rangeBar1.setPinRadius(30f);
            rangeBar1.setBarWeight(6f);
            rangeBar1.setConnectingLineWeight(4f);
        } else if (mDensity > 1.5 && mDensity <= 2.0) { //xhdpi
            rangeBar1.setPinRadius(40f);
            rangeBar1.setBarWeight(10f);
            rangeBar1.setConnectingLineWeight(5f);
        } else if (mDensity > 2.0 && mDensity < 3.0) { // xxhdpi
            rangeBar1.setPinRadius(50f);
            rangeBar1.setBarWeight(12f);
            rangeBar1.setConnectingLineWeight(6f);
        } else if (mDensity >= 3.0) { // above xxhdpi
            rangeBar1.setPinRadius(60f);
            rangeBar1.setBarWeight(14f);
            rangeBar1.setConnectingLineWeight(7f);
        }

        RangeBar rangeBar2 = (RangeBar) findViewById(R.id.rangebar2);
        customSeekBar(rangeBar2);


        float density = getResources().getDisplayMetrics().density;
        RangeBar mRangeBar = (RangeBar) findViewById(R.id.rangebar3);
        mRangeBar.setRangeBarEnabled(false);
        mRangeBar.setDrawTicks(false);
        mRangeBar.setConnectingLineColor(Color.parseColor("#f14f66"));
        mRangeBar.setSelectorColor(Color.parseColor("#ffffff"));
        mRangeBar.setPinColor(Color.parseColor("#f14f66"));
        mRangeBar.setBarColor(Color.parseColor("#2F333C"));
        if (density <= 1.5) { // hdpi and below
            mRangeBar.setPinRadius(30f);
            mRangeBar.setBarWeight(6f);
            mRangeBar.setConnectingLineWeight(4f);
        } else if (density > 1.5 && density <= 2.0) { //xhdpi
            mRangeBar.setPinRadius(40f);
            mRangeBar.setBarWeight(10f);
            mRangeBar.setConnectingLineWeight(5f);
        } else if (density > 2.0 && density < 3.0) { // xxhdpi
            mRangeBar.setPinRadius(50f);
            mRangeBar.setBarWeight(12f);
            mRangeBar.setConnectingLineWeight(6f);
        } else if (density >= 3.0) { // above xxhdpi
            mRangeBar.setPinRadius(60f);
            mRangeBar.setBarWeight(14f);
            mRangeBar.setConnectingLineWeight(7f);
        }
        mRangeBar.setTickStart(0f);
        mRangeBar.setTickEnd(5f);
        mRangeBar.setTickInterval(1f);
        mRangeBar.setTemporaryPins(false);
        mRangeBar.setSeekPinByIndex(2);
    }

    private RangeBar customSeekBar(RangeBar rangeBar) {
        rangeBar.setRangeBarEnabled(false);
        rangeBar.setDrawTicks(false);
        rangeBar.setConnectingLineColor(Color.parseColor("#44d2af"));
        rangeBar.setConnectingLineWeight(7f);
        rangeBar.setBarColor(Color.parseColor("#2F333C"));
        rangeBar.setBarWeight(14f);
        rangeBar.setSelectorColor(Color.parseColor("#ffffff"));
        rangeBar.setPinColor(Color.parseColor("#44d2af"));
        rangeBar.setPinRadius(60f);
        rangeBar.setTickStart(0f);
        rangeBar.setTickEnd(5f);
        if (mDensity <= 1.5) { // hdpi and below
            rangeBar.setPinRadius(30f);
            rangeBar.setBarWeight(6f);
            rangeBar.setConnectingLineWeight(4f);
        } else if (mDensity > 1.5 && mDensity <= 2.0) { //xhdpi
            rangeBar.setPinRadius(40f);
            rangeBar.setBarWeight(10f);
            rangeBar.setConnectingLineWeight(5f);
        } else if (mDensity > 2.0 && mDensity < 3.0) { // xxhdpi
            rangeBar.setPinRadius(50f);
            rangeBar.setBarWeight(12f);
            rangeBar.setConnectingLineWeight(6f);
        } else if (mDensity >= 3.0) { // above xxhdpi
            rangeBar.setPinRadius(60f);
            rangeBar.setBarWeight(14f);
            rangeBar.setConnectingLineWeight(7f);
        }
        rangeBar.setPinTextColor(Color.parseColor("#000000"));
        rangeBar.setTickInterval(1f);
        rangeBar.setTemporaryPins(false);
        rangeBar.setSeekPinByIndex(0);
        return rangeBar;
    }
}
