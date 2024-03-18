package handlers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MethodWithPriority {
    private final Runnable method;
    private final int priority;

    public MethodWithPriority(Runnable method, int priority) {
        this.method = method;
        this.priority = priority;
    }

    public Runnable getMethod() {
        return method;
    }

    public int getPriority() {
        return priority;
    }
}

public class MethodExecutor {
    private final List<MethodWithPriority> methods;

    public MethodExecutor() {
        methods = new ArrayList<>();
    }

    public void addMethod(Runnable method, int priority) {
        methods.add(new MethodWithPriority(method, priority));
        methods.sort(Comparator.comparingInt(MethodWithPriority::getPriority));
    }

    public void removeMethod(Runnable method) {
        methods.removeIf(methodWithPriority -> methodWithPriority.getMethod().equals(method));
    }

    public void executeMethodsInOrder() {
        for (MethodWithPriority methodWithPriority : methods) {
            methodWithPriority.getMethod().run();
        }
    }

    public void clearMethods() {
        methods.clear();
    }
}

