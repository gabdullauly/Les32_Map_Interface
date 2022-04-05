/*
Create a User class with parameters:
- int id
- String login
- String password
-String name
-String surname
+ User ()
+ User (int id, login, passwor, name, surname) Getters and Setters
+ String getData () // This method returns all user data
 */

public class User {
    private int id;
    private String login;
    private String password;
    private String name;
    private String surname;
    public User(){}
    public User(int id, String login, String password, String name, String surname){
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return  password;
    }
    public String getName(){
        return  name;
    }
    public String getSurname(){
        return surname;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getData (){
        return id+" "+login+" "+password+" "+name+" "+surname;
    }
}