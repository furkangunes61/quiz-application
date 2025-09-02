package com.app.quizapplication.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    private int id;
    private String questionText;
    private ArrayList<String> options;
    private String correctAnswer;

    public Quiz() {
        System.out.println("Default constructor");
    }

    public Quiz(int id, String questionText, ArrayList<String> options, String correctAnswer) {
        this.id = id;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getOptionsAsString(){
        return String.join(",", options);
    }

    public void setOptionFromString(String optionsString) {
        this.options = new ArrayList<>(Arrays.asList(optionsString.split(",")));
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return ("ID:" + id +
                "\n Question='" + questionText +
                "\n Options: " + options +
                "\n Correct Answer: '" + correctAnswer
                );
    }
}
