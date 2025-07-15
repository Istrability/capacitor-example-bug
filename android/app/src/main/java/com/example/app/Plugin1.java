package com.example.app;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "MyCustomPlugin") // Choose a name for your plugin
public class Plugin1 extends Plugin {

    @PluginMethod()
    public void nonEmptyReturn(PluginCall call) {
        System.out.println("Plugin1.nonEmptyReturn called");

        JSObject ret = new JSObject();
        call.resolve(ret);
    }

    @PluginMethod()
    public void emptyReturn(PluginCall call) {
        System.out.println("Plugin1.emptyReturn called");

        call.resolve();
    }

}