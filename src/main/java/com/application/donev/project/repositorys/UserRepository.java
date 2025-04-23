package com.application.donev.project.repositorys;

import com.application.donev.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {


}
