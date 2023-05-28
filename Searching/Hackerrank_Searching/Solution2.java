package Hackerrank_Searching;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] trainingMinutes = input.nextLine().split(" ");
        int[] trainingMinutesInteger = new int[trainingMinutes.length];
        for (int i = 0; i < trainingMinutesInteger.length; i++) {
            trainingMinutesInteger[i] = Integer.parseInt(trainingMinutes[i]);
        }

        int longestStreak = hitungLongestStreak(trainingMinutesInteger);
        int streakMinutes = hitungStreakMinutes(trainingMinutesInteger, longestStreak);

        System.out.println("Longest streak is " + longestStreak + " days (" + streakMinutes + " mins)!");

        input.close();
    }

    public static int hitungLongestStreak(int[] trainingMinutes) {
        int longestStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < trainingMinutes.length; i++) {
            if (trainingMinutes[i] >= 30) {
                currentStreak++;
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }
        return longestStreak;
    }

    public static int hitungStreakMinutes(int[] trainingMinutes, int longestStreak) {
        int streakMinutes = 0;
        int currentMinutes = 0;
        int currentStreak = 0;

        for (int i = 0; i < trainingMinutes.length; i++) {
            if (trainingMinutes[i] >= 30) {
                currentMinutes += trainingMinutes[i];
                currentStreak++;
                if (currentStreak >= longestStreak) {
                    if (currentMinutes > streakMinutes) {
                        streakMinutes = currentMinutes;
                    }
                }
            } else {
                currentMinutes = 0;
                currentStreak = 0;
            }
        }
        return streakMinutes;
    }
}
