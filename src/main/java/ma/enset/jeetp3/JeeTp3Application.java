package ma.enset.jeetp3;

import lombok.AllArgsConstructor;
import lombok.Data;
import ma.enset.jeetp3.entities.Patient;
import ma.enset.jeetp3.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@AllArgsConstructor
@SpringBootApplication
public class JeeTp3Application implements CommandLineRunner{

//    private PatientRepository patientRepository;
    public static void main(String[] args) {

        SpringApplication.run(JeeTp3Application.class, args);
        System.out.println("The application is running...");
    }


    @Override
    public void run(String... args) throws Exception {
//        patientRepository.save(new Patient(null, "Imane Bahyaoui",230,true , null));
//        patientRepository.save(new Patient(null, "Mohammed Mouddir",554,true , null));
//        patientRepository.save(new Patient(null, "Yassine Bahiyaoui",930,true , null));
//        patientRepository.save(new Patient(null,"Hmaza Negadi", 230,true , null));
    }
}
