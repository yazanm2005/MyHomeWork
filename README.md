# Basic Call Center Analytics System

A simple Java application developed for the Software Engineering assignment.

## What the system does

The program simulates a basic call center analytics system. It receives a customer call transcript and performs simple rule-based analysis to identify:

- Customer sentiment
- Customer issue
- Resolution status

## Example

Input transcript:

"My food arrived cold and the delivery was late. The operator offered a replacement meal."

Example result:

```
Sentiment: NEGATIVE
Issue: COLD_FOOD
Resolved: YES
```

## Project Structure

```
src/
├── Main.java
├── model/
│   ├── Call.java
│   └── AnalysisResult.java
└── service/
    ├── CallAnalyzer.java
    └── CallManager.java
```

## Technologies

- Java
- Git
- GitHub

## Development Process

The project uses Git for version control. Development was performed on a separate `develop` branch and then submitted to `main` through a Pull Request.

## Relation to the Original Project

This is the basic Java implementation of the call center analytics idea. The larger project uses AWS serverless services and AI-based analysis, while this assignment version focuses on the core functionality using Java.
