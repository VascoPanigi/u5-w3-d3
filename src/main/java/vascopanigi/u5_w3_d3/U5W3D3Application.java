package vascopanigi.u5_w3_d3;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vascopanigi.u5_w3_d3.Adapter.Info;
import vascopanigi.u5_w3_d3.Adapter.InfoAdapter;
import vascopanigi.u5_w3_d3.Adapter.UserData;
import vascopanigi.u5_w3_d3.Adapter.intefaces.DataSource;
import vascopanigi.u5_w3_d3.Composite.Book;
import vascopanigi.u5_w3_d3.Composite.Page;
import vascopanigi.u5_w3_d3.Composite.Section;

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


		// TEST EX 2

		Book book = new Book();
		book.addAuthorToList("Gabibbo");
		book.addAuthorToList("Gerry Scotti");
		book.setPrice(199.99);

		Faker faker = new Faker();

		for (int i = 0; i < 5; i++) {
			Section newSection = new Section(faker.gameOfThrones().character());
			for (int j = 0; j < 50; j++) {
				Page newPage = new Page(1);
				newSection.addComponentToList(newPage);
		}
			book.addBookComponentToList(newSection);
		}
		book.print();
		System.out.println("Number of pages: " + book.getNumberOfPages());
	}
}
