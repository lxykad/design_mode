package mode.design.lxy.com.designmode.build;

/**
 * Created by lxy on 2017/10/6.
 */

public class Person {
    private String mName;
    private int mAge;
    private int mHeight;
    private int mWeight;

    public Person(Builder builder) {
        mName = builder.name;
        mAge = builder.age;
        mHeight = builder.height;
        mWeight = builder.weight;
    }

    /**
     * 定义一个静态内部类builder，内部成员变量和外部一样
     * 提供一个build方法 返回外部类对象
     */
    public static class Builder {
        private String name;
        private int age;
        private int height;
        private int weight;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    // 外部创建person对象
    public void createPerson() {
        Builder builder = new Builder();
        Person person = builder
                .setAge(18)
                .setName("lxy")
                .setHeight(179)
                .setWeight(75)
                .build();

    }
}
