/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Garru don
 */
@Entity

public class User {
    @Id
    private String uname;
    private int pwd;
    private String type;

    @Override
    public String toString() {
        return "User{" + "uname=" + uname + ", pwd=" + pwd + ", type=" + type + '}';
    }

    public String getUname() {
        return uname;
    }

    
    @Override
    public boolean equals(Object obj) {
        System.out.println("HI");
         User other = (User) obj;
        if (!this.uname.equalsIgnoreCase(other.uname)) {
            return false;
        }
        if (this.pwd != other.pwd) {
            return false;
        }
        return true;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
