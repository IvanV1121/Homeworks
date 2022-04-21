package com.IvanV1121.Homework2Part2.Chapter3;

public class Student {

    private String name = "";
    private double totalScore = 0;
    private int quizNumber = 0;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score){
        quizNumber++;
        totalScore += score;
    }

    public double getTotalScore(){
        return totalScore;
    }

    public double getAverageScore(){
        return totalScore/quizNumber;
    }

    @Override
    public String toString() {
        return "Student passed "+ quizNumber + " quizzes, received average score "
                   + this.getAverageScore() + " and total score " + this.getTotalScore() + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass().equals(obj.getClass())) {
            Student student = (Student)obj;
            return this.name.equals(student.name) &&
                        Double.compare(this.getTotalScore(), student.getTotalScore()) == 0 &&
                        this.quizNumber == student.quizNumber;

        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + Double.hashCode(this.getTotalScore());
        result = 31 * result + this.quizNumber;
        return result;
    }

}
