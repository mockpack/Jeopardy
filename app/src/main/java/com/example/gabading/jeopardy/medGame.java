package com.example.gabading.jeopardy;

public class medGame {
    int score;
    boolean answer;

    /*public game(){
        score = 0;
        answer = false;
    }*/

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}