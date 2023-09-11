package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < evenElements.size(); i++) {
            Character character = evenElements.pollFirst();
            if (i % 2 == 0) {
                builder.append(character);
            }
            evenElements.addLast(character);
        }
        return builder.toString();
    }

    private String getDescendingElements() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < descendingElements.size(); i++) {
            Character character = descendingElements.pollLast();
            builder.append(character);
            descendingElements.addFirst(character);
        }
        return builder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }


}
