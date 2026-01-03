package datastructure.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivitySelection {

    public static void main(String[] args) {
        int[] start_time = {2,6,4,10,13,7};
        int[] finish_time = {5,10,8,12,14,15};

        String[] activities = {"Homework" , "Presentation" , "Term paper" , "Volleyball practice" , "Biology lecture" , "Hangout"};
        List selected_activities = new ArrayList<String>();

        //step 1: rearrange our data(activities) and start_time in ascending using finish time of each
        int n = start_time.length;
        for (int i = 0; i < n; i++) {
            for (int j =  i + 1; j < n; j++) { // when we start from j = 0 it will arrange in descending order
                if(finish_time[i] > finish_time[j]) {
                    //swap
                    int temp_f_time = finish_time[j];
                    int temp_s_time = start_time[j];
                    String temp_activity = activities[j];

                    finish_time[j] = finish_time[i];
                    finish_time[i] = temp_f_time;

                    start_time[j] = start_time[i];
                    start_time[i] = temp_s_time;

                    activities[j] = activities[i];
                    activities[i] = temp_activity;

                }
            }

        }


        System.out.println("Start Time: "+ Arrays.toString(start_time));
        System.out.println("Finish Time: "+ Arrays.toString(finish_time));
        System.out.println("Activities : "+ Arrays.toString(activities));

        int start_pos = 0;
        //step 2:
        selected_activities.add(activities[start_pos]);

        for (int pos = 1; pos < n; pos++) {
            if (finish_time[start_pos] <= start_time[pos]) {
                selected_activities.add(activities[pos]);
                start_pos = pos;
            }
        }

        System.out.println("Selected Activities: "+selected_activities.toString());


    }
}
