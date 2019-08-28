import java.util.List;

public class HeLuoPushCallbackDTO {

    /**
     * 消息ID
     */
    private String messageId;

    /**
     * 推单失败的结果
     */
    List<HeLuoPushFailedResult> failedResults;

    /**
     * 推单成功的结果
     */
    List<HeLuoPushSuccessResult> successResults;
}
