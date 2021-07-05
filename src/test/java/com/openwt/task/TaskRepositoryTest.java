//package com.openwt.task;
//
//import com.openwt.task.models.Task;
//import com.openwt.task.repositories.TaskRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TaskRepositoryTest {
//    @Autowired
//    private TaskRepository taskRepository;
//
//    @Test
//    public void test_findByTitleContaining() {
//        Task task = new Task();
//        task.setId(1);
//        task.setTitle("TaskApi");
//        task.setDetail("Ngay mai dealine");
//        taskRepository.save(task);
//        assertNotNull(taskRepository.findByTitleAndDetailContaining("TaskApi"));
//        assertEquals(null, taskRepository.findByTitleAndDetailContaining("Abc"));
////        assertNull(taskRepository.findByTitleContaining("Abc"));
//    }
//}