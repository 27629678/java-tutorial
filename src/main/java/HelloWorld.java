import org.xoyo.base.GenericEntity;
import org.xoyo.concrent.BigDataProcessor;
import org.xoyo.encrypt.EncryptRunner;
import org.xoyo.exception.ExceptionRunner;
import org.xoyo.fastjson.FastJsonRunner;
import org.xoyo.map.MapRunner;
import org.xoyo.oop.MessageDispatcher;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;
import java.util.*;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
//        System.out.println("Hello, world.");
//
        FastJsonRunner fastJson = new FastJsonRunner();
        fastJson.run();
//
//        ExceptionRunner exception = new ExceptionRunner();
//        exception.run();
//
//        MapRunner map = new MapRunner();
//        map.run();
//
//        EncryptRunner encrypt = new EncryptRunner();
//        encrypt.run();
//
//        MessageDispatcher dispatcher = new MessageDispatcher();
//        dispatcher.run();
//
//        String lh = "biSuggestCount";
//
//        System.out.println(lh.equalsIgnoreCase("bisuggestCount"));
//
//        System.out.println("success:" + (5 - 3 - 5));
//
//
//        BigDecimal rate = BigDecimal.valueOf(5);
//        rate = rate.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
//
//        System.out.println(rate);

//        TestEntiry entity = new TestEntiry();
//        entity.setModel("hello, world");
//        entity.setData(12L);
//        entity.foo();
//
//
//        int h = entity.hashCode();
//
//        System.out.println(h);
//
//        int t = h >>> 16;
//
//        System.out.println(t);
//
//        System.out.println(h ^ t);
//
        int cap = 66;

        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;

        System.out.println((n < 0) ? 1 : (n >= 65536) ? 65536 : n + 1);
    }

}
