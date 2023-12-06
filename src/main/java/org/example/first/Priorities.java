package org.example.first;

import java.util.*;

public class Priorities {
    private final Queue<Student> students = new PriorityQueue<>((o1, o2) -> {
        if (Double.compare(o1.getCgpa(),o2.getCgpa())==0){
            if (o1.getName().compareTo(o2.getName())==0){
                return Integer.compare(o1.getId(),o2.getId());
            }
            return o1.getName().compareTo(o2.getName());
        }
        return Double.compare(o2.getCgpa(),o1.getCgpa());
    });

    public List<Student> getStudents(List<String> events) {
        for (String str:events) {
            if (str.trim().equals("SERVED")){
                students.poll();
            } else {
                String[] addCommand = str.trim().split("\\s");
                if (addCommand[0].equals("ENTER")) {
                    int id = Integer.parseInt(addCommand[3]);
                    String name = addCommand[1];
                    double cgpa = Double.parseDouble(addCommand[2]);
                    students.offer(new Student(id,name,cgpa));
                }
            }
        }
        List<Student> result = new ArrayList<>();
        while (!students.isEmpty()){
            result.add(students.poll());
        }
        return result;
    }
}
