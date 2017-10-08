package mode.design.lxy.com.designmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import mode.design.lxy.com.designmode.factory.FactoryActivity;
import mode.design.lxy.com.designmode.prototype.PrototypeActivity;
import mode.design.lxy.com.designmode.responsibility.ResponsibilityActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // 职责链模式
    public void goResponsibility(View view) {
        startActivity(new Intent(this, ResponsibilityActivity.class));
    }

    // 原型设计模式
    public void goPrototype(View view) {
        startActivity(new Intent(this, PrototypeActivity.class));
    }

    //观察者模式
    public void goObserver(View view) {
        Toast.makeText(view.getContext(), "马上更新", Toast.LENGTH_SHORT).show();
    }

    //建造者模式
    public void goBuild(View view) {
        Toast.makeText(view.getContext(), "马上更新", Toast.LENGTH_SHORT).show();
    }

    //工厂方法模式
    public void goFactory(View view) {
        startActivity(new Intent(this, FactoryActivity.class));
    }

}
