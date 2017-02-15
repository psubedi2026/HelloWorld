package com.novauc;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {


        HashMap<String, Person>  people = new  HashMap<String, Person> ();


        people.put("George", new Person("George Washington",285, false));
        people.put("Thomas", new Person("Thomas Jefferson",274, false));
        people.put("Abraham", new Person("Abraham Lincoln",208, false));
        people.put("George", new Person("George H W Bush",90, true));
        people.put("Donald", new Person("Donald Trump",70, true));

        Person pres  = people.get("Abraham");
        System.out.println("Abraham's initial age: " + pres.getAge());

        pres.setAge(50);

        Person pres2 = people.get("Abraham");

        System.out.println("Abraham's new age: " + pres2.getAge());




    }
}






