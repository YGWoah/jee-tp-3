package ma.enset.jeetp3.repositories;

import com.example.demo.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
}
