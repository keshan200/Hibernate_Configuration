
package lk.ijse;

import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import lk.ijse.entity.my;
import org.hibernate.Session;
import lk.ijse.config.FactoryConfiguration;

import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        FullName fullName=new FullName("tharindu","randika");
        FullName mfullName=new FullName("keshan","silva");
        Student student = new Student();
        my m = new my();

        student.setId(1);
        student.setName(fullName);
        student.setAddress("serupita");

        m.setId(1);
        m.setName(mfullName);
        m.setAddress("kalutara");

        Transaction transaction = session.beginTransaction();

        session.save(m);
        //delete.get,another table

        //session.save(student);

        //session.delete(student);



        transaction.commit();
        session.close();

    }
}
