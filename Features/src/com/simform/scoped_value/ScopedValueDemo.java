package com.simform.scoped_value;

public class ScopedValueDemo {

    private static final ScopedValue<String> value = ScopedValue.newInstance();

    void main() {
        ScopedValue.where(value, "Hello, How are you?").run(this::firstMethod);
    }

    public void firstMethod() {
        System.out.println(value.get());
        ScopedValue.where(value, "I am fine, Thank you. How are you?").run(this::secondMethod);
    }

    public void secondMethod() {
        System.out.println(value.get());
        ScopedValue.where(value, "I am fine too, Thanks for asking!").run(this::thirdMethod);
    }

    public void thirdMethod() {
        System.out.println(value.get());
    }
}
