import java.util.*;
public class Main {
	static Scanner sc=new Scanner(System.in) ;
	public static void main(String[] args) {
		ArrayList<Student> s1=new ArrayList<Student>();
		boolean flag =true;
        while(flag){
        	System.out.println("enter the choice\n 1: add details\n 2:getdetailbyrollno \n 3:getalldetails \n 4:removebyrollno \n 5:exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter roolno");
                    int rollno=sc.nextInt();
                    System.out.println("Enter name");
                    String name=sc.next();
                    System.out.println("Enter standard");
                    int standard=sc.nextInt();
                    s1.add(new Student(rollno,name,standard));
                    break;
                case 2:
                    System.out.println("Enter a rollno to see");
                    int sinrollno=sc.nextInt();
                    Iterator itr=s1.iterator();
                    while(itr.hasNext()){
                        Student ss=(Student)itr.next();
                        if (ss.rollno==sinrollno){
                        	System.out.println(ss.rollno);
                        	System.out.println(ss.name);
                            System.out.println(ss.standard);
                        }
                    }
                    break; 
                case 3:
                    Iterator iitr=s1.iterator();
                    while(iitr.hasNext()){
                        Student sss=(Student)iitr.next();
                        System.out.println(sss.rollno);
                        System.out.println(sss.name);
                        System.out.println(sss.standard);
                        
                    }
                    break;
                
                case 4:
                    System.out.println("Enter a rollno to remove");
                    int sinrerollno=sc.nextInt();
                    Iterator itrr=s1.iterator();
                    while(itrr.hasNext()){
                        Student ssss =  itrr.next();
                        if (ssss.rollno==sinrerollno){
                          s1.remove(ssss);
                        }else {
                        	System.out.println("nothing here to remove");
                        }
                    }
                    break;
                case 5:
                    flag =false;
                    break;
                    
               }
		

	     }
	}
	
}

