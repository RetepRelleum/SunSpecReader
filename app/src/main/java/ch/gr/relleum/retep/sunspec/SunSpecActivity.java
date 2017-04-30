package ch.gr.relleum.retep.sunspec;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import ch.retep.relleum.modbus.Read0X03;


public class SunSpecActivity extends AppCompatActivity {



    private ViewFlipper mViewFlipper;

    private SunSpecList sunSpecList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Read0X03.setNoOutput(false);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.activity_main);
        SunSpecScan sunSpecScan = new SunSpecScan();
        sunSpecScan.onCreate(this);
        sunSpecList = new SunSpecList();
        sunSpecList.onCreate(this);

        mViewFlipper = (ViewFlipper) findViewById(R.id.Id_view_flipper);
        ImageButton buttonLinks = (ImageButton) findViewById(R.id.Id_buttonLinks);
        ImageButton buttonRechts = (ImageButton) findViewById(R.id.ID_buttonRechts);
        buttonLinks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mViewFlipper.showPrevious();
            }
        });
        buttonRechts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mViewFlipper.showNext();
            }
        });
    }

    public void updateList() {
        sunSpecList.updateList();
        mViewFlipper.setDisplayedChild(1);
    }

}


