package beanutils;

import net.sf.cglib.beans.BeanCopier;

/**
 * @author Lydia
 * @since 2020-05-11 18:33
 **/
public class CglibPropertiesCopier implements PropertiesCopier {

    BeanCopier copier = BeanCopier.create(BeanUtil.User.class, BeanUtil.UserCopy.class, false);

    @Override
    public void copyProperties(Object source, Object target) throws Exception {
        copier.copy(source, target, null);
    }
}
