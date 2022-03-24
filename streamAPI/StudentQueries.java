package streamAPI;

import java.util.*;
import java.util.stream.*;

public class StudentQueries
{
	static void printDepartments(List<Student> list){
		Set<String> departmentList = list.stream()  
            .map(student->student.engDepartment)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
            System.out.println("Departments: "+departmentList); 
	}
	static void printEnrolledAfter2018(List<Student> list){
		List<String> studentEnrolledAfter2018 = list.stream()  
                .filter(student -> student.year_of_enrollment>2018)// filtering data  
                .map(student->student.name)        // fetching price  
                .collect(Collectors.toList()); // collecting as list 
        	System.out.println("Students enrolled after 2018: "+studentEnrolledAfter2018); 
	}
	static void printMaleStudentCS(List<Student> list){
        List<Student> maleCS =list.stream()  
             .filter(student -> student.engDepartment.equalsIgnoreCase("Computer Science") && student.gender.equalsIgnoreCase("Male"))// filtering data  
             .collect(Collectors.toList());
        System.out.println("Male students in Computer Science: "+maleCS);
	}
	static void printMaleFemaleCount(List<Student> list){
        Map<String, Long> countMaleFemale = list.stream()
            .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println("Total students: "+countMaleFemale);
	}
	static void printAverageAge(List<Student> list){
        Map<String, Double> averageAgeMaleFemale = list.stream().collect(
                Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average age of students: "+averageAgeMaleFemale);
	}
	static void printHighestPercentage(List<Student> list){
        Student highestPercentage = list.stream().max((student1, student2)->student1.perTillDate > student2.perTillDate ? 1: -1).get();    
        System.out.println("Student having highest percentage: "+highestPercentage);
	}
	static void printDepartmentStrength(List<Student> list){
        Map<String, Long> departmentStrength = list.stream()
            .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
        System.out.println("Department strength: "+departmentStrength);
	}
	static void printDepartmentPercent(List<Student> list){
        Map<String, Double> departmentPercent = list.stream()
            .collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getPercentage)));
        System.out.println("Average percentage of departments: "+departmentPercent);
	}
	static void printYoungestMaleElectronic(List<Student> list){
        Optional<Student> youngestMaleElectronic = list.stream()
                .filter(student -> student.engDepartment.equalsIgnoreCase("Electronic")).min(new Comparator<Student>() {
                    public int compare(Student student1, Student student2) {
                        return student1.age - student2.age;
                    }
                });
        Student youngestMale = youngestMaleElectronic.orElse(null);
        System.out.println("Youngest Male student in Electronic:- " + youngestMale);
	}
	static void printCountCS(List<Student> list){
        Map<String, Long> countMaleFemaleCS = list.stream()
            .filter(student-> student.engDepartment.equalsIgnoreCase("Computer Science"))
            .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println("Total students in Computer Science: "+countMaleFemaleCS);
	}
	public static void main(String[] args) {
	  List<Student> list = new ArrayList<>();
	  list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electrical", 2019, 72.4));
        list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
	
	  printDepartments(list);
        printEnrolledAfter2018(list);

   	  printMaleStudentCS(list);
        printMaleFemaleCount(list);

        printAverageAge(list);
        printHighestPercentage(list);        

	  printDepartmentStrength(list);
	  printDepartmentPercent(list);

        printYoungestMaleElectronic(list);
        printCountCS(list);
        
	}
}
