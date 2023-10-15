package cz.vojtechkubat.sfgdi.serivces;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println(">>> creating a PROTOTYPE bean <<<");
    }

    public String getMyScope() {
        return ">>> prototype <<<";
    }
}
