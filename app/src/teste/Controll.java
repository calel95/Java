package teste;

import java.util.*;

public class Controll{

    int [] id = new int[3];
    String [] name = new String[3];

    public void resultado() {
        System.out.println("resultado: " + this.getId());
        System.out.println("resultado: " + this.getName());
    }
    public int getId(){
        return id[i];
    }
    public void setId(int id[i]){
        this.id[i] = id[i];
    }

    public String getName(){
        return name[i];
    }

    public void setName(String name[i]){
        this.name[i] = name[i];
    }

}