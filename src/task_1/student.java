package task_1;

import java.util.Optional;

public class student {
	private String name;
	private Optional<address> address;
	public student(String name) {
		this.name=name;
	}
	public student(String name,address address) {
		this.name=name;
		this.address=Optional.ofNullable(address);
	}
	public String getName() {
		return this.name;
	}
	public Optional<address> getAddress(){
		return this.address;
	}
}
