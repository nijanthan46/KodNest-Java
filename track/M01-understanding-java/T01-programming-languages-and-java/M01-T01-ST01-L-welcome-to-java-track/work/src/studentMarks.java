public class studentMarks {
    public static void main(String[] args) {
        int marks1 = 66;
        int marks2 = 42;
        int marks3 = 39;
        int marks4 = 70;
        int marks5 = 68;
        int totalMarks = marks1+marks2+marks3+marks4+marks5;

        double percentage = (totalMarks/500.0)*100;
        
        boolean valid = (marks1 >=0 && marks1 <=100) && 
        (marks2 >=0 && marks2 <=100) &&
        (marks3 >=0 && marks3 <=100) &&
        (marks4 >=0 && marks4 <=100) &&
        (marks5 >=0 && marks5 <=100);

        String result = percentage < 40 ? "Fail" :
                percentage < 50-60 ? "Second Class" :
                percentage <= 70-90 ? "First Class" :
                "Distinction";

                System.out.println(result);

    }
}
