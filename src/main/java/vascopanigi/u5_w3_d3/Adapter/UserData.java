package vascopanigi.u5_w3_d3.Adapter;

import vascopanigi.u5_w3_d3.Adapter.intefaces.DataSource;

public class UserData {
    private String fullName;
    private int age;

    public void getData(DataSource ds){
        fullName = ds.getFullName();
        age = ds.getAge();
    }

    @Override
    public String toString() {
        return "UserData{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
