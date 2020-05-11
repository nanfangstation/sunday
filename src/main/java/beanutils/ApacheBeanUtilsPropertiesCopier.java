package beanutils;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author Lydia
 * @since 2020-05-11 18:28
 **/
public class ApacheBeanUtilsPropertiesCopier implements PropertiesCopier {

    @Override
    public void copyProperties(Object source, Object target) throws Exception {
        org.apache.commons.beanutils.BeanUtils.copyProperties(target, source);
    }
}
