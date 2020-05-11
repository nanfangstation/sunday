package beanutils;

/**
 * @author Lydia
 * @since 2020-05-11 18:28
 **/
public class ApachePropertyUtilsPropertiesCopier implements PropertiesCopier {

    @Override
    public void copyProperties(Object source, Object target) throws Exception {
        org.apache.commons.beanutils.PropertyUtils.copyProperties(target, source);
    }
}
