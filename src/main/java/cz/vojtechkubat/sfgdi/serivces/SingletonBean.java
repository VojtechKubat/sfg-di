package cz.vojtechkubat.sfgdi.serivces;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println(">>> creating a SINGLETON bean <<<");
    }

    public String getMyScope() {
        return ">>> singleton <<<";
    }
}
