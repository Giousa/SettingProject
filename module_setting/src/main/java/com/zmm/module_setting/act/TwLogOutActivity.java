package com.zmm.module_setting.act;

import android.view.View;
import android.widget.Button;

import com.zmm.module_setting.R;
import com.zmm.module_setting.base.TwBaseActivity;

public class TwLogOutActivity extends TwBaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.tw_activity_setting_logout;
    }

    @Override
    protected void initView() {
        Button quit = (Button) findViewById(R.id.btn_quit);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(TwSettingActivity.class,true);
            }
        });
    }

    @Override
    protected void initData() {

    }
}