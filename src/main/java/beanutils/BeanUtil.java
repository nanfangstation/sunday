package beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Lydia
 * @since 2020-05-11 17:51
 **/
@RunWith(Parameterized.class)
public class BeanUtil {

    @Parameterized.Parameter(0)
    public PropertiesCopier propertiesCopier;
    // 测试次数
    private static List<Integer> testTimes = Arrays.asList(100, 1000, 10_000, 100_000, 1_000_000);
    // 测试结果以 markdown 表格的形式输出
    private static StringBuilder resultBuilder = new StringBuilder("|实现|100|1,000|10,000|100,000|1,000,000|\n").append("|----|----|----|----|----|----|\n");

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> params = new ArrayList<>();
        params.add(new Object[]{new StaticCglibBeanCopierPropertiesCopier()});
        params.add(new Object[]{new CglibBeanCopierPropertiesCopier()});
        params.add(new Object[]{new SpringBeanUtilsPropertiesCopier()});
        params.add(new Object[]{new CommonsPropertyUtilsPropertiesCopier()});
        params.add(new Object[]{new CommonsBeanUtilsPropertiesCopier()});
//        params.add(new Object[]{new CglibPropertiesCopier()});
        return params;
    }

    @Before
    public void setUp() throws Exception {
        String name = propertiesCopier.getClass().getSimpleName().replace("PropertiesCopier", "");
        resultBuilder.append("|").append(name).append("|");
    }

    @Test
    public void copyProperties() throws Exception {
        User source = new User(1, "test1");
        UserCopy target = new UserCopy();
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

    class UserCopy {
        private Integer id;
        private String name;

        public UserCopy() {
        }

        public UserCopy(Integer id, String name) {
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
