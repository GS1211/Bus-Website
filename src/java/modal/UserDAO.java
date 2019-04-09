/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Garru don
 */
public class UserDAO {
    public boolean checkUser(User obj){
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        User u=null;
        try{
            cf= new Configuration();
            cf.configure("hibernatecfg/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session = sf.openSession();
            Transaction t= session.beginTransaction();
            
            u = (User)session.get(User.class,obj.getUname());
            System.out.println(u);
            t.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            
            System.out.println("Exception caught:"+ e);
            e.printStackTrace();
        }
        if(u == null){
            return false;
        }
        return obj.equals(u);
    }
}
