import java.util.*;

public class prblm1700 {

    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int student : students) {
            list.add(student); 
        }

        Stack<Integer> stack = new Stack<>();
        for(int i = sandwiches.length-1; i >= 0; i--){
            stack.push(sandwiches[i]);
        }
        for(int i = 0; i < list.size(); i++){
            if(students[i] == stack.peek()){
                stack.pop();
            }
            else{
                int removed = list.remove(i);
                list.add(removed);
            }

        }
        if (stack.isEmpty()) {
            return 0;
        }
        return stack.size();
    }
}