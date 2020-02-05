package asr.aos.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import asr.aos.app.entity.Personne;
import asr.aos.app.repository.EvenementRepository;
import asr.aos.app.repository.PersonneRepository;

@SpringBootApplication
public class KyadaCalendar1Application implements CommandLineRunner {

	@Autowired
	private EvenementRepository evenementRepostory;
	
	@Autowired
	private PersonneRepository per;
	
	public static void main(String[] args) {
		SpringApplication.run(KyadaCalendar1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*DateFormat date=new SimpleDateFormat("dd/MM/yyyy");
		asr.aos.app.entity.Evenement ev=new asr.aos.app.entity.Evenement("essai111", date.parse("30/12/2019"));
		evenementRepostory.save(ev);
		
		evenementRepostory.findAll().forEach(e->{
			
			System.out.println(e.getDescription()+"   "+e.getDateEvenement());
		});
		*/
		
		Personne k=new Personne("Kya","Cloud");
		per.save(k);
		
	}

}
