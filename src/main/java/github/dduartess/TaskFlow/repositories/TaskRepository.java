package github.dduartess.TaskFlow.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import github.dduartess.TaskFlow.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
