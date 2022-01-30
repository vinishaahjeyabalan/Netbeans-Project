/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2017q5;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class GradedActivity {
    private int score;

    public GradedActivity(int score) {
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    
    public int getGrade(int score){
        if(score >= 90){
            return 'A';
        }
        else if(score >= 80){
            return 'B';
        }
        else if(score >= 70){
            return 'C';
        }
        else if(score >= 60){
            return 'D';
        }
        else if(score <60){
            return 'F';
        }
        return ' ';
    }

    @Override
    public String toString() {
        return "Total score: " + score +
               "\nEssay grade: " + getGrade(this.score);
    }
    
    
    
}
