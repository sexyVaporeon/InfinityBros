package InfinityBros.services;

import InfinityBros.models.User;

import javax.lang.model.util.ElementScanner7;

public class loginService {
    public loginService() {
        this.sql=new sqlService();
    }


    private sqlService sql;

    public boolean createUser(String email, String password){
        boolean res = false;
        User user = new User(email,password);
        try {
            sql.insertNewUser(user);
            res= true;
        }
        catch (Exception e){
        }
        finally {
            return res;
        }
    }

    public User login(String email,String password){
        User user = null;
        try {
            user = sqlService.findUser(email,password);
        } catch(Exception e){}
        finally {
            return user;
        }
    }

    

}
