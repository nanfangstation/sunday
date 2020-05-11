package beanutils;

import net.sf.cglib.beans.BeanCopier;

/**
 * @author Lydia
 * @since 2020-05-11 18:25
 **/
public class StaticCglibBeanCopierPropertiesCopier implements PropertiesCopier {

    final net.sf.cglib.beans.BeanCopier copier = BeanCopier.create(BeanUtil.User.class, BeanUtil.User.class, false);

    @Override
    public void copyProperties(Object source, Object target) {
        copier.copy(source, target, null);
    }
}
