package example;

import example.module.ModuleBinder;
import example.router.IndexController;
import example.router.SaveController;
import com.google.inject.Module;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;
import io.bootique.log.BootLogger;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Module module = binder -> JerseyModule.extend(binder).addResource(IndexController.class)
          .addResource(SaveController.class);
        Bootique.app(args).module(module).module(ModuleBinder.class).bootLogger(new BootLogger() {
            @Override
            public void trace(Supplier<String> arg0) {
                // ...
            }

            @Override
            public void stdout(String arg0) {
                // ...
            }

            @Override
            public void stderr(String arg0, Throwable arg1) {
                // ...
            }

            @Override
            public void stderr(String arg0) {
                // ...
            }
        }).autoLoadModules().exec();
    }

}
