package javatraining.task;

import javatraining.lowclasses.Student;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;


/**
 * Created by NAW on 18.02.15.
 */

public class Task {

    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();

    public Student add(Student student) {
        em.getTransaction().begin();
        Student studentFromDB = em.merge(student);
        em.getTransaction().commit();
        return studentFromDB;
    }

    public void delete(String name) {
        em.getTransaction().begin();
        em.remove(get(name));
        em.getTransaction().commit();
    }

    public Student get(String name) {
        return em.find(Student.class, name);
    }

    public void update(Student student) {
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
    }

    public List<Student> getAll() {
        TypedQuery<Student> namedQuery = em.createNamedQuery("Student.getAll", Student.class);
        return namedQuery.getResultList();
    }

}