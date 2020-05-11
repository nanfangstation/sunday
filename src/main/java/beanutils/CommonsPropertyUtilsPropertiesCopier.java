package beanutils;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * @author Lydia
 * @since 2020-05-11 18:28
 **/
public class CommonsPropertyUtilsPropertiesCopier implements PropertiesCopier {

    @Override
    public void copyProperties(Object source, Object target) throws Exception {
        PropertyUtils.copyProperties(target, source);
    }
}
