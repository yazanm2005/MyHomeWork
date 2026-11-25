package service;

import model.AnalysisResult;

public class CallAnalyzer {

    public AnalysisResult analyze(String transcript) {
        String text = transcript.toLowerCase();

        String sentiment = detectSentiment(text);
        String issue = detectIssue(text);
        boolean resolved = detectResolution(text);

        return new AnalysisResult(sentiment, issue, resolved);
    }

    private String detectSentiment(String text) {
        if (containsAny(text, "angry", "bad", "cold", "late", "problem", "complaint")) {
            return "NEGATIVE";
        }

        if (containsAny(text, "good", "great", "thank", "excellent")) {
            return "POSITIVE";
        }

        return "NEUTRAL";
    }

    private String detectIssue(String text) {
        if (containsAny(text, "cold food", "cold meal", "cold")) {
            return "COLD_FOOD";
        }

        if (containsAny(text, "late", "delay", "delayed")) {
            return "DELIVERY_DELAY";
        }

        if (containsAny(text, "wrong order", "wrong food")) {
            return "WRONG_ORDER";
        }

        return "OTHER";
    }

    private boolean detectResolution(String text) {
        return containsAny(text, "replaced", "replacement", "refund",
                "resolved", "fixed", "problem solved");
    }

    private boolean containsAny(String text, String... words) {
        for (String word : words) {
            if (text.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
