package com.vladproduction.string_templates;

import java.util.Locale;

import static java.lang.StringTemplate.STR;
import static java.util.FormatProcessor.FMT;

public class Main {
    public static void main(String[] args) {
        var product = new Product(1L, "Laptop", 1000.0);

        //concatenation using plus operator:
        var string1 = "Product [id: " + product.productId() + ", name: " + product.name() + ", price: " + product.price() + "]";
        System.out.println("1)plus operator:");
        System.out.println(string1);

        //concatenation using StringBuilder:
        var string2 = new StringBuilder()
                .append("Product [id: ")
                .append(product.productId())
                .append(", name: ")
                .append(product.name())
                .append(", price: ")
                .append(product.price())
                .append("]")
                .toString();
        System.out.println("2)StringBuilder:");
        System.out.println(string2);

        //concatenation using String.format:
        var string3 = String.format(Locale.UK, "Product [id: %s, name: %s, price: %.2f]",
                product.productId(), product.name(), product.price());
        System.out.println("3)String.format:");
        System.out.println(string3);

        //using STR:
        var string4 = STR."Product [id: \{product.productId()}, name: \{product.name()}, price: \{product.price()}]";
        System.out.println("4)using STR:");
        System.out.println(string4);

        //using FMT:
        var string5 = FMT."Product [id: \{product.productId()}, name: \{product.name()}, price: %.2f\{product.price()}]";
        System.out.println("5)using FMT:");
        System.out.println(string5);


    }
}
