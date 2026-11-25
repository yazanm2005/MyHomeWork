package model;

public class AnalysisResult {
    private String sentiment;
    private String issue;
    private boolean resolved;

    public AnalysisResult(String sentiment, String issue, boolean resolved) {
        this.sentiment = sentiment;
        this.issue = issue;
        this.resolved = resolved;
    }

    public String getSentiment() {
        return sentiment;
    }

    public String getIssue() {
        return issue;
    }

    public boolean isResolved() {
        return resolved;
    }

    @Override
    public String toString() {
        return "Sentiment: " + sentiment +
                "\nIssue: " + issue +
                "\nResolved: " + (resolved ? "YES" : "NO");
    }
}
