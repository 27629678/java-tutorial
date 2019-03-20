import org.xoyo.encrypt.EncryptRunner;
import org.xoyo.exception.ExceptionRunner;
import org.xoyo.fastjson.FastJsonRunner;
import org.xoyo.map.MapRunner;
import org.xoyo.oop.MessageDispatcher;

import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {

    private enum BIPurchaseItemType {
        INVALID("无效类目"),
        FOOD("食品类目"),
        OUTER_MATERIAL("外包材类目"),
        OTHERS("其它类目");

        private final String description;
        BIPurchaseItemType(String desc) {
            description = desc;
        }

        public String getDescription() { return description; }
    }

    public static void main(String[] args) {
        System.out.println("Hello, world.");

        FastJsonRunner fastJson = new FastJsonRunner();
        fastJson.run();

        ExceptionRunner exception = new ExceptionRunner();
        exception.run();

        MapRunner map = new MapRunner();
        map.run();

        EncryptRunner encrypt = new EncryptRunner();
        encrypt.run();

        MessageDispatcher dispatcher = new MessageDispatcher();
        dispatcher.run();
    }

}
