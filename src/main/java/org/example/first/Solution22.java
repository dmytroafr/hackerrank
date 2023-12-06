package org.example.first;

import java.util.*;

public class Solution22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, name, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(Comparator.comparingDouble(Student::getCgpa).reversed()
                .thenComparing(Student::getName)
                .thenComparingInt(Student::getId));

//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                double diff = o1.getCgpa()-o2.getCgpa();
//
//                if (diff<=0){
//                    if (diff==0){
//                        if (o1.getName().compareTo(o2.getName())<=0){
//                            if (o1.getName().compareTo(o2.getName())==0){
//                                return o1.getId()-o2.getId();
//                            }
//                            return -1;
//                        }
//                        return 1;
//                    }
//                    return 1;
//                }
//                return -1;
//            }
//        });
        for(Student st: studentList){
            System.out.println(st.getName());
        }
    }
}