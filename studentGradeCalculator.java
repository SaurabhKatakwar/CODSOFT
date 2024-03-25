package TASK2;

import java.util.Scanner;
class percentageCal{
    double percentageCalculator(int markArray[], double sum){
        int length = markArray.length;
        double percentage = sum/(double)length;
        return percentage;
    }
}
class gradeCal{
    char gradeCalculator(double percentage){
        if(percentage>90){
            return 'A';
        } else if (percentage>80) {
            return 'B';
        } else if (percentage>70) {
            return 'C';
        }else if(percentage>60){
            return 'D';
        } else if (percentage>45) {
            return 'E';
        }else {
            return 'F';
        }
    }
}
public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of subject: ");
        int numberOfSubject = scan.nextInt();
        double sum=0,total=numberOfSubject*100;
        int markArray[] = new int[numberOfSubject];
        for (int i = 0; i < markArray.length; i++) {
            System.out.printf("Enter Marks For Subject %d = ",i+1);
            markArray[i] = scan.nextInt();
            sum+=markArray[i];
        }

        percentageCal perObj = new percentageCal();
        double percentage = perObj.percentageCalculator(markArray,sum);

        gradeCal gradeObj = new gradeCal();
        char Grade = gradeObj.gradeCalculator(percentage);

        System.out.printf("Total Marks Obtain %d out of %d\n",(int)sum, (int)total);
        System.out.printf("Average Percentage is: %.2f \n" , percentage);
        System.out.println("Grade Is: " + Grade);

    }
}
