package advanceJava;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XMLParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fileWriter;
		String COMMA_DELIMETER=",";
		String NEW_LINE_SEPERATOR="\n";
		String FILE_HEADER="name,rollnum";
		
		List<Student> studentListCSV=new ArrayList<Student>();
		
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
try{
	DocumentBuilder builder=dbf.newDocumentBuilder();
	Document doc=builder.parse("CollegeEntry.xml");
	NodeList studentList=doc.getElementsByTagName("student");
	
	 fileWriter=new FileWriter("src\\AdvJava\\advanceJava\\student_list.csv");
	fileWriter.append(FILE_HEADER);
	for(int i=0;i<studentList.getLength();i++)
		{
		Node studentXML =studentList.item(i);

		System.out.println("\nCurrent Element :" + studentXML.getNodeName());

		if (studentXML.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) studentXML;

			// printing student attributes
			System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
			System.out.println("Roll No : " + eElement.getElementsByTagName("rollnum").item(0).getTextContent());
			
			
			// adding student attributes into list then writing elements of that list into csv file.
			Student studentCSV=new Student(eElement.getElementsByTagName("name").item(0).getTextContent(),Integer.parseInt(eElement.getElementsByTagName("rollnum").item(0).getTextContent()));;
			studentListCSV.add(studentCSV);
			
			fileWriter.append(NEW_LINE_SEPERATOR);
			fileWriter.append(studentCSV.getName());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(""+studentCSV.getRollnum());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.flush();
			
			

		}
		
		}
	fileWriter.close();
}catch(ParserConfigurationException configurationException)
{
configurationException.printStackTrace();	
}catch(SAXException exception)
{
exception.printStackTrace();	
}catch(IOException ioException)
{
ioException.printStackTrace();	
}

// code to connect to JDBC and entering values into student table

Connection conn;
conn=JDBCConnection.getInstance().Connect();
try{
	PreparedStatement preparedstmnt=conn.prepareStatement(
		"INSERT INTO student (name,rollnum) values(?,?)");

for(Student stud:studentListCSV)
{	
	
		preparedstmnt.setString(0, stud.getName());
		preparedstmnt.setInt(1,stud.getRollnum());
	
	
}
}catch(SQLException exception)
{
exception.printStackTrace();	
}
		
	}

}
