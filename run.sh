#!/bin/bash
# Script to run Bai07 and verify Checkstyle
# Note: This will fail if Violation.java is present due to Checkstyle violations.
mvn clean verify
mvn exec:java -Dexec.mainClass="banksystem.Main"
