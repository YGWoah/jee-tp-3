package ma.enset.jeetp3.web;

import com.example.demo.entities.Patient;
import com.example.demo.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientRestService {
    @Autowired
    private PatientRepository patientRepository;

    @RequestMapping("/patients")
    public Object patients(){
        return patientRepository.findAll();
    }
   @GetMapping("/patients/{id}")
   public Patient findPatient(@PathVariable Long id){
       return patientRepository.findById(id).orElse(null);
   }
}
