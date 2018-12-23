/*
    StaXParser 
 */
package university;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
/**
 *
 * @author China Moxey
 */
public class Parser {
    static final String FIRSTNAME = "FirstName";
    static final String LASTNAME = "LastName";
    static final String AGE = "age";
    static final String GENDER = "gender";
    static final String SSN = "SSN";
    static final String MAJOR = "major";
    static final String STARTDATE = "startDate";
    static final String EXPECTEDGRADUATION ="expectedGraduation";
    
    @SuppressWarnings({"unchecked","null"})
        public List<Student> readStudents(String Student){
            List<Student> students = new ArrayList<>();
            
            try{
                //Create new XMLInputFactory
                XMLInputFactory inputFactory = XMLInputFactory.newInstance();
                //Setup a new eventReader
                InputStream in = new FileInputStream(Student);
                XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
                //read the XML document 
                Student student = null;
                
                while(eventReader.hasNext())
                {
                    XMLEvent event = eventReader.nextEvent();
                
                    if(event.isStartElement())
                    {
                      StartElement startElement = event.asStartElement();
                      //If we have an item element, we create a new item 
                        if(startElement.getName().getLocalPart().equals(FIRSTNAME))
                        {
                           student = new Student();
                           //We read the attributes from this tag and add last name 
                           
                           //attribute to our object
                         Iterator<Attribute> attributes = startElement.getAttributes();   
                      while(attributes.hasNext())
                         {
                           Attribute attribute = attributes.next();
                           if(attribute.getName().toString().equals(LASTNAME))
                           {
                               student.setLastName(attribute.getValue());
                           }
                         }
                        }
                        if(event.isStartElement())
                        {
                        if(event.asStartElement().getName().getLocalPart().equals(AGE))
                            {
                                event = eventReader.nextEvent();
                                student.setAge(event.asCharacters().getData());
                                continue;
                            }
                        }
                     if(event.asStartElement().getName().getLocalPart().equals(GENDER))
                        {
                            event = eventReader.nextEvent();
                            student.setGender(event.asCharacters().getData());
                            continue;
                        }
                    }
                    if(event.asStartElement().getName().getLocalPart().equals(SSN))
                    {
                        event = eventReader.nextEvent();
                        student.setSSN(event.asCharacters().getData());
                        continue;
                    } 
                   if(event.asStartElement().getName().getLocalPart().equals(MAJOR))
                     {
                         event = eventReader.nextEvent();
                         student.setMajor(event.asCharacters().getData());
                         continue;
                        }
                 if(event.asStartElement().getName().getLocalPart().equals(STARTDATE))
                   {
                      event = eventReader.nextEvent();
                      student.setStartDate(event.asCharacters().getData());
                      continue;
                   }
        if(event.asStartElement().getName().getLocalPart().equals(EXPECTEDGRADUATION))
                 {
                     event = eventReader.nextEvent();
                     student.setExpectedGraduation(event.asCharacters().getData());
                     continue;
                 }
                //If we reach the end of an item element, we add it to the list 
                if(event.isEndElement())
                {
                    EndElement endElement = event.asEndElement();
                        if(endElement.getName().getLocalPart().equals(FIRSTNAME))
                        {
                            students.add(student);
                        }
                }
              }
               
            }
            catch(FileNotFoundException | XMLStreamException e){}
            
            return students;
        }
    
    
}
