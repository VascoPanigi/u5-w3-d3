package vascopanigi.u5_w3_d3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vascopanigi.u5_w3_d3.Adapter.Info;
import vascopanigi.u5_w3_d3.Adapter.InfoAdapter;
import vascopanigi.u5_w3_d3.Adapter.UserData;
import vascopanigi.u5_w3_d3.Adapter.intefaces.DataSource;

import java.time.LocalDate;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		// TEST EX 1
		Info info = new Info();
		info.setName("Mario");
		info.setSurname("Rossi");
		info.setBirthDate(LocalDate.of(1990, 1, 1));

		DataSource dataSource = new InfoAdapter(info);
		UserData userData = new UserData();
		userData.getData(dataSource);

		System.out.println(userData);
	}
}
