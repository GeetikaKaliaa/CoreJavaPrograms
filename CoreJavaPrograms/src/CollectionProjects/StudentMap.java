package CollectionProjects;
import java.util.*;
public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<Integer,String> studentList = new HashMap<>();
  studentList.put(101,"Vishal");
  studentList.put(102,"Palak");
  studentList.put(103,"Mehak");
  studentList.put(104,"Abhram");
  studentList.put(105,"Mohit");
  
  
  


Map<Integer, String> filter_studentList = new LinkedHashMap<>();

for (Map.Entry<Integer, String> student : studentList.entrySet()) {
    if(student.getKey() > 103){
       filter_studentList.put(student.getKey(), student.getValue());
    }
}
    
System.out.println("Filtered Map: " + filter_studentList);

	}
}


