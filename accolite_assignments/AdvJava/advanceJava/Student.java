
/* 
 * 
 * Object to store student element from CollegeEntry.XML file, used to write on student_list.csv file and to database using JDBC
 * 
 * */
package advanceJava;

public class Student {
private String name;
private int rollnum;
public Student(String name,int rollnum)
{
this.name=name;
this.rollnum=rollnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollnum() {
	return rollnum;
}
public void setRollnum(int rollnum) {
	this.rollnum = rollnum;
}

}
