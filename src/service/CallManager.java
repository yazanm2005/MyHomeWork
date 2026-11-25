package service;

import model.Call;
import model.AnalysisResult;

public class CallManager {
    private final CallAnalyzer analyzer = new CallAnalyzer();

    public AnalysisResult analyzeCall(Call call) {
        return analyzer.analyze(call.getTranscript());
    }

    public void displayCall(Call call, AnalysisResult result) {
        System.out.println("\n--- Call Analysis ---");
        System.out.println("Call ID: " + call.getId());
        System.out.println("Customer: " + call.getCustomer());
        System.out.println(result);
    }
}
