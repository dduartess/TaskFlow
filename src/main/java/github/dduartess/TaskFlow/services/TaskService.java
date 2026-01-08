package github.dduartess.TaskFlow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import github.dduartess.TaskFlow.entities.Task;
import github.dduartess.TaskFlow.repositories.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> findAll(){
        return repository.findAll();
    }

    public Task findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Task save(Task task) {
        return repository.save(task);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Task update(Long id, Task task) {
        Task existingTask = repository.getReferenceById(id);
        updateData(existingTask, task);
        return repository.save(existingTask);
     }

    private void updateData(Task existingTask, Task task) {
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setStatus(task.getStatus());
    }
}
