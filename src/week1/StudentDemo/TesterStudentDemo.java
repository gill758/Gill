
package week1.StudentDemo;

public class TesterStudentDemo
{
    public static void main(String[] args)
    {
        StudentDemo s1 = new StudentDemo("Jeet");
        //s1.setName("Jeet");
        //System.out.println(s1.getName());
        
        StudentDemo s2 = new StudentDemo("Nabeel");
        //s2.setName("Nabeel");
        //System.out.println(s2.getName());
        
        StudentDemo s3 = new StudentDemo("Saima");
        //s3.setName("Saima");
        //System.out.println(s3.getName());
        
        StudentDemo[] list = new StudentDemo[3]; //array of objects
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i].getName());
        }
    }
    
}