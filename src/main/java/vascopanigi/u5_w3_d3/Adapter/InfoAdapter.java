package vascopanigi.u5_w3_d3.Adapter;

import vascopanigi.u5_w3_d3.Adapter.intefaces.DataSource;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getFullName(){
        return info.getName() + " " + info.getSurname();
    }
    @Override
    public int getAge(){
        return Period.between(info.getBirthDate(), LocalDate.now()).getYears();
    }
}
