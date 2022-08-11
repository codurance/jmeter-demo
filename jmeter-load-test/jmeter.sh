#!/usr/bin/env bash

REPORT_NAME=$(date +%s)
echo "Results will be found at /reports/$REPORT_NAME"
jmeter -nt main.jmx -q main.properties -fl out/report.csv -eo reports/$REPORT_NAME
echo "Load test finished"
pwd
TARGET_TIME=`jq '.["Request2 POST"].meanResTime' reports/$REPORT_NAME/statistics.json`

echo "Mean Response Time $TARGET_TIME"
