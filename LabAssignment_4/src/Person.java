/**
 * 
 * @author karan
 *
 */

/*
 * 
 * Person class contains the name and age of person
 * 
 */
public class Person {
	private String name;
	private float age;
	
	//Getters and Setters
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public float getAge()
	{
		return this.age;
	}
	public void setAge(float age)
	{
		this.age = age;
	}
	
	public Person(String name, float age)
	{
		this.name = name;
		this.age = age;
	}

}
