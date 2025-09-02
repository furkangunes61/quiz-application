package com.app.quizapplication.service;

import com.app.quizapplication.model.Quiz;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class QuestionsService {

    private final Map<Integer, Quiz> questions = new HashMap<>();
    private int nextId = 1;

    public ArrayList<Quiz> getQuizzesList() {
        ArrayList<Quiz> valueList = new ArrayList<>(questions.values());
        return valueList;
    }

    public Quiz getQuizById(int id) {
        return questions.get(Integer.valueOf(id));
    }

    public int getNextId() {
        return nextId++;
    }

    public boolean addQuiz(Quiz quiz) {
        Integer quizId = quiz.getId();

        if (questions.containsKey(quiz)){
            return false;
        } else {
            questions.put(quizId, quiz);
            return true;
        }
    }

    public boolean editQuiz(Quiz quiz) {
        Integer quizId = quiz.getId();

        if (questions.containsKey(quizId)){
            questions.put(quizId, quiz);
            return true;
        } else {
            return false;
        }
    }
    public boolean deleteQuiz(int id) {
        Integer quizId = Integer.valueOf(id);

        if (questions.containsKey(quizId)){
            questions.remove(quizId);
            return true;
        } else {
            return false;
        }
    }

    public int submitQuiz(ArrayList<Quiz> list) {
        int result = 0;

        for (Quiz quiz : list) {
            Quiz quizInLıst = questions.get(quiz.getId());
            if (quizInLıst.getCorrectAnswer().equals(quiz.getCorrectAnswer())){
                result++;
            }
        }
        return result;
    }

}
