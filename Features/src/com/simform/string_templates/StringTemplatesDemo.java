package com.simform.string_templates;

public class StringTemplatesDemo {

    public static void main(String[] args) {
        String title = "Java 21 Features";
        String heading = "Important Features";
        String paragraph = "This post contains new java 21 features";

        String htmlCode = STR."""
                <html>
                    <head>
                        <title>\{title}</title>
                    </head>
                    <body>
                        <h1>\{heading}</h1>
                        <p>\{paragraph}</p>
                    </body>
                </html>
                """;

        System.out.println(htmlCode);

        int x = 10, y = 20;
        System.out.println(STR."\{x} + \{y} = \{x + y}");
    }
}
