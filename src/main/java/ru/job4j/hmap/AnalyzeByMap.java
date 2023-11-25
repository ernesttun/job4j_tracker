package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double count = 0;
        double sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            Label label = new Label(pupil.name(), sum / pupil.subjects().size());
            labels.add(label);
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
//                String subjectName = subject.name();
//                int score = subject.score();
//                map.put(subjectName, map.getOrDefault(subjectName, 0) + score);
                map.merge(subject.name(), subject.score(), (oldValue, newValue) -> oldValue + subject.score());
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String subjectName = entry.getKey();
            int totalScore = entry.getValue();
            int pupilCount = pupils.size();
            int averageScore = totalScore / pupilCount;
            Label label = new Label(subjectName, averageScore);
            labels.add(label);
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            Label label = new Label(pupil.name(), sum);
            labels.add(label);
            labels.sort(Comparator.naturalOrder());
        }
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), (oldValue, newValue) -> oldValue + subject.score());
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String subjectName = entry.getKey();
            int totalScore = entry.getValue();
            Label label = new Label(subjectName, totalScore);
            labels.add(label);
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
