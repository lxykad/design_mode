package mode.design.lxy.com.designmode.prototype;

/**
 * Created by lxy on 2017/10/7.
 */

public class Student implements Cloneable {
    public String name;
    public int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Student student = (Student) super.clone();

        student.name = this.name;
        student.age = this.age;

        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
