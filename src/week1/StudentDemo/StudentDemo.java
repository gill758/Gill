//May 23
package week1.StudentDemo;

public class StudentDemo
{
    private String name; 

    public StudentDemo()
    {
        this.name = "default";
    }
    
    public StudentDemo(String n)
    {
        this.name = n;
    }
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
