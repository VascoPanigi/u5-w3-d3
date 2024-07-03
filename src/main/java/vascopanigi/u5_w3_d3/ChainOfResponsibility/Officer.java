package vascopanigi.u5_w3_d3.ChainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Officer {
    private Officer nextOfficer;
    private int salary;

    public Officer(int salary) {
        this.salary = salary;
    }

}
