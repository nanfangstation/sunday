package beanutils;

import net.sf.cglib.beans.BeanCopier;

/**
 * @author Lydia
 * @since 2020-05-11 18:33
 **/
public class CglibBeanCopierPropertiesCopier implements PropertiesCopier {

    @Override
    public void copyProperties(Object source, Object target) throws Exception {
        final net.sf.cglib.beans.BeanCopier copier = BeanCopier.create(source.getClass(), target.getClass(), false);
        copier.copy(source, target, null);
    }
}
