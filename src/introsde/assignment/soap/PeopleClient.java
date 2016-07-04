package introsde.assignment.soap;

import java.util.List;

import introsde.assignment.soap.ws.*;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.xml.ws.Holder;

public class PeopleClient{
	
		// these are the necessary functions (gets and puts) for resources.java
        public static PeopleService service = new PeopleService();
        public static People people = service.getPeopleImplPort();
        
        public static Person getUserDetail() throws Exception {
        	Person per = people.readPerson(1);
        	return per;
        }
        
        public static List<Goals> getAllGoals()throws Exception {
        	List<Goals> glist = people.readAllGoals();
        	return glist;
        }
        
        public static Goals getGoalById(int id)throws Exception {
        	Goals goal = people.readGoal(id);
        	return goal;
        }
     
        public static List<LifeStatus> getAllLifes()throws Exception {
        	List<LifeStatus> LSlist = people.readAllLifeStatus();
        	return LSlist;
        }
        
        public static LifeStatus getLsById(int id)throws Exception {
        	LifeStatus ls = people.readLifeStatus(id);
        	return ls;
        }
        
        
        
        public static void updateGoalStatus(int idGoal, String goalName, String goalValue, String measureType)throws Exception{
        	Goals newg = people.readGoal(idGoal);
        	newg.setGoalName(goalName);
        	newg.setGoalValue(goalValue);
        	newg.setMeasureType(measureType);
            Holder<Goals> hgoal = new Holder<Goals>(newg);
			people.updateGoal(hgoal);
			
        }
        
        public static LifeStatus updateLifeStatus(int idLs, String measureName, String Value)throws Exception{
        	LifeStatus newls = people.readLifeStatus(idLs);
        	newls.setMeasureName(measureName);
        	newls.setValue(Value);
            Holder<LifeStatus> hls = new Holder<LifeStatus>(newls);
			people.updateLifeStatus(hls);
			return newls;
        }
        
        
        public static void updateUserStatus(int Uid, String name, String lastname, String email, String gender, int age)throws Exception{
        	System.out.println("Updating inside client..."+Uid+"---"+age+"---"+email+"---"+gender+"---"+lastname+"---"+name);
        	Person user = people.readPerson(Uid);
        	user.setIdPerson(Uid);
            user.setName(name);
        	user.setLastname(lastname);
        	user.setEmail(email);
        	user.setAge(age);
        	user.setGender(gender);
        	System.out.println("Updating inside USER..."+user.getAge()+"---"+user.getName()+"---");
        	Holder<Person> huser = new Holder<Person>(user);      
            System.out.println("person name");
            System.out.println("huser lastname  "+huser.value.getLastname());
            Holder<Person> person = huser;
            System.out.println("person name  "+person.value.getName());
			people.updatePerson(person);
            people.updatePerson(huser);
            people.updatePerson(huser);
			System.out.println("Updating done"+huser.value.getLastname());
			System.out.println("DONE");
        }
        
        
}

