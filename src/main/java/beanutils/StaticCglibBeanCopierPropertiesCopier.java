package beanutils;

import org.springframework.cglib.beans.BeanCopier;

/**
 * @author Lydia
 * @since 2020-05-11 18:25
 **/
public class StaticCglibBeanCopierPropertiesCopier implements PropertiesCopier {

    private static BeanCopier copier = BeanCopier.create(BeanUtil.User.class, BeanUtil.UserCopy.class, false);

    @Override
    public void copyProperties(Object source, Object target) throws Exception {
        copier.copy(source, target, null);
    }
}
