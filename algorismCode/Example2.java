package com.estsoft.myapplication;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Example2 {

    //노드끼리 연결됐을때, 최소 시간

    @Test
    public void solution() {
        int[] next_student = new int[]{5, 9, 13, 1, 0, 0, 11, 1, 7, 12, 9, 9, 2};


        int maxvalue = 0;
        int result = 0;
        for (int i = 0; i < next_student.length; i++) {
            int dfsInt = dfs(next_student,i);
            if (dfsInt >= maxvalue) {
                maxvalue = dfsInt;
                result = i;
            }
        }

        System.out.println(result + 1);
    }

    public int dfs(int[] next_student, int index) {
        List<Student> students = init(next_student);
        Stack<Student> stack = new Stack<>();
        Student student = students.get(index);
        student.visited = true;
        students.set(index, student);
        stack.push(students.get(index));
        int maxValue = 0;

        while (!stack.isEmpty()) {
            Student currentStudent = stack.peek();
            int next = currentStudent.nextNode;
            if (currentStudent.nextNode == 0) {
                stack.pop();
                continue;
            }
            Student nextStudent = students.get(next - 1);
            if (!nextStudent.visited && nextStudent.nextNode != 0) {
                nextStudent.visited = true;
                students.set(next - 1, nextStudent);
                stack.push(students.get(currentStudent.nextNode - 1));
                maxValue++;
            } else {
                stack.pop();
            }
        }
        System.out.println("result : " + maxValue);
        return maxValue;
    }

    public List<Student> init(int[] next_student) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < next_student.length; i++) {
            Student student = new Student(i);
            student.addGraph(next_student[i]);
            students.add(student);
        }
        return students;
    }


    class Student {
        Student student;
        int number = 1;
        boolean visited = false;
        int nextNode;

        Student(int number) {
            this.number = number;
        }

        void addGraph(int nextNode) {
            this.nextNode = nextNode;
        }

        void setVisited(boolean visited) {
            this.visited = visited;
        }
    }

}
