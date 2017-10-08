package mode.design.lxy.com.designmode.responsibility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mode.design.lxy.com.designmode.R;

public class ResponsibilityActivity extends AppCompatActivity {

    private BaseHandler mFather;
    private BaseHandler mMother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsibility);

        mFather = new Father(200);//老爸私房钱最多只有200块
        mMother = new Mother(800);// 农民老妈 辛苦钱也只有800啊

        mFather.setNextHandler(mMother);
    }

    public void takeMoney(View view) {
        mFather.handEvent(100);
    }

    public void takeMoney2(View view) {
        mFather.handEvent(300);
    }

    public void takeMoney3(View view) {
        mFather.handEvent(1000);
    }
}
