
import java.util.ArrayList;

public class EmployeeSkillAssignment {

    static void findTeams(int[] arr, int index, int target,
                          ArrayList<Integer> current, int sum) {

        if (sum == target) {
            System.out.println(current);
            return;
        }

        if (index == arr.length || sum > target)
            return;

        current.add(arr[index]);
        findTeams(arr, index + 1, target, current, sum + arr[index]);

        current.remove(current.size() - 1);
        findTeams(arr, index + 1, target, current, sum);
    }

    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, 0, target, new ArrayList<>(), 0);
    }
}
