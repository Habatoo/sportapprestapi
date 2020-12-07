package sportapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sportapp.models.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
