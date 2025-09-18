import java.util.Scanner;

public class GradeCalculator {
    int math,eng,hindi,che,phy,bio,Total,roll;
    double avg;
    String grade,name;
    Scanner sc = new Scanner(System.in);
    void getMarks(){
        System.out.println("Enter Your Name : ");
        name=sc.nextLine();
        System.out.println("Enter Your Roll NO. : ");
        roll=sc.nextInt();
        System.out.println("Enter Marks of Maths : ");
        math=sc.nextInt();
        System.out.println("Enter Marks of English : ");
        eng=sc.nextInt();
        System.out.println("Enter Marks of Hindi : ");
        hindi=sc.nextInt();
        System.out.println("Enter Marks of Chemistry : ");
        che=sc.nextInt();
        System.out.println("Enter Marks of Physics : ");
        phy=sc.nextInt();
        System.out.println("Enter Marks of Biology : ");
        bio=sc.nextInt();

        Total=math+eng+phy+che+hindi+bio;

        avg=Total/6;
    }
    void gradeCal(){
        if(avg>90){
            grade="A+";
        }
        else if(avg<90 && avg>80){
            grade="A";
        }
        else if(avg<80 && avg>70){
            grade = "B";
        }
        else if(avg<70 && avg>60){
            grade = "C";
        }
        else if(avg<60 && avg>50){
            grade="D";
        }
        else{
            grade="Fail";
        }
    }
    void display(){
        System.out.println("--------Your Details--------");
        System.out.println("Name : "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("Maths : "+math + "  "+"English : "+eng);
        System.out.println("Hindi : "+hindi + "  "+"Chemistry : "+che);
        System.out.println("Physics : "+phy + "  "+"Biology : "+bio);
        System.out.println("Total Marks : "+Total);
        System.out.println("Average Percentage : "+avg);
        System.out.println("Grade : "+grade);
    }
    public static void main(String[] args) {
        GradeCalculator gc= new GradeCalculator();

        gc.getMarks();
        gc.gradeCal();
        gc.display();
    }
}
