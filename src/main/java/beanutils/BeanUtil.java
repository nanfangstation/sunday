package beanutils;

import org.junit.AfterClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lydia
 * @since 2020-05-11 17:51
 **/
public class BeanUtil {

    // 测试次数
    private static List<Integer> testTimes = Arrays.asList(100, 1000, 10_000, 100_000, 1_000_000);
    // 测试结果以 markdown 表格的形式输出
    private static StringBuilder resultBuilder = new StringBuilder("|实现|100|1,000|10,000|100,000|1,000,000|\n").append("|----|----|----|----|----|----|\n");

    @Test
    public void testStaticCglibBeanCopierPropertiesCopier() throws Exception {
        List<PropertiesCopier> propertiesCopiers = new ArrayList<>();
        StaticCglibBeanCopierPropertiesCopier one = new StaticCglibBeanCopierPropertiesCopier();
        SpringBeanUtilsPropertiesCopier two = new SpringBeanUtilsPropertiesCopier();
        CglibBeanCopierPropertiesCopier three = new CglibBeanCopierPropertiesCopier();
        ApacheBeanUtilsPropertiesCopier four = new ApacheBeanUtilsPropertiesCopier();
        ApachePropertyUtilsPropertiesCopier five = new ApachePropertyUtilsPropertiesCopier();
//        propertiesCopiers.add(one);
//        propertiesCopiers.add(two);
//        propertiesCopiers.add(three);
//        propertiesCopiers.add(four);
//        propertiesCopiers.add(five);
        test(four);
    }

    public void test(PropertiesCopier propertiesCopier) throws Exception {
        String name = propertiesCopier.getClass().getSimpleName().replace("PropertiesCopier", "");
        resultBuilder.append("|").append(name).append("|");
        User source = new User(1, "Lydia");
        Object target = new User();
        // 预热一次
        propertiesCopier.copyProperties(source, target);
        for (Integer time : testTimes) {
            long start = System.nanoTime();
            for (int i = 0; i < time; i++) {
                propertiesCopier.copyProperties(source, target);
            }
            resultBuilder.append((System.nanoTime() - start) / 1_000_000D).append("|");
        }
        resultBuilder.append("\n");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("测试结果：");
        System.out.println(resultBuilder);
    }

    class User {
        private Integer id;
        private String name;

        public User() {
        }

        public User(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
