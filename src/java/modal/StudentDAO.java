/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Garru don
 */
public class StudentDAO {
    public static List<Student> getListOfStudent(){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        
        List<Student> list1 = new ArrayList<Student>();
        
        Transaction tx = null;
        
        try{
            cf= new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session = sf.openSession();
            tx= session.getTransaction();
            tx.begin();
            
            list1 = session.createQuery("from Student").list();
            
            tx.commit();
        }
        catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
        finally{
            session.close();
            sf.close();
        }
    return list1;
    } 
    
    public boolean add(Student obj){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;        
        Transaction tx = null;
        boolean f=true;
        
        try{
            cf= new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session = sf.openSession();
            tx= session.getTransaction();
            tx.begin();
            
            session.save(obj);
            
            tx.commit();
        }
        catch(Exception e){
            f=false;
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
        finally{
            session.close();
            sf.close();
        }
    return f;
    } 
    
    public void delete(String route){
         Configuration cf=null;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx = null;
        Student db;
        boolean flag= true;
        try{
            cf=new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            System.out.println(route);
            db=(Student)session.get(Student.class,Integer.parseInt(route));
            session.delete(db);
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            flag=false;
            System.out.println(e);
        }
        System.out.println(flag);
     }
    
}
