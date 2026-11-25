import model.Call;
import model.AnalysisResult;
import service.CallManager;

public class Main {
    public static void main(String[] args) {
        Call call = new Call(
                1,
                "Customer 1",
                "My food arrived cold and the delivery was late. "
                        + "The operator offered a replacement meal."
        );

        CallManager manager = new CallManager();
        AnalysisResult result = manager.analyzeCall(call);

        manager.displayCall(call, result);
    }
}
