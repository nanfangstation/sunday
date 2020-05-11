package beanutils;

import org.springframework.beans.BeanUtils;

/**
 * @author Lydia
 * @since 2020-05-11 18:27
 **/
public class SpringBeanUtilsPropertiesCopier implements PropertiesCopier {

    @Override
    public void copyProperties(Object source, Object target) throws Exception {
        BeanUtils.copyProperties(source, target);
    }
}
