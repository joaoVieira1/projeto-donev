package com.application.donev.project.repositorys;

import com.application.donev.project.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Long, Task> {

}
