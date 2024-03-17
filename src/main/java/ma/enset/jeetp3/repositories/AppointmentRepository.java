package ma.enset.jeetp3.repositories;

import ma.enset.jeetp3.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
}
