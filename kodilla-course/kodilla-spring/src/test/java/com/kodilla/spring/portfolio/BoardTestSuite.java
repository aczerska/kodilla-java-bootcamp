package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("This will be done");
        board.getInProgressList().getTasks().add("This is in progress");
        board.getDoneList().getTasks().add("This is done");

        //Then
        String addedTask1 = board.getToDoList().getTasks().get(0);
        String addedTask2 = board.getInProgressList().getTasks().get(0);
        String addedTask3 = board.getDoneList().getTasks().get(0);
        Assert.assertEquals(addedTask1, "This will be done");
        Assert.assertEquals(addedTask2, "This is in progress");
        Assert.assertEquals(addedTask3, "This is done");
    }
}
