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
public class RouteDAO {
    
    public static List<Route> getListOfRoute(){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
           List<Route> list1 = new ArrayList<Route>();
        
        Transaction tx = null;
         try{
            cf= new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session = sf.openSession();
            tx= session.getTransaction();
            tx.begin();
            
            list1 = session.createQuery("from Route").list();
            
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
}
