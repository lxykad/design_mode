package mode.design.lxy.com.designmode.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import mode.design.lxy.com.designmode.R;

public class PrototypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);

        Student student = new Student();
        student.age = 18;
        student.name = "lxy";

        List<Student> list = new ArrayList<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            try {
                Student studentClone = (Student) student.clone();
                studentClone.age = i + 1;
                list.add(studentClone);

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            try {
                Student studentClone = (Student) student.clone();
                studentClone.age = i + 1;
                list.add(studentClone);

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        }
        long end2 = System.currentTimeMillis();

        long t1 = end1 - start1;
        long t2 = end2 - start2;

        System.out.println("time1=====" + t1);
        System.out.println("time2=====" + t2);
    }
}
