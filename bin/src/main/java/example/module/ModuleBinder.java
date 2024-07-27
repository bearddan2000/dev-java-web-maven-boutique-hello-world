package example.module;

import example.service.HelloService;
import example.service.HelloServiceImpl;
import com.google.inject.Binder;
import com.google.inject.Module;

public class ModuleBinder implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(HelloService.class).to(HelloServiceImpl.class);
    }

}
