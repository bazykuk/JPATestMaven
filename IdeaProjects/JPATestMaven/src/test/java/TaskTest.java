
import javatraining.lowclasses.Student;
import javatraining.task.Task;
import org.junit.Test;

import java.util.List;


/**
 * Created by NAW on 18.02.15.
 */

public class TaskTest {

    Task task = new Task();

    @Test
    public void testSaveRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Student student1 = new Student();
        student1.setNameStudent("Иванов А.А.");
        student1.setAgeStudent(19);
        student1.setSexStudent(Student.SexMF.MALE);

        //Записали в БД
        Student student = task.add(student1);

        //Вывели записанную в БД запись
        System.out.println(student);
    }

    @Test
    public void testDeleteRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Student student1 = new Student();
        student1.setNameStudent("Петров А.А.");
        student1.setAgeStudent(20);
        student1.setSexStudent(Student.SexMF.MALE);

        //Записуем его в БД
        Student student = task.add(student1);

        //Удвлем его с БД
        task.delete(student.getName());
    }

    @Test
    public void testSelect() throws Exception {
        //Создаем автомобиль для записи в БД
        Student student1 = new Student();
        student1.setNameStudent("Сергеева И.К.");
        student1.setAgeStudent(18);
        student1.setSexStudent(Student.SexMF.FEMALE);

        //Записываем в БД
        Student student = task.add(student1);

        //Получние с БД
        Student studentFromDB = task.get(student.getName());
        System.out.println(studentFromDB);
    }

    @Test
    public void testUpdate() throws Exception {
        //Создаем автомобиль для записи в БД
        Student student1 = new Student();
        student1.setNameStudent("Мишина Е.А.");
        student1.setAgeStudent(22);
        student1.setSexStudent(Student.SexMF.FEMALE);

        //Записываем в БД
        Student student = task.add(student1);

        student1.setAgeStudent(19);

        //Обновляем
        task.update(student1);

        //Получаем обновленую запись
        Student student2 = task.get(student1.getName());
        System.out.println(student2);
    }

    public void testGetAll() {
        //Создаем автомобиль для записи в БД
        Student student1 = new Student();
        student1.setNameStudent("Иванов А.А.");
        student1.setAgeStudent(19);
        student1.setSexStudent(Student.SexMF.MALE);

        //Создаем автомобиль для записи в БД
        Student student2 = new Student();
        student2.setNameStudent("Петров А.А.");
        student2.setAgeStudent(20);
        student2.setSexStudent(Student.SexMF.MALE);

        //Создаем автомобиль для записи в БД
        Student student3 = new Student();
        student3.setNameStudent("Сергеева И.К.");
        student3.setAgeStudent(18);
        student3.setSexStudent(Student.SexMF.FEMALE);

        //Сохраняем все авто
        task.add(student1);
        task.add(student2);
        task.add(student3);

        //Получаем все авто с БД
        List<Student> cars = task.getAll();

        //Выводим полученый список авто
        for (Student c : cars) {
            System.out.println(c);
        }
    }

}