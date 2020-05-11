package beanutils;

import org.springframework.cglib.beans.BeanCopier;

/**
 * @author Lydia
 * @since 2020-05-11 18:24
 **/
public class CglibBeanCopierPropertiesCopier implements PropertiesCopier {

    @Override
    public void copyProperties(Object source, Object target) throws Exception {
        BeanCopier copier = BeanCopier.create(source.getClass(), target.getClass(), false);
        copier.copy(source, target, null);
    }
}
