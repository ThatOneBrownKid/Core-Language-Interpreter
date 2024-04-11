# Core Language Interpreter with Garbage Collection

## Overview

This project represents the culmination of a series of projects (1 through 5) aimed at developing a Core language interpreter in Java, with the final addition of garbage collection functionality. The Core language is a simplified programming language designed for educational purposes, featuring a subset of constructs common in languages like C and Java. This README details the final project, incorporating elements from all preceding projects, including the scanner, parser, executor, function handling, and garbage collection.

## Getting Started

### Requirements

- Java Development Kit (JDK) compatible with stdlinux environment
- Basic knowledge of Java and command-line operations

### Installation

1. Ensure Java is installed and properly configured on your system.
2. Clone the project repository or download the project zip file and extract it.
3. Navigate to the project directory in your terminal.

### Compilation

Run the following command in the terminal to compile the project:

```shell
javac *.java
```

## Usage

To execute the interpreter with a Core program, you will need two files:
- A `.code` file containing the Core language program.
- A `.data` file containing input data for the program.

Run the interpreter using the command:

```shell
java Main <path_to_code_file> <path_to_data_file>
```

## Project Components

### Project 1: Core Scanner

The scanner reads a text file containing Core language code and tokenizes it, preparing it for parsing.

### Project 2: Core Parser

The parser analyzes the tokens generated by the scanner against the Core language grammar, generating a parse tree.

### Project 3: Core Interpreter

The executor walks the parse tree, executing the Core program. It handles variable declarations, assignments, conditions, loops, and input/output operations.

### Project 4: Function Calls

Modified the Core interpreter to handle function definitions and calls, including recursive functions. Function parameters are passed by sharing.

### Project 5: Garbage Collection

Extended the interpreter to include garbage collection, specifically reference counting for array objects. It tracks the number of references to each array object and identifies when objects are no longer reachable, marking them for garbage collection.

## Input/Output

- Input: The interpreter reads from a `.code` file for the program and a `.data` file for input values.
- Output: The interpreter prints execution results to stdout. Error messages are also printed to stdout.

## Error Handling

The interpreter implements comprehensive error checking, including syntax and runtime errors. Specific runtime errors related to garbage collection and array usage are highlighted and cause the program to halt with an appropriate error message.

## Testing

The project includes a set of test cases for verifying the functionality of the scanner, parser, executor, and garbage collection. The `tester.sh` script is provided to automate the testing process. This script was written by OSU Professor Timothy Carpenter. In order to invoke this script you might need to give it permission by doing the following:

```shell
chmod 700 tester.sh
```

And then to rin it simply run:

```shell
./tester.sh
```