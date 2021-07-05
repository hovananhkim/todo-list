package com.openwt.task.repositories;

import com.openwt.task.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    @Query(value = "SELECT t FROM Task t where t.title LIKE CONCAT('%',:key ,'%') OR t.detail LIKE CONCAT('%',:key ,'%')")
    Iterable<Task> findByTitleAndDetailContaining(@Param("key") String key);

    @Query(value = "SELECT CASE WHEN COUNT(t)>0 THEN true ELSE false END FROM Task t where t.title=?1 AND t.detail=?2")
    boolean findTask(String title, String detail);
}