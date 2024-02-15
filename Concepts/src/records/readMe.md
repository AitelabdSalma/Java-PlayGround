# ArticlesRecord Example

This is a simple Java project that demonstrates the usage of a `record` named `ArticlesRecord`. Records are a feature introduced in Java 16 to provide a concise way of declaring classes primarily intended for holding data.

## Contents

1. [Overview](#overview)
2. [Usage](#usage)
3. [How to Run](#how-to-run)

## Overview

The `ArticlesRecord` is defined in the `records` package and consists of a single field named `name`. Records automatically generate methods like `toString()`, `equals()`, and `hashCode()`, making it easier to work with simple data-holding classes.

## Usage

Here's an example of how to use the `ArticlesRecord`:

```java
package records;

public class MainClass {
    public static void main(String[] args) {
        // Creating an instance of ArticlesRecord
        ArticlesRecord article = new ArticlesRecord("Sample Article");

        // Accessing the fields
        System.out.println("Article Name: " + article.name());

        // Automatically generated toString
        System.out.println("Article Details: " + article);
    }
}
