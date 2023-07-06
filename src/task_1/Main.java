package task_1;
import java.util.HashMap;
import java.util.Optional;
public class Main {
	static HashMap<Integer,student> students=new HashMap<>();
	public static void main(String[] args) {
		address a=new address("region","city");
		students.put(0, new student("Name",a));
		students.put(1, new student("Name_1"));
		students.put(2, new student(null,null));
		students.put(3, new student(null));
		students.put(4, null);
		printStudentInfo();
	}
	private static void printStudentInfo() {
		students.entrySet().stream().map(s->getOrNull(s.getKey())).forEach(s->System.out.println("Student "+s.getName()+", "+s.getAddress()));
	}
	private static Optional<student> getByID(int id){
		return Optional.ofNullable(students.get(id));
	}
	private static student getOrNull(int id) {
		return getByID(id).orElse(new student("null"));
	}
}
